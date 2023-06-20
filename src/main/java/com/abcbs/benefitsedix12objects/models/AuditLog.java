package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the AuditLog element found within the Header 
 *          of the MessageWrapper (Header.AuditLog).
 *          
 *          This is a required class in the wrapper.
 */
/*
 * Document modifications here:
 */
public class AuditLog {

	private String loglevel;
	private String logmessage;

	public AuditLog() {

	}

	public AuditLog(String loglevel, String logmessage) {
		super();
		this.loglevel = loglevel;
		this.logmessage = logmessage;
	}

	public String getLoglevel() {
		return loglevel;
	}

	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}

	public String getLogmessage() {
		return logmessage;
	}

	public void setLogmessage(String logmessage) {
		this.logmessage = logmessage;
	}

}
