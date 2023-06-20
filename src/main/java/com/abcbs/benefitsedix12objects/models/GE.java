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
 *          X12 Segment Name:	Functional Group Trailer
 *          X12 Purpose:		To indicate the end of a functional group and to provide control information
 *          X12 Comments:		1. The use of identical data interchange control numbers in the associated
 *          					functional group header and trailer is designed to maximize functional group
 *          					integrity. The control number is the same as that used in the corresponding header.
 *          
 *          GE01 - 97 - Number of Transaction Sets Included
 *          					Total number of transaction sets included in the functional group or interchange
 *          					(transmission) group terminated by the trailer containing this data element.
 *          
 *          GE02 - 28 - Group Control Number
 *          					Assigned number originated and maintained by the sender.
 */
/*
 * Document modifications here:
 */
public class GE {
	
	private String ge01;
	private String ge02;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("97", "ge01");
			put("28", "ge02");
		}
	};
	
	public GE() {
		
	}

	public GE(String ge01, String ge02, Map<String, String> dataelementmap) {
		super();
		this.ge01 = ge01;
		this.ge02 = ge02;
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

	public String getGe01() {
		return ge01;
	}

	public void setGe01(String ge01) {
		this.ge01 = ge01;
	}

	public String getGe02() {
		return ge02;
	}

	public void setGe02(String ge02) {
		this.ge02 = ge02;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
