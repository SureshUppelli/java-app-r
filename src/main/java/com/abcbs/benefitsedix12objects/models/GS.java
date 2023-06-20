package com.abcbs.benefitsedix12objects.models;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          X12 Segment Name:	Functional Group Header
 *          X12 Purpose:		To indicate the beginning of a functional group and to provide control information
 *          X12 Comments:		1. A functional group of related transaction sets, within the scope of X12
 *          					standards, consists of a collection of similar transaction sets enclosed by a
 *          					functional group header and a functional group trailer
 *          
 *          GS01 - 479 - Functional Identifier Code
 *          					Code identifying a group of application related transaction sets.
 *          
 *          GS02 - 142 - Application Sender's Code
 *          					Code identifying party sending transmission; codes agreed to by trading partners.
 *          
 *          GS03 - 124 - Application Receiver's Code
 *          					Code identifying part receiving transmission; codes agreed to by trading partners.
 *          
 *          GS04 - 373 - Date
 *          					Date expressed as CCYYMMDD where CC represents the first two digits of the caldender year.
 *          
 *          GS05 - 337 - Time
 *          					Time expressed in 24-hour clock time as follows: HHMM, or HHMMSS, or HHMMSSD, or HHMMSSDD,
 *          					where H = hours (00-23), M = minutes (00-59), S = integer seconds (00-59) and DD = decimal
 *          					seconds; decimal seconds are expressed as follows: D = tenths (0-9) and DD = hundredths (00-99).
 *          
 *          GS06 - 28 - Group Control Number
 *          					Assigned number originated and maintained by the sender.
 *          
 *          GS07 - 455 - Responsible Agency Code
 *          					Code identifying the issuer of the standard; this code is used in conjunction with Data Element 480.
 *          
 *          GS08 - 480 - Version / Release / Industry Identifier Code
 *          					Code indicating the version, release, subrelease, and industry identifier of the EDI standard being 
 *          					used, including the GS and GE segments; if code in DE455 in GS segment is X, then in DE 480 positions
 *          					1-3 are the version number; positions 4-6 are the release and subrelease, level of the version; and 
 *          					positions 7-12 are the industry or trade association identifiers (optionally assigned by user); if code
 *          					in DE455 in GS segment is T, then other formats are allowed.
 */
/*
 * Document modifications here:
 */
public class GS {

	private String gs01;
	private String gs02;
	private String gs03;
	private String gs04;
	private String gs05;
	private String gs06;
	private String gs07;
	private String gs08;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("479", "gs01");
			put("142", "gs02");
			put("124", "gs03");
			put("373", "gs04");
			put("337", "gs05");
			put("28", "gs06");
			put("455", "gs07");
			put("480", "gs08");
		}
	};

	public GS() {

	}

	public GS(String gs01, String gs02, String gs03, String gs04, String gs05, String gs06, String gs07, String gs08,
			Map<String, String> dataelementmap) {
		super();
		this.gs01 = gs01;
		this.gs02 = gs02;
		this.gs03 = gs03;
		this.gs04 = gs04;
		this.gs05 = gs05;
		this.gs06 = gs06;
		this.gs07 = gs07;
		this.gs08 = gs08;
		this.dataelementmap = dataelementmap;
	}

	public String getByDataElement(String dataelement) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass()
				.getMethod("get" + dataelement.substring(0, 1).toUpperCase() + dataelement.substring(1), null);
		return (String) method.invoke(this.getClass(), null);
	}

	public void setByDataElement(String dataelement, String value) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method method = this.getClass()
				.getMethod("set" + dataelement.substring(0, 1).toUpperCase() + dataelement.substring(1), String.class);
		method.invoke(this.getClass(), value);
	}

	public String getGs01() {
		return gs01;
	}

	public void setGs01(String gs01) {
		this.gs01 = gs01;
	}

	public String getGs02() {
		return gs02;
	}

	public void setGs02(String gs02) {
		this.gs02 = gs02;
	}

	public String getGs03() {
		return gs03;
	}

	public void setGs03(String gs03) {
		this.gs03 = gs03;
	}

	public String getGs04() {
		return gs04;
	}

	public void setGs04(String gs04) {
		this.gs04 = gs04;
	}

	public String getGs05() {
		return gs05;
	}

	public void setGs05(String gs05) {
		this.gs05 = gs05;
	}

	public String getGs06() {
		return gs06;
	}

	public void setGs06(String gs06) {
		this.gs06 = gs06;
	}

	public String getGs07() {
		return gs07;
	}

	public void setGs07(String gs07) {
		this.gs07 = gs07;
	}

	public String getGs08() {
		return gs08;
	}

	public void setGs08(String gs08) {
		this.gs08 = gs08;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
