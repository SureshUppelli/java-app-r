package com.abcbs.benefitsedix12objects.models.request;

import java.util.Map;

import com.abcbs.benefitsedix12objects.models.AAA;
import com.abcbs.benefitsedix12objects.models.HL;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Loop: 2000A � INFORMATION SOURCE LEVEL Loop Repeat: >1
 *          Segment Repeat: 1
 *          Usage: REQUIRED
 *          TR3 Notes: 1. This entity is the payer who has the current status information for the
 *          specified claims.
 */
/*
 * Document modifications here:
 */
public class Loop2000A {

	private HL hl = new HL();

	private Loop2100A loop2100a = new Loop2100A();
	 

	public Loop2000A() {

	}
	public Loop2000A(HL hl, Loop2100A loop2100a) {
		super();
		this.hl = hl;		
		this.setLoop2100a(loop2100a);
	}
	public Loop2000A(HL hl, Map<Integer, AAA> aaamap,Loop2100A loop2100a) {
		super();
		 
	
	 
	}

	public HL getHl() {
		return hl;
	}

	public void setHl(HL hl) {
		this.hl = hl;
	}

	 
	public Loop2100A getLoop2100a() {
		return loop2100a;
	}
	public void setLoop2100a(Loop2100A loop2100a) {
		this.loop2100a = loop2100a;
	}

}
