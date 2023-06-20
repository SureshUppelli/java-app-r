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
 * II - SUBSCRIBER ELIGIBILITY OR BENEFIT ADDITIONAL INQUIRY INFORMATION
 * X12 Segment Name    : Information
 * X12 Purpose         : To report information
 * X12 Syntax          : 1. P0102 If either III01 or III02 is present, then the other is required.
 *                       2. L030405 If III03 is present, then at least one of III04 or III05 are required.
 * Loop                : 2110C — SUBSCRIBER ELIGIBILITY OR BENEFIT INQUIRY
 * Segment Repeat      : 1
 * Usage               : SITUATIONAL
 * Situational Rule    : Required when the information receiver believes the Facility Type information is relevant to the inquiry and the information is available. If not required by this implementation guide, do not send.
 * TR3 Notes           : 1. Use the III segment when an information source supports or may be thought to support this level of functionality. If not supported, the information source will process without this segment.
 * TR3 Example         : III✽ZZ✽21~
 * 
 *          III01 1270 Code List Qualifier Code
 *                       Code identifying a specific industry code list
 *          III02 1271 Industry Code
 *                       Code indicating a code from a specific industry code list 
 *          III04 933  Free-form Message Text
 *          III05 380  Quantity 
 *          III06 C001 COMPOSITE UNIT OF MEASURE 
 *          III07 752  Surface/Layer/Position Code
 *          III08 752  Surface/Layer/Position Code
 *          III09 752  Surface/Layer/Position Code
 */
/*
 * Document modifications here:
 */
public class III {

	private String  iii01;
	private String  iii02;
	private String  iii03;
	private String  iii04;
	private String  iii05;
	private String  iii06;
	private String  iii07;
	private String  iii08;
	private String  iii09;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{

		put("1270","iii01");
		
		put("1271","iii02");
		put("1136","iii03");
		          
		put("933 ","iii04");
		put("380 ","iii05");
		put("c001","iii06");
		put("752 ","iii07");
		put("752 ","iii08");
		put("752 ","iii09");
		}
	};

	public III() {

	}

	public III( String  iii01,
			 String  iii02,
			 String  iii04,
			 String  iii05,
			 String  iii06,
			 String  iii07,
			 String  iii08,
			 String  iii09, Map<String, String> dataelementmap) {
		super();
		this.iii01=iii01;
		 this.iii02=iii02;
		 this.iii04=iii04;
		 this.iii05=iii05;
		 this.iii06=iii06;
		 this.iii07=iii07;
		 this.iii08=iii08;
		 this.iii09=iii09;
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

	 

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

	public String getIii01() {
		return iii01;
	}

	public void setIii01(String iii01) {
		this.iii01 = iii01;
	}

	public String getIii02() {
		return iii02;
	}

	public void setIii02(String iii02) {
		this.iii02 = iii02;
	}

	public String getIii04() {
		return iii04;
	}

	public void setIii04(String iii04) {
		this.iii04 = iii04;
	}

	public String getIii05() {
		return iii05;
	}

	public void setIii05(String iii05) {
		this.iii05 = iii05;
	}

	public String getIii06() {
		return iii06;
	}

	public void setIii06(String iii06) {
		this.iii06 = iii06;
	}

	public String getIii07() {
		return iii07;
	}

	public void setIii07(String iii07) {
		this.iii07 = iii07;
	}

	public String getIii08() {
		return iii08;
	}

	public void setIii08(String iii08) {
		this.iii08 = iii08;
	}

	public String getIii09() {
		return iii09;
	}

	public void setIii09(String iii09) {
		this.iii09 = iii09;
	}

	public String getIii03() {
		return iii03;
	}

	public void setIii03(String iii03) {
		this.iii03 = iii03;
	}

}
