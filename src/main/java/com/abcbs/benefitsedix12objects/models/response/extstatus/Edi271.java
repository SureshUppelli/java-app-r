package com.abcbs.benefitsedix12objects.models.response.extstatus;

import java.util.ArrayList;
import java.util.List;

import com.abcbs.benefitsedix12objects.models.GE;
import com.abcbs.benefitsedix12objects.models.GS;
import com.abcbs.benefitsedix12objects.models.IEA;
import com.abcbs.benefitsedix12objects.models.ISA;


/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 * this class is created based on 276/277
 *          This is the outer envelope class containing the x12 data loops and
 *          segments.
 * 
 *          ST is defined as a list because it is a repeatable segment on the
 *          276/277. Example usage would be a batch request of statuses. The
 *          closing SE segment is defined within ST.  The "contents" of the transaction
 *          are found within ST.  Real time 276 requests should only contain a single ST
 *          segment.
 *          
 *          Use the "reenvelope" boolean to indicate whether the envelope segments are
 *          already built (true) or if they need to be rebuilt during x12 generation (false).
 *          
 *          This same object can be used for both a 276 and a 277 as they both contain the 
 *          same objects and same general layout.  There are segments included in this object
 *          that will be used by either a 276 or 277 but not by both.  Example, the PER segment
 *          within the 2100A loop is only used by the 277.  But it will be included when 
 *          parsing and returning a 276.  This is for consistency and to ease the transfer
 *          of shared objects between a 276 and 277.
 */
/*
 * Document modifications here:
 */

public class Edi271 {

	boolean reenvelope = false;
//	private ISA isa = new ISA();
//	private GS gs = new GS();
	private List<ST> stlist = new ArrayList<ST>();
//	private GE ge = new GE();
//	private IEA iea = new IEA();	
	

	public Edi271() {

	}

	public Edi271(boolean reenvelope, ISA isa, GS gs, List<ST> stlist, GE ge, IEA iea) {
		super();
		this.reenvelope = reenvelope;
		this.stlist = stlist;
//		this.isa = isa;
//		this.gs = gs;
//		
//		this.ge = ge;
//		this.iea = iea;
	}

	public boolean isReenvelope() {
		return reenvelope;
	}

	public void setReenvelope(boolean reenvelope) {
		this.reenvelope = reenvelope;
	}
	public List<ST> getStlist() {
		return stlist;
	}

	public void setStlist(List<ST> stlist) {
		this.stlist = stlist;
	}

//	public ISA getIsa() {
//		return isa;
//	}
//
//	public void setIsa(ISA isa) {
//		this.isa = isa;
//	}
//
//	public GS getGs() {
//		return gs;
//	}
//
//	public void setGs(GS gs) {
//		this.gs = gs;
//	}
//
//	
//
//	public GE getGe() {
//		return ge;
//	}
//
//	public void setGe(GE ge) {
//		this.ge = ge;
//	}
//
//	public IEA getIea() {
//		return iea;
//	}
//
//	public void setIea(IEA iea) {
//		this.iea = iea;
//	}

}
