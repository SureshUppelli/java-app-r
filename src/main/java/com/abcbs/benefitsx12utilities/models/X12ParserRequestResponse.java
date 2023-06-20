package com.abcbs.benefitsx12utilities.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.abcbs.benefitsedix12objects.models.Edi270;

/**
 * 
 * @author CACOBB
 * @version 1.0
 * @since 3-31-2022
 * @contact iscfcclaimscore@arkbluecross.com
 * 
 *          Model class used to contain response returned when
 *          parsing raw x12.
 */
/*
 * Document modifications here:
 */
public class X12ParserRequestResponse {

	private String status;
	private String timestamp;
	private String message;
	private Edi270 requestResults;
	
	
	public X12ParserRequestResponse() {
		
	}
	public X12ParserRequestResponse(String status, String timestamp, String message, Edi270 requestResults) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
		this.setRequestResults(requestResults);
	}

	 

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setTimestamp() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		LocalDateTime now = LocalDateTime.now();
		this.timestamp = dtf.format(now);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public Edi270 getRequestResults() {
		return requestResults;
	}
	public void setRequestResults(Edi270 requestResults) {
		this.requestResults = requestResults;
	}
	 
	 
	
	

}
