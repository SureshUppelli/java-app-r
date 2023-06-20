
package com.abcbs.benefitsx12utilities.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.abcbs.benefitsedix12objects.models.Edi270;
import com.abcbs.benefitsedix12objects.models.request.ST;

import io.xlate.edi.stream.EDIInputFactory;
import io.xlate.edi.stream.EDIStreamEvent;
import io.xlate.edi.stream.EDIStreamReader;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Service class containing parser for raw x12. Use of this class
 *          requires the import of edix12objects.jar from Maven.
 */
/*
 * Document modifications here:
 */
@Service
public class BenefitsEdiRequestHandler {

	@Autowired
	private Environment env;

	@Autowired
	private BenefitsEdiRequestMapper mapper;

	/**
	 * Parsing method accepts raw x12 as string. An object is populated from the x12
	 * loops and segments following current edi structure standards. This parser
	 * uses the StAEDI API to allow for x12 parsing that follows a pull processing
	 * flow similar the StAX. For more details see:
	 * 
	 * https://github.com/xlate/staedi
	 * 
	 * notes about composite and repetition 
	 * http://www.rdpcrystal.com/whats-the-repetition-separator-character-in-5010-x12/
	 *  
	 * @param edi
	 * @return
	 * @throws IOException
	 * 
	 * 
	 * You should not need to handle that actually. You should be receiving 3 separate ELEMENT_DATA events, each with the occurrence specified in reader.getLocation().getElementOccurrence()
	 */
	public Edi270 parse270Edi(String edi) throws IOException {
		Edi270 edi270 = new Edi270();
		EDIInputFactory factory = EDIInputFactory.newFactory();
		factory.setProperty(EDIInputFactory.EDI_VALIDATE_CONTROL_CODE_VALUES, false);
		InputStream stream = new ByteArrayInputStream(edi.getBytes());
		EDIStreamReader reader = factory.createEDIStreamReader(stream);
		EDIStreamEvent event;
		String currentSegment = "";
		String currentData = "";
		String parentLoop = "";
//		String currentLoop = "";
		List<String> dataList = new ArrayList<String>();
		
	//	List<String> repList = new ArrayList<String>();
		ST currentst = new ST();
		 
		int hlCounter = 0;
		int stCounter = 0;
		int eqCounter = 0;
		int loopCounter=0;
		int dtpLoopCounter=0;
		int refLoopCounter=0;					
		int trnLoopCounter=0;
		boolean iscomposite = false;
		List<ArrayList<String> > aList = new ArrayList<ArrayList<String> >();
		
		ArrayList<String> compositeList = new ArrayList<String>();
		int repetitionCounter=0;
		
//		int elementCounter = 0;
		Map<String, String> loopMap = new HashMap<String, String>();
		loopMap.put("PARENT", "");
		loopMap.put("CURRENT", "");
		//System.out.println(reader.getDelimiters());
		try {

			while (reader.hasNext()) {
			  switch (reader.next()) {
				case START_INTERCHANGE:
					String standard = reader.getStandard();
					String[] version = reader.getVersion();
					//delimiters= reader.getDelimiters();
//					System.out.println(EDIStreamConstants.Delimiters.REPETITION );
//					 for (String key : delimiters.keySet()) {
//						    if (key.contains("repetition")) {
//						    	repetitionSeparator1=delimiters.get(key);
//						    	break;
//						    	
//						    }
//					 }					 
					 
					break;
				case START_SEGMENT:
					currentSegment = reader.getText();
			
					if (currentSegment.equals("ST")) {
						stCounter++;
						currentst = new ST();
					}
					if (currentSegment.equals("SE"))
						hlCounter = 0;
					if (currentSegment.equals("EQ")) {
						
						eqCounter++;
						if(parentLoop.equals("Loop2000C"))
							parentLoop = "Loop2110C";						
					}
					dataList = new ArrayList<String>();
					break;
				case END_SEGMENT:
					if(currentSegment.equals("HL")){
						hlCounter++;
						parentLoop = getLoop(dataList);
					}
					if (currentSegment.equals("NM1") ) {						
						refLoopCounter=0;					
						trnLoopCounter=0;
					}
					
					if (currentSegment.equals("REF") ) {						
						refLoopCounter++;
						loopCounter=refLoopCounter;
					}
					if ( currentSegment.equals("TRN")) {						
						trnLoopCounter++;
						loopCounter=trnLoopCounter;
					}
					if ( currentSegment.equals("DTP")) {
						 
						dtpLoopCounter++;
						loopCounter=dtpLoopCounter;
					}
					
					if("EQ".equals(currentSegment)) {
						if (repetitionCounter > 1) {
						   loopCounter=repetitionCounter;
						}else {
							loopCounter=1;
						}
					
					}
					
	//				elementCounter = 0;
					edi270 = updateSegment270(edi270, stCounter, eqCounter, hlCounter, currentSegment, dataList,
							compositeList,aList, parentLoop, currentst,loopCounter);
					
					loopCounter=0;
					repetitionCounter=0;
					aList = new ArrayList<ArrayList<String> >();
					compositeList = new ArrayList<String>();
					
					if(currentSegment.equals("HL") || currentSegment.equals("NM1") || currentSegment.equals("EQ")){					 
						refLoopCounter=0;
						trnLoopCounter=0;
						dtpLoopCounter=0;						 
					}					
					
					break;
				case START_COMPOSITE:					
					if (currentSegment.equals("EQ") || currentSegment.equals("HI")) {
						compositeList = new ArrayList<String>();
						iscomposite = true;
					}
					break;
				case END_COMPOSITE:
					if (currentSegment.equals("EQ") ||currentSegment.equals("HI"))
						if (compositeList != null && compositeList.size() > 0) {
							aList.add(compositeList);	
						}
					iscomposite = false;
					break;
					 
				case ELEMENT_DATA:					 
					 
		//			elementCounter++;
					currentData = reader.getText();
				//	System.out.println(reader.getTextCharacters());
					
					if("EQ".equals(currentSegment)) {
						if (reader.getLocation().getElementOccurrence() > 1) {
						//	isRepetitionFound=true;
							repetitionCounter =reader.getLocation().getElementOccurrence() ;
						}
					}
					
					if (currentSegment.equals("EQ") || currentSegment.equals("HI")) {						
 				       if (iscomposite ) {
							compositeList.add(currentData);
                       }else {
							dataList.add(currentData);
                       }
					} else{
						dataList.add(currentData);
                    }
					break;
				 
				}
				
			    
			}

			reader.close();
			stream.close();
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		} finally {
		}

		return edi270;

	}
	 
