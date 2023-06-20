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
 *          X12 Segment Name:	Status Information
 *          X12 Purpose:	    To report the status, required action, and paid information of a claim or service
 *          					line
 *          
 *          STC01 - C043 -  HEALTH CARE CLAIM STATUS
 *          					Used to convey status of the entire claim or a specific service line
 *          
 *          STC01-1 - 1271 - Industry Code
 *          					Code indicating a code from a specific industry code list
 *          
 *          STC01-2 - 1271 - Industry Code
 *          					Code indicating a code from a specific industry code list
 *          
 *          STC01-3 - 98 - Entity Identifier Code
 *          					Code identifying an organizational entity, a physical location, property or
 *          					an individual
 *          
 *          STC01-4 - 1270 - Code List Qualifier Code
 *          					Code identifying a specific industry code list
 *          
 *          STC02 - 373 -  Date
 *          					Date expressed as CCYYMMDD where CC represents the first two digits of the
 *          					calendar year
 *          
 *          STC03 - 306 - Action Code
 *          
 *          STC04 - 782 - Monetary Amount
 *          
 *          STC05 - 782 - Monetary Amount
 *          
 *          STC06 - 373 - Date
 *          
 *          STC07 - 591 - Payment Method Code
 *          
 *          STC08 - 373 - Date
 *          
 *          STC09 - 429 - Check Number
 *          
 *          STC10 - C043 - HEALTH CARE CLAIM STATUS
 *          					Used to convey status of the entire claim or a specific service line
 *          
 *          STC10-1 - 1271 - Industry Code
 *          					Code indicating a code from a specific industry code list
 *          
 *          STC10-2 - 1271 - Industry Code
 *          					Code indicating a code from a specific industry code list
 *          
 *          STC10-3 - 98 - Entity Identifier Code
 *          					Code identifying an organizational entity, a physical location, property or
 *          					an individual
 *          
 *          STC10-4 - 1270 - Code List Qualifier Code
 *          					Code identifying a specific industry code list
 *          
 *          STC11 - C043 - HEALTH CARE CLAIM STATUS
 *          
 *          STC11-1 - 1271 - Industry Code
 *          					Code indicating a code from a specific industry code list
 *          
 *          STC11-2 - 1271 - Industry Code
 *          					Code indicating a code from a specific industry code list
 *          
 *          STC11-3 - 98 - Entity Identifier Code
 *          					Code identifying an organizational entity, a physical location, property or
 *          					an individual
 *          
 *          STC11-4 - 1270 - Code List Qualifier Code
 *          					Code identifying a specific industry code list
 *          
 *          STC12 - 933 - Free-form Message Text
 */
/*
 * Document modifications here:
 */
public class STC {
	
	private Map<Integer, String> stc01 = new HashMap<Integer, String>();
	private String stc02;
	private String stc03;
	private String stc04;
	private String stc05;
	private String stc06;
	private String stc07;
	private String stc08;
	private String stc09;
	private Map<Integer, String> stc10 = new HashMap<Integer, String>();
	private Map<Integer, String> stc11 = new HashMap<Integer, String>();
	private String stc12;
	
	public STC() {
		
	}

	public STC(Map<Integer, String> stc01, String stc02, String stc03, String stc04, String stc05, String stc06,
			String stc07, String stc08, String stc09, Map<Integer, String> stc10, Map<Integer, String> stc11,
			String stc12) {
		super();
		this.stc01 = stc01;
		this.stc02 = stc02;
		this.stc03 = stc03;
		this.stc04 = stc04;
		this.stc05 = stc05;
		this.stc06 = stc06;
		this.stc07 = stc07;
		this.stc08 = stc08;
		this.stc09 = stc09;
		this.stc10 = stc10;
		this.stc11 = stc11;
		this.stc12 = stc12;
	}

	public Map<Integer, String> getStc01() {
		return stc01;
	}

	public void setStc01(Map<Integer, String> stc01) {
		this.stc01 = stc01;
	}

	public String getStc02() {
		return stc02;
	}

	public void setStc02(String stc02) {
		this.stc02 = stc02;
	}

	public String getStc03() {
		return stc03;
	}

	public void setStc03(String stc03) {
		this.stc03 = stc03;
	}

	public String getStc04() {
		return stc04;
	}

	public void setStc04(String stc04) {
		this.stc04 = stc04;
	}

	public String getStc05() {
		return stc05;
	}

	public void setStc05(String stc05) {
		this.stc05 = stc05;
	}

	public String getStc06() {
		return stc06;
	}

	public void setStc06(String stc06) {
		this.stc06 = stc06;
	}

	public String getStc07() {
		return stc07;
	}

	public void setStc07(String stc07) {
		this.stc07 = stc07;
	}

	public String getStc08() {
		return stc08;
	}

	public void setStc08(String stc08) {
		this.stc08 = stc08;
	}

	public String getStc09() {
		return stc09;
	}

	public void setStc09(String stc09) {
		this.stc09 = stc09;
	}

	public Map<Integer, String> getStc10() {
		return stc10;
	}

	public void setStc10(Map<Integer, String> stc10) {
		this.stc10 = stc10;
	}

	public Map<Integer, String> getStc11() {
		return stc11;
	}

	public void setStc11(Map<Integer, String> stc11) {
		this.stc11 = stc11;
	}

	public String getStc12() {
		return stc12;
	}

	public void setStc12(String stc12) {
		this.stc12 = stc12;
	}
	
	
}
