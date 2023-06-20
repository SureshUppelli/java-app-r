package com.abcbs.benefitsedix12objects.models;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	5-18-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 * 			The contactinfomap is a map of ContactInfo instances and can contain up to 3 entries.  
 * 			Each instance can contain a contact number and matching qualifier.  
 * 			Those maps represent the PER03-PER08 values.
 * 
 *          X12 Segment Name:	Administrative Communications Contact
 *          X12 Purpose:		To identify a person or office to whom administrative communications should be
 *          					directed
 *          
 *          PER01 - 366 - Contact Function Code
 *          					Code identifying the major duty or responsibility of the person or group named
 *          
 *          PER02 - 93 - Name
 *          					Free-form name
 *          
 *          PER09 - 443 - Contact Inquiry Reference 
 */
/*
 * Document modifications here:
 */
public class PER {
	
	private String per01;
	private String per02;
	private String per03;
	private String per04;
	private String per05;
	private String per06;
	private String per07;
	private String per08;
	
	//private Map<String, ContactInfo> contactinfomap = new HashMap<String, ContactInfo>();
	private String per09;
	
	public PER () {
		
	}
	
	
	
	public PER(String per01, String per02, String per03, String per04, String per05, String per06, String per07,
			String per08, String per09/* , Map<String, ContactInfo> contactinfomap */) {
		super();
		this.per01 = per01;
		this.per02 = per02;
		this.setPer03(per03);
		this.setPer04(per04);
		this.setPer05(per05);
		this.setPer06(per06);
		this.setPer07(per07);
		this.setPer08(per08);
		
	//	this.contactinfomap = contactinfomap;
		this.per09 = per09;
	}



	public String getPer01() {
		return per01;
	}
	public void setPer01(String per01) {
		this.per01 = per01;
	}
	public String getPer02() {
		return per02;
	}
	public void setPer02(String per02) {
		this.per02 = per02;
	}
//	public Map<String, ContactInfo> getContactinfomap() {
//		return contactinfomap;
//	}
//	public void setContactinfomap(Map<String, ContactInfo> contactinfomap) {
//		this.contactinfomap = contactinfomap;
//	}
	public String getPer09() {
		return per09;
	}
	public void setPer09(String per09) {
		this.per09 = per09;
	}



	public String getPer03() {
		return per03;
	}



	public void setPer03(String per03) {
		this.per03 = per03;
	}



	public String getPer04() {
		return per04;
	}



	public void setPer04(String per04) {
		this.per04 = per04;
	}



	public String getPer05() {
		return per05;
	}



	public void setPer05(String per05) {
		this.per05 = per05;
	}



	public String getPer06() {
		return per06;
	}



	public void setPer06(String per06) {
		this.per06 = per06;
	}



	public String getPer07() {
		return per07;
	}



	public void setPer07(String per07) {
		this.per07 = per07;
	}



	public String getPer08() {
		return per08;
	}



	public void setPer08(String per08) {
		this.per08 = per08;
	}
	
	
}
