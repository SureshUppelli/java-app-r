package com.abcbs.benefitsx12utilities.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.abcbs.benefitsedix12objects.models.MessageWrapper;

/**
 * 
 * @author CACOBB
 * @version 1.0
 * @since 3-31-2022
 * @contact iscfcclaimscore@arkbluecross.com
 * 
 *          Model class used to contain response returned when
 *          parsing message wrapper.
 */
/*
 * Document modifications here:
 */
public class WrapperResponse {
	
	private String status;
	private String timestamp;
	private String message;
	private MessageWrapper results;
	
	public WrapperResponse() {
		
	}

	public WrapperResponse(String status, String timestamp, String message, MessageWrapper results) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
		this.results = results;
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

	public MessageWrapper getResults() {
		return results;
	}

	public void setResults(MessageWrapper results) {
		this.results = results;
	}
	
	

}
