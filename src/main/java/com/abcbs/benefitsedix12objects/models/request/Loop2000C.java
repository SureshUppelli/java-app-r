package com.abcbs.benefitsedix12objects.models.request;

import java.util.HashMap;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.HL;
import com.abcbs.benefitsedix12objects.models.TRN;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Loop: 2000C � SUBSCRIBER LEVEL Loop Repeat: >1
 *          Segment Repeat: 1
 *          Usage: SITUATIONAL
 *          Situational Rule: Required when status was not reported at the Information Receiver level.
 *          	If not required by this implementation guide, do not send.
 *          TR3 Notes: 1. This entity delivered the health care service. See Section 1.4.1
 *          	Transaction Participants for more information on the Provider.
 *          
 *          Note Loop2100C is used by both the 276 and 277 but Loop2200C is only used by the 277.
 */
/*
 * Document modifications here:
 */
public class Loop2000C {

	private HL hl = new HL();
	//private TRN trn = new TRN();
	private Map<Integer, TRN> trnmap = new HashMap<Integer, TRN>();
	
	private Loop2100C loop2100c = new Loop2100C();

	public Loop2000C() {

	}

	public Loop2000C(HL hl,Map<Integer, TRN> trnmap, Loop2100C loop2100c) {
		super();
		this.hl = hl;
		this.trnmap= trnmap;
		this.setLoop2100c(loop2100c);
	//	
	}

	public HL getHl() {
		return hl;
	}

	public void setHl(HL hl) {
		this.hl = hl;
	}

	 
	public Map<Integer, TRN> getTrnmap() {
		return trnmap;
	}

	public void setTrnmap(Map<Integer, TRN> trnmap) {
		this.trnmap = trnmap;
	}

	public Loop2100C getLoop2100c() {
		return loop2100c;
	}

	public void setLoop2100c(Loop2100C loop2100c) {
		this.loop2100c = loop2100c;
	}

 

 
	 
	 


	

}
