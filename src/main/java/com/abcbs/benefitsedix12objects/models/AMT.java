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
 *          X12 Segment Name:	Monetary Amount Information
 *          X12 Purpose:	    To indicate the total monetary amount
 *          
 *          AMT01 - 522 - Amount Qualifier Code
 *          					Code to qualify amount
 *          
 *          AMT02 - 782 -  Monetary Amount
 *          					Monetary amount
 *          
 *          AMT03 - 478 -  Credit/Debit Flag Code  
 */
/*
 * Document modifications here:
 */
public class AMT {

	private String amt01;
	private String amt02;
	private String amt03;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("522", "amt01");
			put("782", "amt02");
			put("478", "amt03");
		}
	};

	public AMT() {

	}

	public AMT(String amt01, String amt02, String amt03, Map<String, String> dataelementmap) {
		super();
		this.amt01 = amt01;
		this.amt02 = amt02;
		this.amt03 = amt03;
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

	public String getAmt01() {
		return amt01;
	}

	public void setAmt01(String amt01) {
		this.amt01 = amt01;
	}

	public String getAmt02() {
		return amt02;
	}

	public void setAmt02(String amt02) {
		this.amt02 = amt02;
	}

	public String getAmt03() {
		return amt03;
	}

	public void setAmt03(String amt03) {
		this.amt03 = amt03;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
