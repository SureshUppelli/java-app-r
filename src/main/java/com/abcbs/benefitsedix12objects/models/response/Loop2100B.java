package com.abcbs.benefitsedix12objects.models.response;

import java.util.HashMap;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.AAA;
import com.abcbs.benefitsedix12objects.models.N3;
import com.abcbs.benefitsedix12objects.models.N4;
import com.abcbs.benefitsedix12objects.models.NM1;
import com.abcbs.benefitsedix12objects.models.PRV;
import com.abcbs.benefitsedix12objects.models.REF;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	5-18-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Loop: 2100B � INFORMATION RECEIVER NAME Loop Repeat: 1
 *          Segment Repeat: 1
 *          Usage: REQUIRED
 *          
 */
/*
 * Document modifications here:
 */
public class Loop2100B {

	private NM1 nm1 = new NM1();
	private Map<Integer, REF> refmap = new HashMap<Integer, REF>();
	private N3 n3 = new N3();
	private N4 n4 = new N4();
	private Map<Integer, AAA> aaamap = new HashMap<Integer, AAA>();
	private PRV prv = new PRV();
	public Loop2100B() {

	}

	public Loop2100B(NM1 nm1,Map<Integer, REF> refmap, N3 n3, N4 n4,Map<Integer, AAA> aaamap,PRV prv) {
		super();
		this.nm1 = nm1;
		this.refmap= refmap;
		this.aaamap= aaamap;
		this.n3= n3;
		this.n4= n4;
		this.prv= prv;
	}

	public NM1 getNm1() {
		return nm1;
	}

	public void setNm1(NM1 nm1) {
		this.nm1 = nm1;
	}

	 

	public N3 getN3() {
		return n3;
	}

	public void setN3(N3 n3) {
		this.n3 = n3;
	}

	public N4 getN4() {
		return n4;
	}

	public void setN4(N4 n4) {
		this.n4 = n4;
	}

	public PRV getPrv() {
		return prv;
	}

	public void setPrv(PRV prv) {
		this.prv = prv;
	}

	public Map<Integer, REF> getRefmap() {
		return refmap;
	}

	public void setRefmap(Map<Integer, REF> refmap) {
		this.refmap = refmap;
	}

	public Map<Integer, AAA> getAaamap() {
		return aaamap;
	}

	public void setAaamap(Map<Integer, AAA> aaamap) {
		this.aaamap = aaamap;
	}

}
