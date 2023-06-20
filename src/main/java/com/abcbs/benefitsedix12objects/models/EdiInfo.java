package com.abcbs.benefitsedix12objects.models;


/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the EdiInfo element found within the Header 
 *          of the MessageWrapper (Header.EdiInfo).
 *          
 *          This is a required class in the wrapper.
 */
/*
 * Document modifications here:
 */
public class EdiInfo {

	private InterchangeInfo interchageinfo = new InterchangeInfo();
	private String lob;
	private SubscriberInfo subscriberinfo = new SubscriberInfo();
	private DependentInfo dependentinfo = new DependentInfo();
	private ErrorInfo errorinfo = new ErrorInfo();

	public EdiInfo() {

	}

	public EdiInfo(InterchangeInfo interchageinfo, String lob, SubscriberInfo subscriberinfo,
			DependentInfo dependentinfo, ErrorInfo errorinfo) {
		super();
		this.interchageinfo = interchageinfo;
		this.lob = lob;
		this.subscriberinfo = subscriberinfo;
		this.dependentinfo = dependentinfo;
		this.errorinfo = errorinfo;
	}

	public InterchangeInfo getInterchageinfo() {
		return interchageinfo;
	}

	public void setInterchageinfo(InterchangeInfo interchageinfo) {
		this.interchageinfo = interchageinfo;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public SubscriberInfo getSubscriberinfo() {
		return subscriberinfo;
	}

	public void setSubscriberinfo(SubscriberInfo subscriberinfo) {
		this.subscriberinfo = subscriberinfo;
	}

	public DependentInfo getDependentinfo() {
		return dependentinfo;
	}

	public void setDependentinfo(DependentInfo dependentinfo) {
		this.dependentinfo = dependentinfo;
	}

	public ErrorInfo getErrorinfo() {
		return errorinfo;
	}

	public void setErrorinfo(ErrorInfo errorinfo) {
		this.errorinfo = errorinfo;
	}

}
