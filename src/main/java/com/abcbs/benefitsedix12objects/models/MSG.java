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
 *          X12 Segment Name:	request validation
 *          X12 Purpose: 		To specify the validity of the request and indicate follow-up action authorized.
 *          
 *          MSG01 -933 -  Free-form Message Text
 *          MSG02 -934  - Printer Carriage Control Code
 *          MSG03 -1470  - Number
 */
/*
 * Document modifications here:
 */
public class MSG {
	
	private String msg01;
	private String msg02;
	private String msg03;
	
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("933", "msg01");
			put("934", "msg02");
			put("1470", "msg03");	
		}
	};
	
	public MSG() {
		
	}

	public MSG(String msg01, String msg02, String msg03, 	Map<String, String> dataelementmap) {
		super();
		this.msg01 = msg01;
		this.msg02 = msg02;
		this.msg03 = msg03;
		
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

	public String getMsg01() {
		return msg01;
	}

	public void setMsg01(String msg01) {
		this.msg01 = msg01;
	}

	public String getMsg02() {
		return msg02;
	}

	public void setMsg02(String msg02) {
		this.msg02 = msg02;
	}

	public String getMsg03() {
		return msg03;
	}

	public void setMsg03(String msg03) {
		this.msg03 = msg03;
	}

	 

	 
	

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}
	
	

}
