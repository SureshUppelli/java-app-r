package com.abcbs.benefitsedix12objects.models;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
PRV - INFORMATION RECEIVER PROVIDER INFORMATION
X12 Segment Name: Provider Information
X12 Purpose: To specify the identifying characteristics of a provider
X12 Syntax: 1. P0203 If either PRV02 or PRV03 is present, then the other is required.
Loop: 2100B — INFORMATION RECEIVER NAME
Segment Repeat: 1
Usage: SITUATIONAL
Situational Rule: Required when the 270 request contained a 2100B PRV segment and the information contained in the PRV segment was used to determine the 271 response. If not required by this implementation guide, do not send. 
TR3 Notes: 1. This segment is used to convey additional information about a provider’s role in the eligibility/benefit being inquired about and who is also the Information Receiver. For example, if the Information Receiver is also the Referring Provider, this PRV segment would be used to identify the provider’s role. This PRV segment applies to all benefits returned for this Information Receiver unless overridden by a PRV segment in the 2100C, 2120C, 2100D or 2120D loops.
TR3 Example: PRV✽RF✽PXC✽207Q00000X~

 */
/*
 * Document modifications here:
 */
public class PRV {
	
	
	private String prv01;
	private String prv02;
	private String prv03;
	private String prv04;
	private String prv05;
	private String prv06;

	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("1221", "prv01");
			put("128", "prv02"); 
			put("127", "prv03"); 
			put("156", "prv04"); 
			put("C035", "prv05"); 
			put("1223", "prv06"); 
		}
	};
	
	public PRV() {
		
	}

	public PRV(String prv01, 
			String prv02, 
			String prv03, 
			String prv04, 
			String prv05, 
			String prv06, 
     	Map<String, String> dataelementmap) {
		super();
		this.prv01=prv01;
		this.prv02=prv02;
		this.prv03=prv03;
		this.prv04=prv04;
		this.prv05=prv05;
		this.prv06=prv06;
		 
		this.dataelementmap = dataelementmap;
	}
	
	public String getByDataElement(String dataelement) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass()
				.getMethod("get" + dataelement.substring(0, 1).toUpperCase() + dataelement.substring(1), null);
		return (String) method.invoke(this.getClass(), null);
	}

	public void setByDataElement(String dataelement, String value) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass()
				.getMethod("set" + dataelement.substring(0, 1).toUpperCase() + dataelement.substring(1), String.class);
		method.invoke(this.getClass(), value);
	}
 
	 
	

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

	public String getPrv01() {
		return prv01;
	}

	public void setPrv01(String prv01) {
		this.prv01 = prv01;
	}

	public String getPrv02() {
		return prv02;
	}

	public void setPrv02(String prv02) {
		this.prv02 = prv02;
	}

	public String getPrv03() {
		return prv03;
	}

	public void setPrv03(String prv03) {
		this.prv03 = prv03;
	}

	public String getPrv04() {
		return prv04;
	}

	public void setPrv04(String prv04) {
		this.prv04 = prv04;
	}

	public String getPrv05() {
		return prv05;
	}

	public void setPrv05(String prv05) {
		this.prv05 = prv05;
	}

	public String getPrv06() {
		return prv06;
	}

	public void setPrv06(String prv06) {
		this.prv06 = prv06;
	}
 
	

}
