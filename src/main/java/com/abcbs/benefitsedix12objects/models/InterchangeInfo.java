package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the InterchangeInfo element found within the EDIInfo class
 *          of the Header of the MessageWrapper (Header.EDIInfo.InterchangeInfo).  This 
 *          class will contain meta-data of the interchange details associated with 
 *          this x12 exchange.
 *          
 *          This is a required class.
 */
/*
 * Document modifications here:
 */
public class InterchangeInfo {

	private String senderid;
	private String receiverid;
	private String date;
	private String time;
	private String versionnumber;
	private String controlnumber;

	public InterchangeInfo() {

	}

	public InterchangeInfo(String senderid, String receiverid, String date, String time, String versionnumber,
			String controlnumber) {
		super();
		this.senderid = senderid;
		this.receiverid = receiverid;
		this.date = date;
		this.time = time;
		this.versionnumber = versionnumber;
		this.controlnumber = controlnumber;
	}

	public String getSenderid() {
		return senderid;
	}

	public void setSenderid(String senderid) {
		this.senderid = senderid;
	}

	public String getReceiverid() {
		return receiverid;
	}

	public void setReceiverid(String receiverid) {
		this.receiverid = receiverid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVersionnumber() {
		return versionnumber;
	}

	public void setVersionnumber(String versionnumber) {
		this.versionnumber = versionnumber;
	}

	public String getControlnumber() {
		return controlnumber;
	}

	public void setControlnumber(String controlnumber) {
		this.controlnumber = controlnumber;
	}

}
