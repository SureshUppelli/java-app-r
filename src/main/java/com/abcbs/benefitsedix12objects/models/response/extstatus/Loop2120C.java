package com.abcbs.benefitsedix12objects.models.response.extstatus;

import java.util.HashMap;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.N3;
import com.abcbs.benefitsedix12objects.models.N4;
import com.abcbs.benefitsedix12objects.models.NM1;
import com.abcbs.benefitsedix12objects.models.PER;
import com.abcbs.benefitsedix12objects.models.PRV;

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
public class Loop2120C {



	
	private NM1 nm1 = new NM1();
	
//	private N3 n3 = new N3();
//	private N4 n4 = new N4();
//	private PRV prv = new PRV();
//	private Map<Integer, PER> permap = new HashMap<Integer, PER>();
//	
	
	 

	public Loop2120C() {

	}

	public Loop2120C(  NM1 nm1,  Map<Integer, DTP> dtpmap) {
		super();
		 
		
		this.nm1 = nm1;
		
	}

	public NM1 getNm1() {
		return nm1;
	}

	public void setNm1(NM1 nm1) {
		this.nm1 = nm1;
	}

//	public N3 getN3() {
//		return n3;
//	}
//
//	public void setN3(N3 n3) {
//		this.n3 = n3;
//	}
//
//	public N4 getN4() {
//		return n4;
//	}
//
//	public void setN4(N4 n4) {
//		this.n4 = n4;
//	}
//
//	public PRV getPrv() {
//		return prv;
//	}
//
//	public void setPrv(PRV prv) {
//		this.prv = prv;
//	}
//
//	public Map<Integer, PER> getPermap() {
//		return permap;
//	}
//
//	public void setPermap(Map<Integer, PER> permap) {
//		this.permap = permap;
//	}

	
 
	 
}
