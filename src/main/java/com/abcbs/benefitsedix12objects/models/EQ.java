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
 *  EQ - SUBSCRIBER ELIGIBILITY OR BENEFIT INQUIRY
 *			X12 Segment Name: Eligibility or Benefit Inquiry
 *			X12 Purpose     : To specify inquired eligibility or benefit information
 *          
 *          EQ01 1365 Service Type Code
 *          			Code identifying the classification of service
 *          EQ02 C003 COMPOSITE MEDICAL PROCEDURE IDENTIFIER
 *                      To identify a medical procedure by its standardized codes and applicable modifiers
 *          EQ02 - 1 235 Product/Service ID Qualifier
 *                        Code identifying the type/source of the descriptive number used in Product/Service ID (234)
 *          EQ02 - 2 234 Product/Service ID
 *                        Identifying number for a product or service
 *          EQ02 - 3 1339 Procedure Modifier
 *                            This identifies special circumstances related to the performance of the service, as defined by trading partners              
 *          EQ02 - 4 1339 Procedure Modifier 
 *                            This identifies special circumstances related to the performance of the service, as defined by trading partners                            
 *          EQ02 - 5 1339 Procedure Modifier
 *                            This identifies special circumstances related to the performance of the service, as defined by trading partners                            
 *          EQ02 - 6 1339 Procedure Modifier
 *                            This identifies special circumstances related to the performance of the service, as defined by trading partners
 *                            
 *          EQ02 - 7 352 Description                                               
 *          EQ02 - 8 234 Product/Service ID
 *          
 *          EQ03 1207 Coverage Level Code
 *                             Code indicating the level of coverage being provided for this insured
 *          EQ04 1336 Insurance Type Code
 *          EQ05 C004 COMPOSITE DIAGNOSIS CODE POINTER 
 *                             To identify one or more diagnosis code pointers
 *          EQ05 - 1 1328 Diagnosis Code Pointer 
 *                             A pointer to the diagnosis code in the order of importance to this service
 *          EQ05 - 2 1328 Diagnosis Code Pointer 
 *                             A pointer to the diagnosis code in the order of importance to this service                                              
 *          EQ05 - 3 1328 Diagnosis Code Pointer 
 *                             A pointer to the diagnosis code in the order of importance to this service                                              
 *          EQ05 - 4 1328 Diagnosis Code Pointer 
 *                             A pointer to the diagnosis code in the order of importance to this service                                              
 *           
 */
/*
 * Document modifications here:
 */
public class EQ {
	
//	private String eq01;
	private Map<Integer, String> eq01 = new HashMap<Integer, String>();
	private Map<Integer, String> eq02 = new HashMap<Integer, String>();
	private String eq03;
	
	private String eq04;
	private Map<Integer, String> eq05 = new HashMap<Integer, String>();
	
	public EQ() {
		
	}

	public EQ(Map<Integer, String>  eq01, Map<Integer, String> eq02, String eq03, String eq04, Map<Integer, String> eq05,
			String stc12) {
		super();
		this.eq01 = eq01;
		this.eq02 = eq02;
		this.eq03 = eq03;
		this.eq04 = eq04;
		this.eq05 = eq05;
	}

//	public String getEq01() {
//		return eq01;
//	}
//
//	public void setEq01(String eq01) {
//		this.eq01 = eq01;
//	}

	public Map<Integer, String> getEq02() {
		return eq02;
	}

	public void setEq02(Map<Integer, String> eq02) {
		this.eq02 = eq02;
	}

	public String getEq03() {
		return eq03;
	}

	public void setEq03(String eq03) {
		this.eq03 = eq03;
	}

	public String getEq04() {
		return eq04;
	}

	public void setEq04(String eq04) {
		this.eq04 = eq04;
	}

	public Map<Integer, String> getEq05() {
		return eq05;
	}

	public void setEq05(Map<Integer, String> eq05) {
		this.eq05 = eq05;
	}

	public Map<Integer, String> getEq01() {
		return eq01;
	}

	public void setEq01(Map<Integer, String> eq01) {
		this.eq01 = eq01;
	}
 
	
}
