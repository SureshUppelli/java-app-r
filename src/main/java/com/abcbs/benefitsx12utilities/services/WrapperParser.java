package com.abcbs.benefitsx12utilities.services;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.abcbs.benefitsedix12objects.models.AuditLog;
import com.abcbs.benefitsedix12objects.models.DependentInfo;
import com.abcbs.benefitsedix12objects.models.EdiInfo;
import com.abcbs.benefitsedix12objects.models.ErrorInfo;
import com.abcbs.benefitsedix12objects.models.Header;
import com.abcbs.benefitsedix12objects.models.InterchangeInfo;
import com.abcbs.benefitsedix12objects.models.MessageWrapper;
import com.abcbs.benefitsedix12objects.models.RequestInfo;
import com.abcbs.benefitsedix12objects.models.SubscriberInfo;

/**
 * 
 * @author CACOBB
 * @version 1.0
 * @since 5-27-2022
 * @contact iscfcclaimscore@arkbluecross.com
 * 
 *          Service class for parsing wrapper of message received on broker. Use
 *          of this class requires the import of edix12objects.jar from Maven.
 */
/*
 * Document modifications here:
 */
@Service
public class WrapperParser {

	@Autowired
	private Environment env;

	/**
	 * Method uses StAX to parse the XML contents of the message wrapper.
	 * 
	 * @param message
	 * @return
	 * @throws XMLStreamException
	 */
	public MessageWrapper parseWrapper(String message) throws XMLStreamException {
		MessageWrapper messagewrapper = new MessageWrapper();
		Header header = new Header();
		RequestInfo requestinfo = new RequestInfo();
		AuditLog auditlog = new AuditLog();
		EdiInfo ediinfo = new EdiInfo();
		InterchangeInfo interchangeinfo = new InterchangeInfo();
		SubscriberInfo subscriberinfo = new SubscriberInfo();
		DependentInfo dependentinfo = new DependentInfo();
		ErrorInfo errorinfo = new ErrorInfo();
		String currentclass = "";
		String methodtype = "";

		try {
			InputStream inputStream = new ByteArrayInputStream(message.getBytes());
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			inputFactory.setProperty(XMLInputFactory.IS_COALESCING, true);
			inputFactory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
			XMLEventReader reader = inputFactory.createXMLEventReader(inputStream);

			while (reader.hasNext()) {
				XMLEvent nextEvent = reader.nextEvent();
				if (nextEvent.isStartElement()) {
					StartElement startElement = nextEvent.asStartElement();
					switch (startElement.getName().getLocalPart()) {
					case "CorrelationID":
						nextEvent = reader.nextEvent();
						header.setCorrelationid(nextEvent.asCharacters().getData());
						break;
					case "TransactionType":
						nextEvent = reader.nextEvent();
						header.setTransactiontype(nextEvent.asCharacters().getData());
						break;
					case "Environment":
						nextEvent = reader.nextEvent();
						header.setEnvironment(nextEvent.asCharacters().getData());
						break;
					case "SourceIdentifier":
						nextEvent = reader.nextEvent();
						requestinfo.setSourceidentifier(nextEvent.asCharacters().getData());
						break;
					case "ReceivedDateTime":
						nextEvent = reader.nextEvent();
						requestinfo.setReceiveddatetime(nextEvent.asCharacters().getData());
						break;
					case "LogLevel":
						nextEvent = reader.nextEvent();
						auditlog.setLoglevel(nextEvent.asCharacters().getData());
						break;
					case "LogMessage":
						nextEvent = reader.nextEvent();
						auditlog.setLogmessage(nextEvent.asCharacters().getData());
						break;
					case "SenderId":
						nextEvent = reader.nextEvent();
						interchangeinfo.setSenderid(nextEvent.asCharacters().getData());
						break;
					case "ReceiverId":
						nextEvent = reader.nextEvent();
						interchangeinfo.setReceiverid(nextEvent.asCharacters().getData());
						break;
					case "Date":
						nextEvent = reader.nextEvent();
						interchangeinfo.setDate(nextEvent.asCharacters().getData());
						break;
					case "Time":
						nextEvent = reader.nextEvent();
						interchangeinfo.setTime(nextEvent.asCharacters().getData());
						break;
					case "VersionNumber":
						nextEvent = reader.nextEvent();
						interchangeinfo.setVersionnumber(nextEvent.asCharacters().getData());
						break;
					case "ControlNumber":
						nextEvent = reader.nextEvent();
						interchangeinfo.setControlnumber(nextEvent.asCharacters().getData());
						break;
					case "LOB":
						nextEvent = reader.nextEvent();
						ediinfo.setLob(nextEvent.asCharacters().getData());
						break;
					case "SubscriberInfo":
						nextEvent = reader.nextEvent();
						currentclass = startElement.getName().getLocalPart();
						methodtype = "Subscriber";
						break;
					case "DependentInfo":
						nextEvent = reader.nextEvent();
						currentclass = startElement.getName().getLocalPart();
						methodtype = "Dependent";
						break;
					case "FirstName":
						nextEvent = reader.nextEvent();
						if (currentclass.equals("SubscriberInfo"))
							subscriberinfo = mapSubscriber(subscriberinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						else
							dependentinfo = mapSubscriber(dependentinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						break;
					case "LastName":
						nextEvent = reader.nextEvent();
						if (currentclass.equals("SubscriberInfo"))
							subscriberinfo = mapSubscriber(subscriberinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						else
							dependentinfo = mapSubscriber(dependentinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						break;
					case "MiddleName":
						nextEvent = reader.nextEvent();
						if (currentclass.equals("SubscriberInfo"))
							subscriberinfo = mapSubscriber(subscriberinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						else
							dependentinfo = mapSubscriber(dependentinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						break;
					case "Suffix":
						nextEvent = reader.nextEvent();
						if (currentclass.equals("SubscriberInfo"))
							subscriberinfo = mapSubscriber(subscriberinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						else
							dependentinfo = mapSubscriber(dependentinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						break;
					case "MemberNumber":
						nextEvent = reader.nextEvent();
						if (currentclass.equals("SubscriberInfo"))
							subscriberinfo = mapSubscriber(subscriberinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						else
							dependentinfo = mapSubscriber(dependentinfo, startElement.getName().getLocalPart(),
									nextEvent.asCharacters().getData());
						break;
					case "errorcode":
						nextEvent = reader.nextEvent();
						errorinfo.setErrorcode(nextEvent.asCharacters().getData());
						break;
					case "errormessage":
						nextEvent = reader.nextEvent();
						errorinfo.setErrormessage(nextEvent.asCharacters().getData());
						break;
					case "Payload":
						nextEvent = reader.nextEvent();
						messagewrapper.setPayload(nextEvent.asCharacters().getData());
						break;

					}

				}
			}
			ediinfo.setInterchageinfo(interchangeinfo);
			ediinfo.setSubscriberinfo(subscriberinfo);
			ediinfo.setDependentinfo(dependentinfo);
			ediinfo.setErrorinfo(errorinfo);
			header.setRequestinfo(requestinfo);
			header.setAuditlog(auditlog);
			header.setEdiinfo(ediinfo);
			messagewrapper.setHeader(header);

		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}
		return messagewrapper;
	}

	/**
	 * Method to populate Subscriber data from wrapper.
	 * 
	 * @param subscriber
	 * @param element
	 * @param data
	 * @return
	 */
	public SubscriberInfo mapSubscriber(SubscriberInfo subscriber, String element, String data) {
		try {
			switch (element) {
			case "FirstName":
				subscriber.setFirstname(data);
				break;
			case "LastName":
				subscriber.setLastname(data);
				break;
			case "MiddleName":
				subscriber.setMiddlename(data);
				break;
			case "Suffix":
				subscriber.setSuffix(data);
				break;
			case "MemberNumber":
				subscriber.setMembernumber(data);
				break;
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return subscriber;
	}

	/**
	 * Method to populate Dependent data from wrapper.
	 * 
	 * @param dependent
	 * @param element
	 * @param data
	 * @return
	 */
	public DependentInfo mapSubscriber(DependentInfo dependent, String element, String data) {
		try {
			switch (element) {
			case "FirstName":
				dependent.setFirstname(data);
				break;
			case "LastName":
				dependent.setLastname(data);
				break;
			case "MiddleName":
				dependent.setMiddlename(data);
				break;
			case "Suffix":
				dependent.setSuffix(data);
				break;
			case "MemberNumber":
				dependent.setMembernumber(data);
				break;
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return dependent;
	}

}
