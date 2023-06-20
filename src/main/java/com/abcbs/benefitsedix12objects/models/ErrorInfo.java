package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the ErrorInfo element found within the EDIInfo class
 *          of the Header of the MessageWrapper (Header.EDIInfo.ErrorInfo).
 *          
 *          This is an optional class and may or may not be present in the wrapper.
 */
/*
 * Document modifications here:
 */
public class ErrorInfo {

	private String errorcode;
	private String errormessage;

	public ErrorInfo() {

	}

	public ErrorInfo(String errorcode, String errormessage) {
		super();
		this.errorcode = errorcode;
		this.errormessage = errormessage;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

}
