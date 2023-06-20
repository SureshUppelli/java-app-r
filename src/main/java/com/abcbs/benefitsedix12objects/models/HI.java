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
 *  HI - DEPENDENT HEALTH CARE DIAGNOSIS CODE
 *	X12 Segment Name: Health Care Information Codes
*	X12 Purpose     : To supply information related to the delivery of health care
*	Loop            : 2100D — DEPENDENT NAME
*	Segment Repeat  : 1
*	Usage           : SITUATIONAL
*	Situational Rule: Required when an HI segment was received in the 270 and if the information source uses the information in the determination of the eligibility or benefit response for the dependent. All information used from the HI segment of the 270 used in the determination of the eligibility or
*	benefit response for the dependent must be returned. If information was provided in an HI segment of 270 but was not used in the determination of the eligibility or benefits for the dependent it must not be returned. The information source must not use information in an HI segment of the 270
*	transaction in the determination of eligibility or benefits for the dependent if that information cannot be returned in the 271 response. 
*	OR
*	Required when needed to identify limitations in the benefits identified in the 2110D loops, such as if benefits are limited for a specific diagnosis code if the information source can support this high level functionality. If the information source cannot support this high level functionality, do not send.
*	TR3 Notes: 1. Use the Diagnosis code pointers in 2110D EB14 to identify which diagnosis code or codes in this HI segment relates to the information
*	provided in the EB segment. 
*	           2. Do not transmit the decimal points in the diagnosis codes. The decimal point is assumed.
*	TR3 Example: HI✽BK:8901✽BF:87200✽BF:5559~
 *          
 *          HI01     C022  HEALTH CARE CODE INFORMATION
 *          					To send health care codes and their associated dates, amounts and quantities
 *          
 *          HI01 - 1 1270  Code List Qualifier Code 
 *							Code identifying a specific industry code list
 *          HI01 - 2 1271  Industry Code
 *                          Code indicating a code from a specific industry code list
 *          HI01 - 3 1250  Date Time Period Format Qualifier
 *          HI01 - 4 1251  Date Time Period
 *          HI01 - 5 782   Monetary Amount
 *          HI01 - 6 380   Quantity
 *          HI01 - 7 799   Version Identifier
 *          HI01 - 8 1271  Industry Code
 *          HI01 - 9 1073  Yes/No Condition or Response Code
 *               
 *          HI02     C022  HEALTH CARE CODE INFORMATION 
 *                         To send health care codes and their associated dates, amounts and quantities
 *          HI02 - 1 1270  Code List Qualifier Code
 *                          Code identifying a specific industry code list
 *          HI02 - 2 1271  Industry Code
 *                          Code indicating a code from a specific industry code list
 *                         
 *          HI02 - 3 1250  Date Time Period Format Qualifier
 *          HI02 - 4 1251  Date Time Period
 *          HI02 - 5 782   Monetary Amount 
 *          HI02 - 6 380   Quantity 
 *          HI02 - 7 799   Version Identifier 
 *          HI02 - 8 1271  Industry Code 
 *          HI02 - 9 1073  Yes/No Condition or Response Code                         
 *          
 *          HI03     C022  HEALTH CARE CODE INFORMATION 
 *                          To send health care codes and their associated dates, amounts and quantities               
 *          HI03 - 1 1270  Code List Qualifier Code
 *                            Code identifying a specific industry code list
 *                        
 *          HI03 - 2 1271 Industry Code              
 *                         Code indicating a code from a specific industry code list
 *          HI03 - 3 1250  Date Time Period Format Qualifier
 *          HI03 - 4 1251  Date Time Period
 *          HI03 - 5 782   Monetary Amount
 *          HI03 - 6 380   Quantity
 *          HI03 - 7 799   Version Identifier
 *          HI03 - 8 1271  Industry Code
 *          HI03 - 9 1073  Yes/No Condition or Response Code
 *                                   
 *          HI04     C022  HEALTH CARE CODE INFORMATION 
 *                         To send health care codes and their associated dates, amounts and quantities               
 *          HI04 - 1 1270  Code List Qualifier Code              
 *                          Code identifying a specific industry code list
 *          HI04 - 2 1271  Industry Code              
 *                          HI04 - 2 1271 Industry Code
 *          HI04 - 3 1250  Date Time Period Format Qualifier 
 *          HI04 - 4 1251  Date Time Period
 *          HI04 - 5 782   Monetary Amount 
 *          HI04 - 6 380   Quantity  
 *          HI04 - 7 799  Version Identifier  
 *          HI04 - 8 1271 Industry Code 
 *          HI04 - 9 1073 Yes/No Condition or Response Code  
 *          
 *          HI05     C022 HEALTH CARE CODE INFORMATION                    
 *                         To send health care codes and their associated dates, amounts and quantities
 *          HI05 - 1 1270 Code List Qualifier Code              
 *                         Code identifying a specific industry code list
 *          HI05 - 2 1271 Industry Code              
 *                         Code indicating a code from a specific industry code list       
 *          HI05 - 3 1250 Date Time Period Format Qualifier
 *          HI05 - 4 1251 Date Time Period
 *          HI05 - 5 782  Monetary Amount
 *          HI05 - 6 380  Quantity
 *          HI05 - 7 799  Version Identifier
 *          HI05 - 8 1271 Industry Code
 *          HI05 - 9 1073 Yes/No Condition or Response Code
 *                                          
 *          HI06     C022 HEALTH CARE CODE INFORMATION                      
 *                          To send health care codes and their associated dates, amounts and quantities      
 *          HI06 - 1 1270 Code List Qualifier Code
 *                          Code identifying a specific industry code list
 *          HI06 - 2 1271 Industry Code                      
 *                          Code indicating a code from a specific industry code list    
 *          HI06 - 3 1250 Date Time Period Format Qualifier 
 *          HI06 - 4 1251 Date Time Period 
 *          HI06 - 5 782  Monetary Amount 
 *          HI06 - 6 380  Quantity 
 *          HI06 - 7 799  Version Identifier 
 *          HI06 - 8 1271 Industry Code 
 *          HI06 - 9 1073 Yes/No Condition or Response Code    
 *                             
 *          HI07     C022 HEALTH CARE CODE INFORMATION 
 *                           To send health care codes and their associated dates, amounts and quantities 
 *          HI07 - 1 1270 Code List Qualifier Code 
 *                          Code identifying a specific industry code list                     
 *          HI07 - 2 1271 Industry Code                      
 *          HI07 - 3 1250 Date Time Period Format Qualifier 
 *          HI07 - 4 1251 Date Time Period  
 *          HI07 - 5 782  Monetary Amount  
 *          HI07 - 6 380  Quantity  
 *          HI07 - 7 799  Version Identifier 
 *          HI07 - 8 1271 Industry Code  
 *          HI07 - 9 1073 Yes/No Condition or Response Code                       
 *          HI08     C022 HEALTH CARE CODE INFORMATION  
 *                         To send health care codes and their associated dates, amounts and quantities    
 *          HI08 - 1 1270 Code List Qualifier Code
 *                         Code identifying a specific industry code list
 *          HI08 - 2 1271 Industry Code
 *                         Code indicating a code from a specific industry code list
 *          HI08 - 3 1250 Date Time Period Format Qualifier
 *          HI08 - 4 1251 Date Time Period 
 *          HI08 - 5 782  Monetary Amount 
 *          HI08 - 6 380  Quantity 
 *          HI08 - 7 799  Version Identifier  
 *          HI08 - 8 1271 Industry Code  
 *          HI08 - 9 1073 Yes/No Condition or Response Code                                           
 *         HI09      C022 HEALTH CARE CODE INFORMATION
 *         HI10      C022 HEALTH CARE CODE INFORMATION
 *         HI11      C022 HEALTH CARE CODE INFORMATION
 *         HI12      C022 HEALTH CARE CODE INFORMATION           
 *                     
 *           
 */
