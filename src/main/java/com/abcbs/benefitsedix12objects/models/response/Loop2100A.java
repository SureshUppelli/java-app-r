package com.abcbs.benefitsedix12objects.models.response;

import java.util.HashMap;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.AAA;
import com.abcbs.benefitsedix12objects.models.NM1;
import com.abcbs.benefitsedix12objects.models.PER;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	9-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Loop: 2100A � PAYER NAME Loop Repeat: 1
 *          Segment Repeat: 1
 *          Usage: REQUIRED 
 *          
 *            The PER segment is only used by the 271.  It will be included on
 *            the 270 but will be empty.
 */
/*
 * Document modifications here:
 */
public class Loop2100A {

	private NM1 nm1 = new NM1();
	
	private Map<Integer, PER> permap = new HashMap<Integer, PER>();
	private Map<Integer, AAA> aaamap = new HashMap<Integer, AAA>();
	public Loop2100A() {

	}

	public Loop2100A(NM1 nm1,Map<Integer, PER> permap,Map<Integer, AAA> aaamap) {
		super();
		this.nm1 = nm1;
		this.permap = permap;
		this.aaamap=aaamap;
	}

	public NM1 getNm1() {
		return nm1;
	}

	public void setNm1(NM1 nm1) {
		this.nm1 = nm1;
	}

	 

	public Map<Integer, PER> getPermap() {
		return permap;
	}

	public void setPermap(Map<Integer, PER> permap) {
		this.permap = permap;
	}

	public Map<Integer, AAA> getAaamap() {
		return aaamap;
	}

	public void setAaamap(Map<Integer, AAA> aaamap) {
		this.aaamap = aaamap;
	}

}

