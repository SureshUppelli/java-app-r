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
 *          INS - DEPENDENT RELATIONSHIP
 *          X12 Segment Name: Insured Benefit
 * 			X12 Purpose     : To provide benefit information on insured entities
 *			X12 Syntax      : 1. P1112 If either INS11 or INS12 is present, then the other is required.
 *			Loop            : 2100D — DEPENDENT NAME
 *			Segment Repeat  : 1
 *			Usage           : SITUATIONAL
 *			Situational Rule: Required when the Dependent is the patient unless a rejection response is generated with a 2100D or 2110D AAA segment and this segment was not
 *							  sent in the request. If not required by this implementation guide, may be provided at sender’s discretion but cannot be required by the receiver. 
 *			TR3 Notes       : 1. This segment may also be used to identify that the information source has changed some of the identifying elements for the dependent that the information receiver submitted in the original 270 transaction. 
 * 			TR3 Example     : INS✽N✽19✽✽✽✽✽✽✽✽✽✽✽✽✽✽✽3~
 */
/*
 * Document modifications here:
 */
public class INS {
	
	private String ins01;
	private String ins02;
	private String ins03;
	private String ins04;
	private String ins17;
	
	private String ins05;
	private String ins06;
	private String ins07;
	private String ins08;
	private String ins09;
	private String ins10;
	private String ins11;
	private String ins12;
	private String ins13;
	private String ins14;
	private String ins15;
	private String ins16;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("1073", "ins01");
			put("1069", "ins02");
			put("875", "ins03");
			put("1203", "ins04");
			put("1470", "ins17");

			put("1216", "ins05");
			put("C052", "ins06");
			put("1219", "ins07");
			put("584 ", "ins08");
			put("1220", "ins09");
			put("1073", "ins10");
			put("1250", "ins11");
			put("1251", "ins12");
			put("1165", "ins13");
			put("19", "ins14");
			put("156", "ins15");
			put("26", "ins16");
			 
		}
	};
	
	public INS() {
		
	}

	public INS(String ins01,
			String ins02,
			String ins03,
			String ins04,
			String ins17,
             
			String ins05,
			String ins06,
			String ins07,
			String ins08,
			String ins09,
			String ins10,
			String ins11,
			String ins12,
			String ins13,
			String ins14,
			String ins15,
			String ins16,
           Map<String, String> dataelementmap) {
		super();
		this.ins01=ins01;
		this.ins02=ins02;
		this.ins03=ins03;
		this.ins04=ins04;
		this.ins17=ins17;
		
	    this.ins05=ins05;
		this.ins06=ins06;
		this.ins07=ins07;
		this.ins08=ins08;
		this.ins09=ins09;
		this.ins10=ins10;
		this.ins11=ins11;
		this.ins12=ins12;
		this.ins13=ins13;
		this.ins14=ins14;
		this.ins15=ins15;
		this.ins16=ins16;
		this.dataelementmap = dataelementmap;
	}
	
	public String getByDataElement(String dataelement) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass()
				.getMethod("get" + dataelement.substring(0, 1).toUpperCase() + dataelement.substring(1), null);
		return (String) method.invoke(this.getClass(), null);
	}

	public String getIns01() {
		return ins01;
	}

	public void setIns01(String ins01) {
		this.ins01 = ins01;
	}

	public String getIns02() {
		return ins02;
	}

	public void setIns02(String ins02) {
		this.ins02 = ins02;
	}

	public String getIns03() {
		return ins03;
	}

	public void setIns03(String ins03) {
		this.ins03 = ins03;
	}

	public String getIns04() {
		return ins04;
	}

	public void setIns04(String ins04) {
		this.ins04 = ins04;
	}

	public String getIns17() {
		return ins17;
	}

	public void setIns17(String ins17) {
		this.ins17 = ins17;
	}

	public String getIns05() {
		return ins05;
	}

	public void setIns05(String ins05) {
		this.ins05 = ins05;
	}

	public String getIns06() {
		return ins06;
	}

	public void setIns06(String ins06) {
		this.ins06 = ins06;
	}

	public String getIns07() {
		return ins07;
	}

	public void setIns07(String ins07) {
		this.ins07 = ins07;
	}

	public String getIns08() {
		return ins08;
	}

	public void setIns08(String ins08) {
		this.ins08 = ins08;
	}

	public String getIns09() {
		return ins09;
	}

	public void setIns09(String ins09) {
		this.ins09 = ins09;
	}

	public String getIns10() {
		return ins10;
	}

	public void setIns10(String ins10) {
		this.ins10 = ins10;
	}

	public String getIns11() {
		return ins11;
	}

	public void setIns11(String ins11) {
		this.ins11 = ins11;
	}

	public String getIns12() {
		return ins12;
	}

	public void setIns12(String ins12) {
		this.ins12 = ins12;
	}

	public String getIns13() {
		return ins13;
	}

	public void setIns13(String ins13) {
		this.ins13 = ins13;
	}

	public String getIns14() {
		return ins14;
	}

	public void setIns14(String ins14) {
		this.ins14 = ins14;
	}

	public String getIns15() {
		return ins15;
	}

	public void setIns15(String ins15) {
		this.ins15 = ins15;
	}

	public String getIns16() {
		return ins16;
	}

	public void setIns16(String ins16) {
		this.ins16 = ins16;
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
