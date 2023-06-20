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
 *          LS - LOOP HEADER
*          X12 Segment Name: Loop Header
*          X12 Purpose     : To indicate that the next segment begins a loop
*          
*          TR3 Example     : LS*2120~
*          
*          LS01 447  Loop ID
 */
/*
 * Document modifications here:
 */
public class LS {

	private String ls01;
	 

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("447", "ls01");
			 
		}
	};

	public LS() {

	}

	public LS(String ls01, Map<String, String> dataelementmap) {
		super();
		this.setLs01(ls01);
		 
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

	public String getLs01() {
		return ls01;
	}

	public void setLs01(String ls01) {
		this.ls01 = ls01;
	}

}
