package com.abcbs.benefitsx12utilities.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbs.benefitsx12utilities.models.InformationalResponse;
import com.abcbs.benefitsx12utilities.models.X12ParserRequestResponse;
import com.abcbs.benefitsx12utilities.models.X12ParserResponseExtStatusResponse;
import com.abcbs.benefitsx12utilities.models.X12ParserResponseResponse;
import com.abcbs.benefitsx12utilities.services.BenefitsEdiRequestHandler;
import com.abcbs.benefitsx12utilities.services.BenefitsEdiResponseExtStatusHandler;
import com.abcbs.benefitsx12utilities.services.BenefitsEdiResponseHandler;
import com.abcbs.benefitsx12utilities.services.WrapperParser;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Controller class for x12 utilities. This API contains multiple
 *          endpoints exposing various x12 utilities like parsing, response
 *          generation, object inspection...etc.
 *
 *          Use of this API requires the import of edix12objects.jar from Maven.
 */



@RestController
public class BenefitsX12UtilitiesController {	
	@Autowired
	private BenefitsEdiRequestHandler benefitsEdiRequestHandler;
	@Autowired
	private BenefitsEdiResponseHandler benefitsEdiResponseHandler;
	@Autowired
	private BenefitsEdiResponseExtStatusHandler benefitsEdiResponseExtStatusHandler;

	@Autowired
	private WrapperParser wrapperparser;	

	@Autowired
	private Environment env;

	/**
	 * Endpoint is used for first call initialization and API status monitoring
	 * 
	 * @return
	 */
//	@GetMapping(value = "/apistatus")
//	public ResponseEntity<String> apiStatus() {
//		return new ResponseEntity<String>("success", HttpStatus.OK);
//	}
	
	@GetMapping(value = "/apistatus")
	public ResponseEntity<InformationalResponse> apiStatus() {

		InformationalResponse response = new InformationalResponse();
		response.setStatusCode(HttpStatus.OK.value());
		response.setHttpStatus(HttpStatus.OK);
		response.setReason(HttpStatus.OK.getReasonPhrase());
		response.setTimestamp();
		response.setMessage("API is running");
		return new ResponseEntity<InformationalResponse>(response, HttpStatus.OK);

	}
	
	@PostMapping(value = "/amisys270request/parse270x12", consumes = "application/json", produces = "application/json")
	public ResponseEntity<X12ParserRequestResponse> parse270x12(@RequestBody String request) throws IOException {
		X12ParserRequestResponse response = new X12ParserRequestResponse();

		try {
//			PerformanceLogEvent performanceLogEvent = new PerformanceLogEvent(
//					env.getProperty("spring.application.name"), this.getClass().getCanonicalName(),
//					new Throwable().getStackTrace()[0].getMethodName(), ProcessingPoints.BEGIN,
//					"270 X12 Parsing Begin");
		//	String loggingid = LogEventHandler.handlePerformanceLogEvent(performanceLogEvent, true);

			response.setRequestResults(benefitsEdiRequestHandler.parse270Edi(request));

//			performanceLogEvent = new PerformanceLogEvent(env.getProperty("spring.application.name"),
//					this.getClass().getCanonicalName(), new Throwable().getStackTrace()[0].getMethodName(),
//					ProcessingPoints.END, "270 X12 Parsing End");
//		//	performanceLogEvent.setUuid(loggingid);
		//	LogEventHandler.handlePerformanceLogEvent(performanceLogEvent, true);

			HttpStatus okStatus = HttpStatus.OK;
			response.setStatus("OK");
			response.setMessage("Success");
			response.setTimestamp();
		} catch (Exception ex) {
			//throw new ApplicationException(ex, env.getProperty("spring.application.name"));
			throw ex;
		}

		return new ResponseEntity<X12ParserRequestResponse>(response, HttpStatus.OK);

	}
	@PostMapping(value = "/amisys271response/parse271x12", consumes = "application/json", produces = "application/json")
	public ResponseEntity<X12ParserResponseResponse> parse271x12(@RequestBody String request) throws IOException {
		X12ParserResponseResponse response = new X12ParserResponseResponse();

		try {
//			PerformanceLogEvent performanceLogEvent = new PerformanceLogEvent(
//					env.getProperty("spring.application.name"), this.getClass().getCanonicalName(),
//					new Throwable().getStackTrace()[0].getMethodName(), ProcessingPoints.BEGIN,
//					"270 X12 Parsing Begin");
			//String loggingid = LogEventHandler.handlePerformanceLogEvent(performanceLogEvent, true);

			response.setResults(benefitsEdiResponseHandler.parse271Edi(request));

//			performanceLogEvent = new PerformanceLogEvent(env.getProperty("spring.application.name"),
//					this.getClass().getCanonicalName(), new Throwable().getStackTrace()[0].getMethodName(),
//					ProcessingPoints.END, "271 X12 Parsing End");
		//	performanceLogEvent.setUuid(loggingid);
		//	LogEventHandler.handlePerformanceLogEvent(performanceLogEvent, true);

			HttpStatus okStatus = HttpStatus.OK;
			response.setStatus("OK");
			response.setMessage("Success");
			response.setTimestamp();
		} catch (Exception ex) {
			//throw new ApplicationException(ex, env.getProperty("spring.application.name"));
			throw ex;
		}

		return new ResponseEntity<X12ParserResponseResponse>(response, HttpStatus.OK);

	}
	
	@PostMapping(value = "/amisys271response/extractStatuses", consumes = "application/json", produces = "application/json")
	public String parse271x12ExtractStatuses(@RequestBody String request) throws IOException {
		
		X12ParserResponseExtStatusResponse response = new X12ParserResponseExtStatusResponse();
		String payloadJson=null;
		try {
//			PerformanceLogEvent performanceLogEvent = new PerformanceLogEvent(
//					env.getProperty("spring.application.name"), this.getClass().getCanonicalName(),
//					new Throwable().getStackTrace()[0].getMethodName(), ProcessingPoints.BEGIN,
//					"270 X12 Parsing Begin");
			//String loggingid = LogEventHandler.handlePerformanceLogEvent(performanceLogEvent, true);

			response.setResults(benefitsEdiResponseExtStatusHandler.parse271EdiExtractStatuses(request));

//			performanceLogEvent = new PerformanceLogEvent(env.getProperty("spring.application.name"),
//					this.getClass().getCanonicalName(), new Throwable().getStackTrace()[0].getMethodName(),
//					ProcessingPoints.END, "271 X12 Parsing End");
		//	performanceLogEvent.setUuid(loggingid);
		//	LogEventHandler.handlePerformanceLogEvent(performanceLogEvent, true);
			
			HttpStatus okStatus = HttpStatus.OK;
			response.setStatus("OK");
			response.setMessage("Success");
			response.setTimestamp();
			 
	        // Generate the Payload object and JSON string
	        payloadJson = benefitsEdiResponseExtStatusHandler.generateExtractStatuses(response);

	        // Print the JSON string to the console
	        System.out.println(payloadJson);

			
		} catch (Exception ex) {
			//throw new ApplicationException(ex, env.getProperty("spring.application.name"));
			throw ex;
		}

	//	return new ResponseEntity<X12ParserResponseExtStatusResponse>(response, HttpStatus.OK);
		return payloadJson; 

	}

}
