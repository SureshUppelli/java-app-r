package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the RequestInfo element found within the Header 
 *          of the MessageWrapper (Header.RequestInfo).
 *          
 *          This is a required class in the wrapper.
 */
/*
 * Document modifications here:
 */
public class RequestInfo {

	private String sourceidentifier;
	private String receiveddatetime;

	public RequestInfo() {

	}

	public RequestInfo(String sourceidentifier, String receiveddatetime) {
		super();
		this.sourceidentifier = sourceidentifier;
		this.receiveddatetime = receiveddatetime;
	}

	public String getSourceidentifier() {
		return sourceidentifier;
	}

	public void setSourceidentifier(String sourceidentifier) {
		this.sourceidentifier = sourceidentifier;
	}

	public String getReceiveddatetime() {
		return receiveddatetime;
	}

	public void setReceiveddatetime(String receiveddatetime) {
		this.receiveddatetime = receiveddatetime;
	}

}
