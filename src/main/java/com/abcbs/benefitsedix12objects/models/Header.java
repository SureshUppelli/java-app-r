package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the Header of the MessageWrapper.  All meta-data
 *          associated with the message will be found within the header and
 *          its nested classes.
 *          
 *          This is a required class in the MessageWrapper.
 */
/*
 * Document modifications here:
 */
public class Header {

	private String correlationid;
	private String transactiontype;
	private String environment;
	private RequestInfo requestinfo = new RequestInfo();
	private AuditLog auditlog = new AuditLog();
	private EdiInfo ediinfo = new EdiInfo();

	public Header() {

	}

	public Header(String correlationid, String transactiontype, String environment, RequestInfo requestinfo,
			AuditLog auditlog, EdiInfo ediinfo) {
		super();
		this.correlationid = correlationid;
		this.transactiontype = transactiontype;
		this.environment = environment;
		this.requestinfo = requestinfo;
		this.auditlog = auditlog;
		this.ediinfo = ediinfo;
	}

	public String getCorrelationid() {
		return correlationid;
	}

	public void setCorrelationid(String correlationid) {
		this.correlationid = correlationid;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public RequestInfo getRequestinfo() {
		return requestinfo;
	}

	public void setRequestinfo(RequestInfo requestinfo) {
		this.requestinfo = requestinfo;
	}

	public AuditLog getAuditlog() {
		return auditlog;
	}

	public void setAuditlog(AuditLog auditlog) {
		this.auditlog = auditlog;
	}

	public EdiInfo getEdiinfo() {
		return ediinfo;
	}

	public void setEdiinfo(EdiInfo ediinfo) {
		this.ediinfo = ediinfo;
	}

}
