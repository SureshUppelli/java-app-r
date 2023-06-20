package com.abcbs.benefitsedix12objects.models.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.AAA;
import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.EB;
import com.abcbs.benefitsedix12objects.models.HSD;
import com.abcbs.benefitsedix12objects.models.LE;
import com.abcbs.benefitsedix12objects.models.LS;
import com.abcbs.benefitsedix12objects.models.MSG;
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

	private EB eb = new EB();
	private Map<Integer, HSD> hsdmap = new HashMap<Integer, HSD>();
	private REF ref = new REF();
	private Map<Integer, DTP> dtpmap = new HashMap<Integer, DTP>();
	private Map<Integer, AAA> aaamap = new HashMap<Integer, AAA>();
	private Map<Integer,MSG> msgmap = new HashMap<Integer, MSG>();  
	 
	
	private List<Loop2115C> loop2115c = new ArrayList<Loop2115C>();
	private LS ls = new LS();
	private List<Loop2120C> loop2120c = new ArrayList<Loop2120C>();
	private LE le = new LE();
	
	public Loop2110C() {

	}

//	public Loop2110C(EQ eq, AMT amt, III iii, REF ref, Map<Integer, DTP> dtpmap) {
//		super();
//		this.ref = ref;
//		this.dtpmap = dtpmap;
//		//this.msgmap=msgmap;
//		//this.hsdmap=hsdmap;
//	}

 
	public REF getRef() {
		return ref;
	}

	public void setRef(REF ref) {
		this.ref = ref;
	}

	 
 

	public EB getEb() {
		return eb;
	}

	public void setEb(EB eb) {
		this.eb = eb;
	}

	public Map<Integer, AAA> getAaamap() {
		return aaamap;
	}

	public void setAaamap(Map<Integer, AAA> aaamap) {
		this.aaamap = aaamap;
	}

	 

	public Map<Integer, DTP> getDtpmap() {
		return dtpmap;
	}

	public void setDtpmap(Map<Integer, DTP> dtpmap) {
		this.dtpmap = dtpmap;
	}

	public Map<Integer,MSG> getMsgmap() {
		return msgmap;
	}

	public void setMsgmap(Map<Integer,MSG> msgmap) {
		this.msgmap = msgmap;
	}

	public Map<Integer, HSD> getHsdmap() {
		return hsdmap;
	}

	public void setHsdmap(Map<Integer, HSD> hsdmap) {
		this.hsdmap = hsdmap;
	}

	 
	public LE getLe() {
		return le;
	}

	public void setLe(LE le) {
		this.le = le;
	}


	public LS getLs() {
		return ls;
	}

	 

	public void setLs(LS ls) {
		this.ls = ls;
	}

	public List<Loop2115C> getLoop2115c() {
		return loop2115c;
	}

	public void setLoop2115c(List<Loop2115C> loop2115c) {
		this.loop2115c = loop2115c;
	}

	public List<Loop2120C> getLoop2120c() {
		return loop2120c;
	}

	public void setLoop2120c(List<Loop2120C> loop2120c) {
		this.loop2120c = loop2120c;
	}

}
