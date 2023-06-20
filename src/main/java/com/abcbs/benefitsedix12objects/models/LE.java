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
*          X12 Segment Name: loop trailer
*          X12 Purpose     : To indicate that the next segment begins a loop
*          
*          TR3 Example     : LE*2120~
*          
*          LE01 447  Loop ID
 */
/*
 * Document modifications here:
 */
public class LE {

	private String le01;
	 

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("447", "le01");
			 
		}
	};

	public LE() {

	}

	public LE(String le01, Map<String, String> dataelementmap) {
		super();
		this.setLe01(le01);
		 
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

	public String getLe01() {
		return le01;
	}

	public void setLe01(String le01) {
		this.le01 = le01;
	}

}
