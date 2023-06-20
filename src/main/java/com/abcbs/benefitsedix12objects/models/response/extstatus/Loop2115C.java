package com.abcbs.benefitsedix12objects.models.response.extstatus;

import java.util.Map;

import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.III;
import com.abcbs.benefitsedix12objects.models.LS;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Loop: 2110C SUBSCRIBER ELIGIBILITY OR BENEFIT INQUIRY
 *          Segment Repeat: 1
 *          Usage: SITUATIONAL
 *          Situational Rule: Required when needed to refine the search criteria for a specific service
 *          	line. If not required by this implementation guide, do not send. 
 *          
 *          This loop is only used by the 276.
 */
/*
 * Document modifications here:
 */
public class Loop2115C {

	

	
	
	private III iii = new III();
	 

	public Loop2115C() {

	}

	public Loop2115C(LS ls, III iii,  Map<Integer, DTP> dtpmap) {
		super();
		
		
		this.iii = iii;
		
	}
	 

	public III getIii() {
		return iii;
	}

	 

	public void setIii(III iii) {
		this.iii = iii;
	}
	 
}