/*
 * Document modifications here:
 */
public class HI {
	
	private Map<Integer, String> hi01 = new HashMap<Integer, String>();
	private Map<Integer, String> hi02 = new HashMap<Integer, String>();
	private Map<Integer, String> hi03 = new HashMap<Integer, String>();
	private Map<Integer, String> hi04 = new HashMap<Integer, String>();
	private Map<Integer, String> hi05 = new HashMap<Integer, String>();
	private Map<Integer, String> hi06 = new HashMap<Integer, String>();
	private Map<Integer, String> hi07 = new HashMap<Integer, String>();
	private Map<Integer, String> hi08 = new HashMap<Integer, String>();
	private String hi09;
	private String hi10;
	private String hi11;
	private String hi12;
	
	public HI() {
		
	}

	public HI(Map<Integer, String> hi01,
			Map<Integer, String> hi02,
			Map<Integer, String> hi03,
			Map<Integer, String> hi04,
			Map<Integer, String> hi05,
			Map<Integer, String> hi06,
			Map<Integer, String> hi07,
			Map<Integer, String> hi08,String hi09,String hi10,String hi11,String hi12) {
		super();
		this.hi01=hi01;
		this.hi02=hi02;
		this.hi03=hi03;
		this.hi04=hi04;
		this.hi05=hi05;
		this.hi06=hi06;
		this.hi07=hi07;
		this.hi08=hi08;
		this.hi09=hi09;
		this.hi10=hi10;
		this.hi11=hi11;
		this.hi12=hi12;
	}

	public Map<Integer, String> getHi01() {
		return hi01;
	}

	public void setHi01(Map<Integer, String> hi01) {
		this.hi01 = hi01;
	}

	public Map<Integer, String> getHi02() {
		return hi02;
	}

	public void setHi02(Map<Integer, String> hi02) {
		this.hi02 = hi02;
	}

	public Map<Integer, String> getHi03() {
		return hi03;
	}

	public void setHi03(Map<Integer, String> hi03) {
		this.hi03 = hi03;
	}

	public Map<Integer, String> getHi04() {
		return hi04;
	}

	public void setHi04(Map<Integer, String> hi04) {
		this.hi04 = hi04;
	}

	public Map<Integer, String> getHi05() {
		return hi05;
	}

	public void setHi05(Map<Integer, String> hi05) {
		this.hi05 = hi05;
	}

	public Map<Integer, String> getHi06() {
		return hi06;
	}

	public void setHi06(Map<Integer, String> hi06) {
		this.hi06 = hi06;
	}

	public Map<Integer, String> getHi07() {
		return hi07;
	}

	public void setHi07(Map<Integer, String> hi07) {
		this.hi07 = hi07;
	}

	public Map<Integer, String> getHi08() {
		return hi08;
	}

	public void setHi08(Map<Integer, String> hi08) {
		this.hi08 = hi08;
	}

	public String getHi09() {
		return hi09;
	}

	public void setHi09(String hi09) {
		this.hi09 = hi09;
	}

	public String getHi10() {
		return hi10;
	}

	public void setHi10(String hi10) {
		this.hi10 = hi10;
	}

	public String getHi11() {
		return hi11;
	}

	public void setHi11(String hi11) {
		this.hi11 = hi11;
	}

	public String getHi12() {
		return hi12;
	}

	public void setHi12(String hi12) {
		this.hi12 = hi12;
	}

	 
	
	
}
