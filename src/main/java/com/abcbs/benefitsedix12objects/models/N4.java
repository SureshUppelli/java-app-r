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
 *          N4 - INFORMATION RECEIVER CITY, STATE,ZIP CODE
 *          
	X12 Segment Name: Geographic Location
	X12 Purpose: To specify the geographic place of the named party
	X12 Syntax: 1. E0207 Only one of N402 or N407 may be present.
	            2. C0605 If N406 is present, then N405 is required.
	            3. C0704 If N407 is present, then N404 is required.
	Loop: 2100B — INFORMATION RECEIVER NAME
	Segment Repeat: 1
	Usage: SITUATIONAL
	Situational Rule: Required when this information was used from the 270 transaction to
	identify the Information Receiver. If not required by this implementation
	guide, may be provided at sender’s discretion, but cannot be required by
	the receiver.

	TR3 Example: N4✽KANSAS CITY✽MO✽64108~
 */
/*
 * Document modifications here:
 */
public class N4 {
	
	private String n401;
	private String n402;
	private String n403;
	private String n404;
	private String n405;
	private String n406;
	private String n407;
	 
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("19", "n401");
			put("156", "n402");
			put("116", "n403");
			put("26", "n404");
			put("309", "n405");
			put("310", "n406");
			put("1715", "n407");
			
			
		 
			
		}
	};
	
	public N4() {
		
	}

	public N4(String n401, String n402,String n403,String n404,	String n405,String n406,String n407,Map<String, String> dataelementmap) {
		super();
		this.n401 = n401;
		this.n402 = n402;
		this.n403 = n403;
		this.n404=n404;
		this.n405=n405;
		this.n406=n406;
		this.n407=n407;
		 
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

	public String getN401() {
		return n401;
	}

	public void setN401(String n401) {
		this.n401 = n401;
	}

	public String getN402() {
		return n402;
	}

	public void setN402(String n402) {
		this.n402 = n402;
	}

	public String getN403() {
		return n403;
	}

	public void setN403(String n403) {
		this.n403 = n403;
	}

	public String getN404() {
		return n404;
	}

	public void setN404(String n404) {
		this.n404 = n404;
	}

	public String getN405() {
		return n405;
	}

	public void setN405(String n405) {
		this.n405 = n405;
	}

	public String getN406() {
		return n406;
	}

	public void setN406(String n406) {
		this.n406 = n406;
	}

	public String getN407() {
		return n407;
	}

	public void setN407(String n407) {
		this.n407 = n407;
	}

	 
	
	

}
