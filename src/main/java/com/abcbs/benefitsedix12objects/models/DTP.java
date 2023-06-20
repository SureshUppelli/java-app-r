package com.abcbs.benefitsedix12objects.models;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	5-18-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          X12 Segment Name:	Date or Time or Period
 *          X12 Purpose:		To specify any or all of a date, a time, or a time period
 *          
 *          DTP01 - 374 - Date/Time Qualifier
 *          					Code specifying type of date or time, or both date and time
 *          
 *          DTP02 - 1250 - Date Time Period Format Qualifier
 *          					Code indicating the date format, time format, or date and time format
 *          
 *          DTP03 - 1251 - Date Time Period
 *          					Expression of a date, a time, or range of dates, times or dates and times
 */
/*
 * Document modifications here:
 */
public class DTP {

	private String dtp01;
	private String dtp02;
	private String dtp03;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("374", "dtp01");
			put("1250", "dtp02");
			put("1251", "dtp03");
		}
	};

	public DTP() {

	}

	public DTP(String dtp01, String dtp02, String dtp03, Map<String, String> dataelementmap) {
		super();
		this.dtp01 = dtp01;
		this.dtp02 = dtp02;
		this.dtp03 = dtp03;
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

	public String getDtp01() {
		return dtp01;
	}

	public void setDtp01(String dtp01) {
		this.dtp01 = dtp01;
	}

	public String getDtp02() {
		return dtp02;
	}

	public void setDtp02(String dtp02) {
		this.dtp02 = dtp02;
	}

	public String getDtp03() {
		return dtp03;
	}

	public void setDtp03(String dtp03) {
		this.dtp03 = dtp03;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
