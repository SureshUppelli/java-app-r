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
 *          X12 Segment Name:	Beginning of Hierarchical Transaction
 *          X12 Purpose: 		To define the business hierarchical structure of the transaction set
 *          					and identify the business application purpose and reference data, 
 *          					i.e., number, date, and time.
 *          
 *          BHT01 - 1005 - Hierarchical Structure Code
 *          					Code indicating the hierarchical application structure of a transaction
 *          					set that utilizes the HL segment to define the structure of the transaction set.
 *          
 *          BHT02 - 353 - Transaction Set Purpose Code
 *          					Code identifying purpose of transaction set.
 *          
 *          BHT03 - 127 - Reference Identification
 *          					Reference information as defined for a particular Transaction Set or as specified
 *          					by the Reference Identification Qualifier.
 *          
 *          BHT04 - 373 - Date
 *          					Date expressed as CCYYMMDD where CC represents the first two digits of the
 *          					calendar year.
 *          
 *          BHT05 - 337 - Time
 *          					Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or
 *          					HHMMSSDD, where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59)
 *          					and DD = decimal seconds; decimal seconds are expressed as follows: D = tenths (0-9)
 *          					and DD = hundreths (00-99).
 *          
 *          BHT06 - 640 - Transaction Type Code
 *          					Code specifying the type of transaction.
 */
/*
 * Document modifications here:
 */
public class BHT {
	
	private String bht01;
	private String bht02;
	private String bht03;
	private String bht04;
	private String bht05;
	private String bht06;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("1005", "bht01");
			put("353", "bht02");
			put("127", "bht03");
			put("373", "bht04");
			put("337", "bht05");
			put("640", "bht06");
			
		}
	};
	
	public BHT() {
		
	}

	public BHT(String bht01, String bht02, String bht03, String bht04, String bht05, String bht06,
			Map<String, String> dataelementmap) {
		super();
		this.bht01 = bht01;
		this.bht02 = bht02;
		this.bht03 = bht03;
		this.bht04 = bht04;
		this.bht05 = bht05;
		this.bht06 = bht06;
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

	public String getBht01() {
		return bht01;
	}

	public void setBht01(String bht01) {
		this.bht01 = bht01;
	}

	public String getBht02() {
		return bht02;
	}

	public void setBht02(String bht02) {
		this.bht02 = bht02;
	}

	public String getBht03() {
		return bht03;
	}

	public void setBht03(String bht03) {
		this.bht03 = bht03;
	}

	public String getBht04() {
		return bht04;
	}

	public void setBht04(String bht04) {
		this.bht04 = bht04;
	}

	public String getBht05() {
		return bht05;
	}

	public void setBht05(String bht05) {
		this.bht05 = bht05;
	}

	public String getBht06() {
		return bht06;
	}

	public void setBht06(String bht06) {
		this.bht06 = bht06;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}
	
	

}
