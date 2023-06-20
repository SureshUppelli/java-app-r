package com.abcbs.benefitsedix12objects.models;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *  
 *  EB - SUBSCRIBER ELIGIBILITY OR BENEFIT INFORMATION
 *  X12 Segment Name: Eligibility or Benefit Information
 *  X12 Purpose: To supply eligibility or benefit information
 *  X12 Syntax: 1. P0910  If either EB09 or EB10 is present, then the other is required.
 *  Loop: 2110C — SUBSCRIBER ELIGIBILITY OR BENEFIT INFORMATION Loop


 *  EB01 1390  - Eligibility Benefit Inf
 *  EB02 1207 - Coverage Level Code
 *  EB03 1365  - Service Type Code
 *  EB04 1336  - Insurance Type Code
 *  EB05 1204  - Plan Cvrg Description
 *  EB06 615 - Time Period Qualifier
 *  EB07 782 -Monetary Amount
 *  EB08 954 - Percent 
 *  EB09 673  - Quantity Qualifier
 *  EB10 380  - Quantity 
 *  EB11 1073 - Yes/No Cond Resp Code
 *  EB12 1073 - Yes/No Cond Resp Code
 *  EB13 C003 - Comp. Med.Proced. ID
 *  EB14 C004 - Comp. Diag.Code Point
 *                     
 *           
 */
/*
 * Document modifications here:
 */
public class EB {
	private String eb01;
	private String eb02;
	//private String eb03;
	private Map<Integer, String> eb03 = new HashMap<Integer, String>();
	private String eb04;
	private String eb05;
	private String eb06;
	private String eb07;
	private String eb08;
	private String eb09;
	private String eb10;
	private String eb11;
	private String eb12;
	
	private Map<Integer, String> eb13 = new HashMap<Integer, String>();
	private Map<Integer, String> eb14 = new HashMap<Integer, String>();
	
	public EB() {
		
	}

	public EB( String eb01,
	 String eb02,
	 //String eb03,
	 Map<Integer, String> eb03 ,
	 String eb04,
	 String eb05,
	 String eb06,
	 String eb07,
	 String eb08,
	 String eb09,
	 String eb10,
	 String eb11,
	 String eb12,	
	 Map<Integer, String> eb13 ,
	 Map<Integer, String> eb14 ) {
		super();
		this.eb01=eb01;
		this.eb02=eb02;
		this.eb03=eb03;
		this.eb04=eb04;
		this.eb05=eb05;
		this.eb06=eb06;
		this.eb07=eb07;
		this.eb08=eb08;
		this.eb09=eb09;
		this.eb10=eb10;
		this.eb11=eb11;
		this.eb12=eb12;
		this.eb13=eb13;
		this.eb14=eb14;
	}

	public String getEb01() {
		return eb01;
	}

	public void setEb01(String eb01) {
		this.eb01 = eb01;
	}

	public String getEb02() {
		return eb02;
	}

	public void setEb02(String eb02) {
		this.eb02 = eb02;
	}

//	public String getEb03() {
//		return eb03;
//	}
//
//	public void setEb03(String eb03) {
//		this.eb03 = eb03;
//	}

	public String getEb04() {
		return eb04;
	}

	public void setEb04(String eb04) {
		this.eb04 = eb04;
	}

	public String getEb05() {
		return eb05;
	}

	public void setEb05(String eb05) {
		this.eb05 = eb05;
	}

	public String getEb06() {
		return eb06;
	}

	public void setEb06(String eb06) {
		this.eb06 = eb06;
	}

	public String getEb07() {
		return eb07;
	}

	public void setEb07(String eb07) {
		this.eb07 = eb07;
	}

	public String getEb08() {
		return eb08;
	}

	public void setEb08(String eb08) {
		this.eb08 = eb08;
	}

	public String getEb09() {
		return eb09;
	}

	public void setEb09(String eb09) {
		this.eb09 = eb09;
	}

	public String getEb10() {
		return eb10;
	}

	public void setEb10(String eb10) {
		this.eb10 = eb10;
	}

	public String getEb11() {
		return eb11;
	}

	public void setEb11(String eb11) {
		this.eb11 = eb11;
	}

	public String getEb12() {
		return eb12;
	}

	public void setEb12(String eb12) {
		this.eb12 = eb12;
	}

	public Map<Integer, String> getEb13() {
		return eb13;
	}

	public void setEb13(Map<Integer, String> eb13) {
		this.eb13 = eb13;
	}

	public Map<Integer, String> getEb14() {
		return eb14;
	}

	public void setEb14(Map<Integer, String> eb14) {
		this.eb14 = eb14;
	}

	public Map<Integer, String> getEb03() {
		return eb03;
	}

	public void setEb03(Map<Integer, String> eb03) {
		this.eb03 = eb03;
	}

	 
	 
	
	
}
