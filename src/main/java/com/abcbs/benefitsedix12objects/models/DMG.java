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
 *          X12 Segment Name:   Demographic Information
 *          X12 Purpose:	    To supply demographic information
 *          
 *          DMG01 - 1250 - Date Time Period Format Qualifier
 *          					Code indicating the date format, time format, or date and time format
 *          
 *          DMG02 - 1251 - Date Time Period
 *          					Expression of a date, a time, or range of dates, times or dates and times
 *          
 *          DMG03 - 1068 - Gender Code
 *          					Code indicating the sex of the individual
 *          
 *          DMG04 - 1067 - Marital Status Code
 *          
 *          DMG05 - C056 - COMPOSITE RACE OR ETHNICITY INFORMATION
 *          
 *          DMG06 - 1066 - Citizenship Status Code
 *          
 *          DMG07 - 26 -  Country Code
 *          
 *          DMG08 - 659 - Basis of Verification Code
 *          
 *          DMG09 - 380 - Quantity
 *          
 *          DMG10 - 1270 - Code List Qualifier Code
 *          
 *          DMG11 - 1271 - Industry Code
 */
/*
 * Document modifications here:
 */
public class DMG {

	private String dmg01;
	private String dmg02;
	private String dmg03;
	private String dmg04;
	private String dmg05;
	private String dmg06;
	private String dmg07;
	private String dmg08;
	private String dmg09;
	private String dmg10;
	private String dmg11;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("1250", "dmg01");
			put("1251", "dmg02");
			put("1068", "dmg03");
			put("1067", "dmg04");
			put("C056", "dmg05");
			put("1066", "dmg06");
			put("26", "dmg07");
			put("659", "dmg08");
			put("380", "dmg09");
			put("1270", "dmg10");
			put("1271", "dmg11");
			//sumaja check with team to find dmg04 - dmg11 exist in 270 or not
		}
	};

	public DMG() {

	}

	public DMG(String dmg01, String dmg02, String dmg03, String dmg04, String dmg05, String dmg06, String dmg07,
			String dmg08, String dmg09, String dmg10, String dmg11, Map<String, String> dataelementmap) {
		super();
		this.dmg01 = dmg01;
		this.dmg02 = dmg02;
		this.dmg03 = dmg03;
		this.dmg04 = dmg04;
		this.dmg05 = dmg05;
		this.dmg06 = dmg06;
		this.dmg07 = dmg07;
		this.dmg08 = dmg08;
		this.dmg09 = dmg09;
		this.dmg10 = dmg10;
		this.dmg11 = dmg11;
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

	public String getDmg01() {
		return dmg01;
	}

	public void setDmg01(String dmg01) {
		this.dmg01 = dmg01;
	}

	public String getDmg02() {
		return dmg02;
	}

	public void setDmg02(String dmg02) {
		this.dmg02 = dmg02;
	}

	public String getDmg03() {
		return dmg03;
	}

	public void setDmg03(String dmg03) {
		this.dmg03 = dmg03;
	}

	public String getDmg04() {
		return dmg04;
	}

	public void setDmg04(String dmg04) {
		this.dmg04 = dmg04;
	}

	public String getDmg05() {
		return dmg05;
	}

	public void setDmg05(String dmg05) {
		this.dmg05 = dmg05;
	}

	public String getDmg06() {
		return dmg06;
	}

	public void setDmg06(String dmg06) {
		this.dmg06 = dmg06;
	}

	public String getDmg07() {
		return dmg07;
	}

	public void setDmg07(String dmg07) {
		this.dmg07 = dmg07;
	}

	public String getDmg08() {
		return dmg08;
	}

	public void setDmg08(String dmg08) {
		this.dmg08 = dmg08;
	}

	public String getDmg09() {
		return dmg09;
	}

	public void setDmg09(String dmg09) {
		this.dmg09 = dmg09;
	}

	public String getDmg10() {
		return dmg10;
	}

	public void setDmg10(String dmg10) {
		this.dmg10 = dmg10;
	}

	public String getDmg11() {
		return dmg11;
	}

	public void setDmg11(String dmg11) {
		this.dmg11 = dmg11;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
