package com.abcbs.benefitsx12utilities.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author	ISCFC_CLAIMS_SYSTEMS
 * @since	3-23-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *		Defines the response object for an informational response. 
 *		All information response objects should contain status, timestamp, and message.
 *		Examples of these responses are errors, confirmations, acknowledgments...etc.
 *        
 *		Specifically for errors.
 *
 */
public class ErrorResponse {

	private String statusCode;
	private String statusMessage;
	private String timeStamp = new Date(System.currentTimeMillis()).toString();
	private String apiMessage;
	private String exceptionKey;
	private String contactinfo;

	public ErrorResponse() {

	}

	public ErrorResponse(String statusCode, String statusMessage, String timeStamp, String apiMessage,
			String exceptionKey, String contactinfo) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.timeStamp = timeStamp;
		this.apiMessage = apiMessage;
		this.exceptionKey = exceptionKey;
		this.contactinfo = contactinfo;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getApiMessage() {
		return apiMessage;
	}

	public void setApiMessage(String apiMessage) {
		this.apiMessage = apiMessage;
	}

	public String getExceptionKey() {
		return exceptionKey;
	}

	public void setExceptionKey(String exceptionKey) {
		this.exceptionKey = exceptionKey;
	}

	public String getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}

	
}