	/**
	 * Sets the contents of current loop or segment using dataList populated from
	 * parsing method.
	 * 
	 * @param edi270
	 * @param stCounter
	 * @param hlCounter
	 * @param currentSegment
	 * @param dataList
	 * @param currentloop
	 * @param currentst
	 * @return
	 */
	public Edi270 updateSegment270(Edi270 edi270, int stCounter, int eqCounter, int hlCounter,
			String currentSegment, List<String> dataList, List<String> compositeList,List<ArrayList<String> > aList, String currentloop,
			ST currentst,int loopCounter) {

		try {

			if (hlCounter == 0) {
				switch (currentSegment) {
				case "ISA":
					edi270 = mapper.mapIsa(edi270, dataList);
					break;
				case "GS":
					edi270 = mapper.mapGs(edi270, dataList);
					break;
				case "ST":
					currentst = mapper.mapSt(currentst, dataList);
					edi270.getStlist().add(currentst);
					break;
				case "SE":
					edi270 = mapper.mapSe(edi270, stCounter - 1, dataList);
					break;
				case "BHT":
					edi270 = mapper.mapBht(edi270, stCounter - 1, dataList);
					break;
				case "GE":
					edi270 = mapper.mapGe(edi270, dataList);
					break;
				case "IEA":
					edi270 = mapper.mapIea(edi270, dataList);
					break;
				}
			} else {
				switch (currentloop) {
				case "Loop2000A":
					edi270 = mapper.mapLoop2000A(edi270, stCounter - 1, dataList, currentSegment);
					break;
				case "Loop2000B":
					edi270 = mapper.mapLoop2000B(edi270, stCounter - 1, dataList, currentSegment, loopCounter -1 );
					break;
				case "Loop2000C":
					edi270 = mapper.mapLoop2000C(edi270, stCounter - 1, currentSegment,loopCounter -1 , dataList,aList);
					break;
				case "Loop2110C":
					edi270 = mapper.mapLoop2110C(edi270, stCounter - 1, eqCounter - 1, loopCounter - 1,
							dataList, /* compositeList, */  aList,
							currentSegment);
					break;
				}
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi270;
	}
 

	/**
	 * Sets current loop.
	 * 
	 * @param hlCounter
	 * @return
	 */
 
	
	public String getLoop(List<String> dataList) {
		String loop = "";
		String levelCode = dataList.get(2).trim();
		try {

			switch (levelCode) {
			case "20":
				loop = "Loop2000A";
				break;
			case "21":
				loop = "Loop2000B";
				break;
			case "22":
				loop = "Loop2000C";
				break;			
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}
		return loop;
	}
	
 

}
