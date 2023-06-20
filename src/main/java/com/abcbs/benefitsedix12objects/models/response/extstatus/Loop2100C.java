package com.abcbs.benefitsedix12objects.models.response.extstatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.AAA;
import com.abcbs.benefitsedix12objects.models.DMG;
import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.HI;
import com.abcbs.benefitsedix12objects.models.INS;
import com.abcbs.benefitsedix12objects.models.MPI;
import com.abcbs.benefitsedix12objects.models.N3;
import com.abcbs.benefitsedix12objects.models.N4;
import com.abcbs.benefitsedix12objects.models.NM1;
import com.abcbs.benefitsedix12objects.models.PRV;
import com.abcbs.benefitsedix12objects.models.REF;










/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	5-18-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Loop: 2100C � SUBSCRIBER NAME Loop Repeat: 2
 *          Segment Repeat: 1
 *          Usage: REQUIRED
 *          TR3 Notes: 1. During the transition to NPI, for those health care providers covered
 *          	under the NPI mandate, two iterations of the 2100C Loop may be sent
 *          	to accommodate reporting dual provider identification numbers (NPI
 *          	and Legacy). When two iterations are reported, the NPI number will be
 *          	in the iteration where the NM108 qualifier will be �XX� and the legacy
 *          	number will be in the iteration where the NM108 qualifier will be either	
 *          	�SV� or �FI�.
 *          	2. After the transition to NPI, for those health care providers covered
 *          	under the NPI mandate, only one iteration of the 2100C loop
 */
/*
 * Document modifications here:
 */
public class Loop2100C {

	private NM1 nm1 = new NM1();
//	private Map<Integer, REF> refmap = new HashMap<Integer, REF>();
//	private N3 n3 = new N3();
//	private N4 n4 = new N4();
	private Map<Integer, AAA> aaamap = new HashMap<Integer, AAA>();
//	
//	private PRV prv = new PRV();
//	private DMG dmg = new DMG();
//	
//	private INS ins = new INS();
//	private HI   hi = new HI();
	//private DTP dtp = new DTP();	
//	private Map<Integer, DTP> dtpmap = new HashMap<Integer, DTP>();
//	private MPI mpi = new MPI();
	
	private List<Loop2110C> loop2110c = new ArrayList<Loop2110C>();
	
	public Loop2100C() {
//
	}

	public Loop2100C(NM1 nm1,Map<Integer, REF> refmap,N3 n3, N4 n4,Map<String, AAA> aaamap,PRV prv, DMG dmg,INS ins,HI   hi,Map<Integer, DTP> dtpmap , List<Loop2110C> loop2110c) {
		super();
		this.nm1 = nm1;
		
//		this.dmg=dmg;
//		
//		this.refmap= refmap;
//		this.aaamap= aaamap;
//		this.n3= n3;
//		this.n4= n4;
//		this.prv= prv;		
//		this.dtpmap=dtpmap;
//		this.setHi(hi);
//		this.setIns(ins);		
		this.loop2110c = loop2110c;
	}

	public NM1 getNm1() {
		return nm1;
	}

	public void setNm1(NM1 nm1) {
		this.nm1 = nm1;
	}
//	public Map<Integer, REF> getRefmap() {
//		return refmap;
//	}
//
//	public void setRefmap(Map<Integer, REF> refmap) {
//		this.refmap = refmap;
//	}
//	public DMG getDmg() {
//		return dmg;
//	}
//
//	public void setDmg(DMG dmg) {
//		this.dmg = dmg;
//	}
//
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

//	public Map<String, AAA> getAaamap() {
//		return aaamap;
//	}
//
//	public void setAaamap(Map<String, AAA> aaamap) {
//		this.aaamap = aaamap;
//	}

//	public PRV getPrv() {
//		return prv;
//	}
//
//	public void setPrv(PRV prv) {
//		this.prv = prv;
//	}
//	 
//
//	 
//
//	public INS getIns() {
//		return ins;
//	}
//
//	public void setIns(INS ins) {
//		this.ins = ins;
//	}
//
//	public HI getHi() {
//		return hi;
//	}
//
//	public void setHi(HI hi) {
//		this.hi = hi;
//	}
//
	public Map<Integer, AAA> getAaamap() {
		return aaamap;
	}

	public void setAaamap(Map<Integer, AAA> aaamap) {
		this.aaamap = aaamap;
	}

//	public MPI getMpi() {
//		return mpi;
//	}
//
//	public void setMpi(MPI mpi) {
//		this.mpi = mpi;
//	}

//	public Map<Integer, DTP> getDtpmap() {
//		return dtpmap;
//	}
//
//	public void setDtpmap(Map<Integer, DTP> dtpmap) {
//		this.dtpmap = dtpmap;
//	}
//
	public List<Loop2110C> getLoop2110c() {
		return loop2110c;
	}

	public void setLoop2110c(List<Loop2110C> loop2110c) {
		this.loop2110c = loop2110c;
	}

	
}
