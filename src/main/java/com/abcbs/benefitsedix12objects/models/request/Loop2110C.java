package com.abcbs.benefitsedix12objects.models.request;

import com.abcbs.benefitsedix12objects.models.AMT;
import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.EQ;
import com.abcbs.benefitsedix12objects.models.III;
import com.abcbs.benefitsedix12objects.models.REF;

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
public class Loop2110C {

	private EQ eq = new EQ();
	private AMT amt = new AMT();
	private III iii = new III();
	private REF ref = new REF();
	//private Map<Integer, DTP> dtpmap = new HashMap<Integer, DTP>();
	private DTP dtp = new DTP();
	public Loop2110C() {

	}

	public Loop2110C(EQ eq, AMT amt, III iii, REF ref, /*Map<Integer, DTP> dtpmap*/ DTP dtp) {
		super();
		this.eq = eq;
		this.amt = amt;
		this.iii = iii;
		this.ref = ref;
		//this.dtpmap = dtpmap;
		this.setDtp(dtp);
	 
	}

	public EQ getEq() {
		 
		return eq;
	}

	public void setEq(EQ eq) {
		this.eq = eq;
	}

	public AMT getAmt() {
		return amt;
	}

	public void setAmt(AMT amt) {
		this.amt = amt;
	}

	public III getIii() {
		return iii;
	}

	public void setIii(III iii) {
		this.iii = iii;
	}

	public REF getRef() {
		return ref;
	}

	public void setRef(REF ref) {
		this.ref = ref;
	}

	public DTP getDtp() {
		return dtp;
	}

	public void setDtp(DTP dtp) {
		this.dtp = dtp;
	}

	 
  
	 

//	public Map<Integer, DTP> getDtpmap() {
//		return dtpmap;
//	}
//
//	public void setDtpmap(Map<Integer, DTP> dtpmap) {
//		this.dtpmap = dtpmap;
//	}

	 

}
