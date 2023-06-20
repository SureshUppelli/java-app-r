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
 *          X12 Segment Name:	Trace
 *          X12 Purpose:		To uniquely identify a transaction to an application
 *          
 *          TRN01 - 481 - Trace Type Code
 *          					Code identifying which transaction is being referenced
 *          
 *          TRN02 - 127 - Reference Identification
 *          					Reference information as defined for a particular Transaction Set or as specified
 *          					by the Reference Identification Qualifier
 *          
 *          TRN03 - 509 - Originating Company Identifier
 *          TRN04 - 127 - Reference Identification
 */
/*
 * Document modifications here:
 */
public class TRN {

	private String trn01;
	private String trn02;
	private String trn03;
	private String trn04;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("481", "trn01");
			put("127", "trn02");
			put("509", "trn03");
			put("127", "trn04");
			//sumaja check with team to find trn04 exist in 270/271 or not
		}
	};

	public TRN() {

	}

	public TRN(String trn01, String trn02, String trn03, String trn04, Map<String, String> dataelementmap) {
		super();
		this.trn01 = trn01;
		this.trn02 = trn02;
		this.trn03 = trn03;
		this.trn04 = trn04;
		this.dataelementmap = dataelementmap;
	}

	public String getTrn01() {
		return trn01;
	}

	public void setTrn01(String trn01) {
		this.trn01 = trn01;
	}

	public String getTrn02() {
		return trn02;
	}

	public void setTrn02(String trn02) {
		this.trn02 = trn02;
	}

	public String getTrn03() {
		return trn03;
	}

	public void setTrn03(String trn03) {
		this.trn03 = trn03;
	}

	public String getTrn04() {
		return trn04;
	}

	public void setTrn04(String trn04) {
		this.trn04 = trn04;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
