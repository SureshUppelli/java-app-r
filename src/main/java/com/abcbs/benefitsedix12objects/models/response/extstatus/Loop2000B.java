package com.abcbs.benefitsedix12objects.models.response.extstatus;

import com.abcbs.benefitsedix12objects.models.HL;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Loop: 2000B � INFORMATION RECEIVER LEVEL Loop Repeat: >1
 *          Segment Repeat: 1
 *          Usage: REQUIRED
 *          TR3 Notes: 1. This entity expects a response from the Information Source. See
 *          	Section 1.4.1 Transaction Participants for more information on the Information Receiver. 
 *          
 *            Loop 2100B is used by both the 276 and 277 but 2200B is used only by the 277.
 */
/*
 * Document modifications here:
 */
public class Loop2000B {

	private HL hl = new HL();
	private Loop2100B loop2100b = new Loop2100B();


	public Loop2000B() {

	}

	public Loop2000B(HL hl, Loop2100B loop2100b) {
		super();
		this.hl = hl;
		this.setLoop2100b(loop2100b);

	}

	public HL getHl() {
		return hl;
	}

	public void setHl(HL hl) {
		this.hl = hl;
	}

	public Loop2100B getLoop2100b() {
		return loop2100b;
	}

	public void setLoop2100b(Loop2100B loop2100b) {
		this.loop2100b = loop2100b;
	}

	 

 
}
