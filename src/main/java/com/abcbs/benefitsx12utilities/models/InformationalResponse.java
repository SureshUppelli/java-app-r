package com.abcbs.benefitsx12utilities.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;

/**
 * 
 * @author CACOBB
 * @version 1.0
 * @since 3-31-2022
 * @contact iscfcclaimscore@arkbluecross.com
 * 
 *          Model class used to contain info responses.
 */
/*
 * Document modifications here:
 */
public class InformationalResponse {

	private int statusCode;
	private HttpStatus httpStatus;
	private String reason;
	private String timestamp;
	private String message;
	
	public void setTimestamp() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		LocalDateTime now = LocalDateTime.now();
		this.timestamp = dtf.format(now);
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
}
