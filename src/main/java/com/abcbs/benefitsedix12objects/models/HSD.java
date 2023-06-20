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
*          HSD - HEALTH CARE SERVICES DELIVERY
*          X12 Segment Name: Health Care Services Delivery
*          X12 Purpose     : To specify the delivery pattern of health care services
*          
*          
*          TR3 Example : HSD*VS*30***22~
*                        Thirty visits per service year
*          TR3 Example: HSD*VS*12*WK*3*34*1~
*                          Twelve visits, three visits per week, for 1 month.
*                          
*          HSD01 673   Quantity Qualifier
*          HSD02 380   Quantity
*          HSD03 355   Unit/Basis Meas Code
*          HSD04 1167  Sample Sel Modulus 
*          HSD05 615   Time Period Qualifier
*          HSD06 616   Number of Periods 
*          HSD07 678   Ship/Del or Calend Code
*          HSD08 679   Ship/Del Time Code

 */
/*
 * Document modifications here:
 */
public class HSD {	
	private String hsd01;
	private String hsd02;
	private String hsd03;
	private String hsd04;
	private String hsd05;
	private String hsd06;
	private String hsd07;
	private String hsd08;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("673","hsd01");
			put("380","hsd02");
			put("355","hsd03");
			put("1167","hsd04");
			put("615","hsd05");
			put("616","hsd06");
			put("678","hsd07");
			put("679","hsd08");
			
		}
	};
	
	public HSD() {
		
	}

	public HSD(String hsd01, String hsd02, String hsd03, String hsd04, String hsd05, String hsd06, String hsd07,	Map<String, String> dataelementmap) {
		super();
		this.hsd01 = hsd01;
		this.hsd02 = hsd02;
		this.hsd03 = hsd03;
		this.hsd04 = hsd04;
		this.hsd05 = hsd05;
		this.hsd06 = hsd06;
		this.hsd07 = hsd07;
		
		this.dataelementmap = dataelementmap;
	}
	
	public String getHsd01() {
		return hsd01;
	}

	public void setHsd01(String hsd01) {
		this.hsd01 = hsd01;
	}

	public String getHsd02() {
		return hsd02;
	}

	public void setHsd02(String hsd02) {
		this.hsd02 = hsd02;
	}

	public String getHsd03() {
		return hsd03;
	}

	public void setHsd03(String hsd03) {
		this.hsd03 = hsd03;
	}

	public String getHsd04() {
		return hsd04;
	}

	public void setHsd04(String hsd04) {
		this.hsd04 = hsd04;
	}

	public String getHsd05() {
		return hsd05;
	}

	public void setHsd05(String hsd05) {
		this.hsd05 = hsd05;
	}

	public String getHsd06() {
		return hsd06;
	}

	public void setHsd06(String hsd06) {
		this.hsd06 = hsd06;
	}

	public String getHsd07() {
		return hsd07;
	}

	public void setHsd07(String hsd07) {
		this.hsd07 = hsd07;
	}

	public String getHsd08() {
		return hsd08;
	}

	public void setHsd08(String hsd08) {
		this.hsd08 = hsd08;
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
	
	

}
