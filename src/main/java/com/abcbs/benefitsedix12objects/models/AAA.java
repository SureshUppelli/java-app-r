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
 *          AAA01 -1073 - Yes/No condition or response code.
 *          AAA02 -559  - Agency qualifier code
 *          AAA03 -901  - Reject reason code
 *                         Code assigned by issuer to identify reason for rejection.  
 *          AAA04 -889  - Follow-up action code.
 *                        Code identifying follow-up action code.
 */
/*
 * Document modifications here:
 */
public class AAA {
	
	private String aaa01;
	private String aaa02;
	private String aaa03;
	private String aaa04;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("1073", "aaa01");
			put("559", "aaa02");
			put("901", "aaa03");
			put("889", "aaa04");
			
		}
	};
	
	public AAA() {
		
	}

	public AAA(String aaa01, String aaa02, String aaa03, String aaa04,	Map<String, String> dataelementmap) {
		super();
		this.aaa01 = aaa01;
		this.aaa02 = aaa02;
		this.aaa03 = aaa03;
		this.aaa04 = aaa04;
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

	public String getAaa01() {
		return aaa01;
	}

	public void setAaa01(String aaa01) {
		this.aaa01 = aaa01;
	}

	public String getAaa02() {
		return aaa02;
	}

	public void setAaa02(String aaa02) {
		this.aaa02 = aaa02;
	}

	public String getAaa03() {
		return aaa03;
	}

	public void setAaa03(String aaa03) {
		this.aaa03 = aaa03;
	}

	public String getAaa04() {
		return aaa04;
	}

	public void setAaa04(String aaa04) {
		this.aaa04 = aaa04;
	}

	 
	

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}
	
	

}
