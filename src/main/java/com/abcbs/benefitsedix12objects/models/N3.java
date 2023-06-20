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
 *         N3 - INFORMATION RECEIVER ADDRESS
 *		X12 Segment Name: Party Location
 *		X12 Purpose: To specify the location of the named party
 *		Loop: 2100B — INFORMATION RECEIVER NAME
 *		Segment Repeat: 1
 *		Usage: SITUATIONAL
 *		Situational Rule: Required when this information was used from the 270 transaction to
 * 			identify the Information Receiver. If not required by this implementation
 *			guide, may be provided at sender’s discretion, but cannot be required by
 *			the receiver.
 *	 	 TR3 Example: N3✽201 PARK AVENUE✽SUITE 300~
 */
/*
 * Document modifications here:
 */
public class N3 {
	
	private String n301;
	private String n302;
	 
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("166", "n301");
			put("166", "n302");
		 
			
		}
	};
	
	public N3() {
		
	}

	public N3(String n301, String n302,	Map<String, String> dataelementmap) {
		super();
		this.n301 = n301;
		this.n302 = n302;
		 
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

	public String getN301() {
		return n301;
	}

	public void setN301(String n301) {
		this.n301 = n301;
	}

	public String getN302() {
		return n302;
	}

	public void setN302(String n302) {
		this.n302 = n302;
	}
	
	

}
