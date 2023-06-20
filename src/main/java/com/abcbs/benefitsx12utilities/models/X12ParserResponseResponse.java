package com.abcbs.benefitsx12utilities.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.abcbs.benefitsedix12objects.models.response.Edi271;

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
public class X12ParserResponseResponse {

	private String status;
	private String timestamp;
	private String message;
	
	private Edi271 results;
	
	public X12ParserResponseResponse() {
		
	}
	 
	public X12ParserResponseResponse(String status, String timestamp, String message, Edi271 results) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
		this.setResults(results);
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
	 
	public Edi271 getResults() {
		return results;
	}
	public void setResults(Edi271 results) {
		this.results = results;
	}

	 
	
	

}
