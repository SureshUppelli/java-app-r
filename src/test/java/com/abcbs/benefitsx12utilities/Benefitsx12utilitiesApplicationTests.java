package com.abcbs.benefitsx12utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.xlate.edi.internal.schema.SchemaUtils;
import io.xlate.edi.schema.EDISchemaException;
import io.xlate.edi.schema.Schema;
import io.xlate.edi.schema.SchemaFactory;
import io.xlate.edi.stream.EDIInputFactory;
import io.xlate.edi.stream.EDIStreamEvent;
import io.xlate.edi.stream.EDIStreamException;
import io.xlate.edi.stream.EDIStreamReader;
import io.xlate.edi.stream.EDIStreamValidationError;

@SpringBootTest
class Benefitsx12utilitiesApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private Schema loadX12FuncAckSchema() throws EDISchemaException {
        SchemaFactory schemaFactory = SchemaFactory.newFactory();
        URL schemaLocation = getClass().getResource("/x12/EDISchema997.xml");

        return schemaFactory.createSchema(schemaLocation);
    }


	@Test
	void testElementErrorSequence() throws EDISchemaException, EDIStreamException, IllegalStateException {
		EDIInputFactory factory = EDIInputFactory.newFactory();
	/*	InputStream stream = new ByteArrayInputStream((""
				+ "ISA*00*          *00*          *ZZ*ReceiverID     *ZZ*Sender         *050812*1953*^*00501*508121953*0*P*:~"
				+ "GS*FA*ReceiverDept*SenderDept*BAD_DATE*295335*000005*X*005010X230~"
				+ "ST*997*0001~"
				+ "AK1*<NOT_IN_CODESET>*000001~" 
				+ "AK9*R*1*1*0~" + "AK9*~" + "SE*8*0001~"
				+ "GE*1*100^0001^111*:~" 
				+ "IEA*1*508121953~").getBytes());*/
		//EB*B**47{48{50{51{52***27*0*****Y~
		
		InputStream stream = new ByteArrayInputStream((""
				+ "ISA*00*          *00*          *ZZ*ReceiverID     *ZZ*Sender         *050812*1953*{*00501*508121953*0*P*:~"
				+ "GS*FA*ReceiverDept*SenderDept*BAD_DATE*295335*000005*X*005010X230~" 
				+ "ST*997*0001~"
				+ "AK1*<NOT_IN_CODESET>*000001~" 
				+ "AK9*R*1*1*0~" + "AK9*~" + "SE*8*0001~"
				+ "EQ*1**47{48{50{51{52***27*0*****Y~" 
				+ "IEA*1*508121953~").getBytes());
		@SuppressWarnings("resource")
		EDIStreamReader reader = factory.createEDIStreamReader(stream);
		assertEquals(EDIStreamEvent.START_INTERCHANGE, reader.next());
		reader.setControlSchema(SchemaUtils.getControlSchema(reader.getStandard(), reader.getVersion()));

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("ISA", reader.getText());
		assertEquals(EDIStreamEvent.START_GROUP, reader.nextTag());
		assertEquals("GROUP", reader.getText());
		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("GS", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS01
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS02
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS03

		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS04
		assertEquals("BAD_DATE", reader.getText());

		// GS05 invalid time
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.INVALID_TIME, reader.getErrorType());
		assertEquals("295335", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS05

		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS06
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS07
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GS08

		// GS04 BAD_DATE (known bad only after GS08 version is set)
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals("373", reader.getReferenceCode());
		assertEquals(EDIStreamValidationError.INVALID_DATE, reader.getErrorType());
		assertEquals("BAD_DATE", reader.getText());
		assertEquals(2, reader.getLocation().getSegmentPosition());
		assertEquals("GS", reader.getLocation().getSegmentTag());
		assertEquals(4, reader.getLocation().getElementPosition());
		assertEquals(1, reader.getLocation().getElementOccurrence());
		assertEquals(-1, reader.getLocation().getComponentPosition());

		assertEquals(EDIStreamEvent.START_TRANSACTION, reader.nextTag());
		reader.setTransactionSchema(loadX12FuncAckSchema());

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("ST", reader.getText());

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("AK1", reader.getText());
		// AK01 <NOT_IN_CODESET>
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.DATA_ELEMENT_TOO_LONG, reader.getErrorType());
		assertEquals("<NOT_IN_CODESET>", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.INVALID_CODE_VALUE, reader.getErrorType());
		assertEquals("<NOT_IN_CODESET>", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // AK01

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("AK9", reader.getText());

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("AK9", reader.getText());

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("SE", reader.getText());

		// assertEquals(EDIStreamEvent.END_TRANSACTION, reader.nextTag());

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("EQ", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GE01
		
		//assertEquals(EDIStreamEvent.START_GROUP, reader.next());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		
		System.out.println(reader.getLocation().getElementOccurrence());
		
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		//assertEquals(EDIStreamValidationError.CONTROL_REFERENCE_MISMATCH, reader.getErrorType());
		//assertEquals("AGAIN!", reader.getText()); // data association with error
		//System.out.println(reader.getTransactionType());
		assertEquals("47", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("48", reader.getText());
		System.out.println(reader.getLocation().getElementOccurrence());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		
		assertEquals("50", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("51", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("52", reader.getText());
		System.out.println(reader.getLocation().getElementOccurrence());
		
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("", reader.getText());
		//System.out.println(reader.getLocation().getElementOccurrence());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("", reader.getText());
		System.out.println(reader.getLocation().getElementOccurrence());
		// GE02 <TOO_LONG_AND_NOT_NUMERIC>
	/*	assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.DATA_ELEMENT_TOO_LONG, reader.getErrorType());
		assertEquals("<TOO_LONG_AND_NOT_NUMERIC>", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.INVALID_CHARACTER_DATA, reader.getErrorType());
		assertEquals("<TOO_LONG_AND_NOT_NUMERIC>", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next()); // GE02
		assertEquals(EDIStreamValidationError.CONTROL_REFERENCE_MISMATCH, reader.getErrorType());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // GE02
		assertEquals("28", reader.getReferenceCode());

		// GE02 - 2nd occurrence
		assertEquals(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.TOO_MANY_REPETITIONS, reader.getErrorType());
		assertEquals("0001", reader.getText());

		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.CONTROL_REFERENCE_MISMATCH, reader.getErrorType());
		assertEquals("0001", reader.getText());

		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("0001", reader.getText());

		// GE02 - 3rd occurrence plus data error
		assertEquals(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR, reader.next());
		assertEquals("28", reader.getReferenceCode());
		assertEquals("AGAIN!", reader.getText()); // data association with error
		assertEquals(EDIStreamValidationError.TOO_MANY_REPETITIONS, reader.getErrorType());
		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.INVALID_CHARACTER_DATA, reader.getErrorType());
		assertEquals("AGAIN!", reader.getText()); // data association with error

		assertEquals(EDIStreamEvent.ELEMENT_DATA_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.CONTROL_REFERENCE_MISMATCH, reader.getErrorType());
		assertEquals("AGAIN!", reader.getText()); // data association with error

		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next());
		assertEquals("AGAIN!", reader.getText()); // here comes the element data
													// event

		// GE03 too many elements
		assertEquals(EDIStreamEvent.ELEMENT_OCCURRENCE_ERROR, reader.next());
		assertEquals(EDIStreamValidationError.TOO_MANY_DATA_ELEMENTS, reader.getErrorType());*/
		//assertEquals("", reader.getText()); // data association with error

		// assertEquals(EDIStreamEvent.END_GROUP, reader.nextTag());

		assertEquals(EDIStreamEvent.START_SEGMENT, reader.nextTag());
		assertEquals("IEA", reader.getText());
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // IEA01
		assertEquals(EDIStreamEvent.ELEMENT_DATA, reader.next()); // IEA02
		assertEquals(EDIStreamEvent.END_SEGMENT, reader.next()); // IEA
		assertEquals(EDIStreamEvent.END_INTERCHANGE, reader.next());
	}

}
