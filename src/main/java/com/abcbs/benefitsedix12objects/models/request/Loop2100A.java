package com.abcbs.benefitsedix12objects.models.request;

import com.abcbs.benefitsedix12objects.models.NM1;

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
	
	public Loop2100A() {

	}

	public Loop2100A(NM1 nm1) {
		super();
		this.nm1 = nm1;
	}

	public NM1 getNm1() {
		return nm1;
	}

	public void setNm1(NM1 nm1) {
		this.nm1 = nm1;
	}

	 
 

}

