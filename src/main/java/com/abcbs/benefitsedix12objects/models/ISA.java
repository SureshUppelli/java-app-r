package com.abcbs.benefitsedix12objects.models;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author SXM
 * @version 1.0
 * @since 8-18-2022
 * @contact ismbbbillingsys@arkbluecross.com
 * 
 *          X12 Segment Name: Interchange Control Header
 *          X12 Purpose: To start and identify an interchange of zero or more functional groups and
 *          interchange-related control segments
 *          
 *          ISA01 - I01 - Authorization Information Qualifier
 *          	Code identifying the type of information in the Authorization
 *          	Information 
 *          
 *          ISA02 - I02 - Authorization Information
 *          	Information used for additional identification or authorization of
 *          	the interchange sender or the data in the interchange; the type
 *          	of information is set by the Authorization Information Qualifier
 *      
 *          ISA03 - I03 - Security Information Qualifier
 *          	Code identifying the type of information in the Security
 *          	Information
 *          
 *          ISA04 - I04 - Security Information
 *          	This is used for identifying the security information about the
 *          	interchange sender or the data in the interchange; the type of
 *          	information is set by the Security Information Qualifier
 *          
 *          ISA05 - I05 - Interchange ID Qualifier
 *          	Code indicating the system/method of code structure used to
 *          	designate the sender ID element being qualified
 *          
 *          ISA06 - I06 - Interchange Sender ID
 *          	Identification code published by the sender for other parties to
 *          	use as the receiver ID to route data to them; the sender always
 *          	codes this value in the sender ID element
 *          
 *          ISA07 - I07 - Interchange ID Qualifier
 *          	Code indicating the system/method of code structure used to
 *          	designate the sender ID element being qualified
 *          
 *          ISA08 - I08 - Interchange Receiver ID
 *          	Identification code published by the sender for other parties to
 *          	use as the receiver ID to route data to them; the sender always
 *          	codes this value in the sender ID element
 *          
 *          ISA09 - I09 - Interchange Date
 *          	Date of the interchange, YYMMDD
 *          
 *          ISA10 - I10 - Interchange Time
 *          	Time of the interchange, HHSS
 *          
 *          ISA11 - I65 - Standard ID
 *          ISA12 - I11 - Interchange Control Version Number
 *          	Code specifying the version number of the interchange control
 *          	segments
 *          
 *          ISA13 - I12 - Interchange Control Number
 *          	A control number assigned by the interchange sender
 *          
 *          ISA14 - I13 - Acknowledgment Requested
 *          	Code indicating sender�s request for an interchange
 *          	acknowledgment
 *          
 *          ISA15 - I14 - Usage Indicator
 *          	Code indicating whether data enclosed by this interchange
 *          	envelope is test or production
 *          
 *          ISA16 - I15 - Sub-element Separator
 */
/*
 * Document modifications here:
 */

public class ISA {

	private String isa01;
	private String isa02;
	private String isa03;
	private String isa04;
	private String isa05;
	private String isa06;
	private String isa07;
	private String isa08;
	private String isa09;
	private String isa10;
	private String isa11;
	private String isa12;
	private String isa13;
	private String isa14;
	private String isa15;
	private String isa16;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {

		{
			put("I01", "isa01");
			put("I02", "isa02");
			put("I03", "isa03");
			put("I04", "isa04");
			put("I05", "isa05");
			put("I06", "isa06");
			put("I07", "isa07");
			put("I08", "isa08");
			put("I09", "isa09");
			put("I10", "isa10");
			put("I65", "isa11");
			put("I11", "isa12");
			put("I12", "isa13");
			put("I13", "isa14");
			put("I14", "isa15");
			put("I15", "isa16");
		}
	};

	public ISA() {

	}

	public ISA(String isa01, String isa02, String isa03, String isa04, String isa05, String isa06, String isa07,
			String isa08, String isa09, String isa10, String isa11, String isa12, String isa13, String isa14,
			String isa15, String isa16, Map<String, String> dataelementmap) {
		super();
		this.isa01 = isa01;
		this.isa02 = isa02;
		this.isa03 = isa03;
		this.isa04 = isa04;
		this.isa05 = isa05;
		this.isa06 = isa06;
		this.isa07 = isa07;
		this.isa08 = isa08;
		this.isa09 = isa09;
		this.isa10 = isa10;
		this.isa11 = isa11;
		this.isa12 = isa12;
		this.isa13 = isa13;
		this.isa14 = isa14;
		this.isa15 = isa15;
		this.isa16 = isa16;
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

	public String getIsa01() {
		return isa01;
	}

	public void setIsa01(String isa01) {
		this.isa01 = isa01;
	}

	public String getIsa02() {
		return isa02;
	}

	public void setIsa02(String isa02) {
		this.isa02 = isa02;
	}

	public String getIsa03() {
		return isa03;
	}

	public void setIsa03(String isa03) {
		this.isa03 = isa03;
	}

	public String getIsa04() {
		return isa04;
	}

	public void setIsa04(String isa04) {
		this.isa04 = isa04;
	}

	public String getIsa05() {
		return isa05;
	}

	public void setIsa05(String isa05) {
		this.isa05 = isa05;
	}

	public String getIsa06() {
		return isa06;
	}

	public void setIsa06(String isa06) {
		this.isa06 = isa06;
	}

	public String getIsa07() {
		return isa07;
	}

	public void setIsa07(String isa07) {
		this.isa07 = isa07;
	}

	public String getIsa08() {
		return isa08;
	}

	public void setIsa08(String isa08) {
		this.isa08 = isa08;
	}

	public String getIsa09() {
		return isa09;
	}

	public void setIsa09(String isa09) {
		this.isa09 = isa09;
	}

	public String getIsa10() {
		return isa10;
	}

	public void setIsa10(String isa10) {
		this.isa10 = isa10;
	}

	public String getIsa11() {
		return isa11;
	}

	public void setIsa11(String isa11) {
		this.isa11 = isa11;
	}

	public String getIsa12() {
		return isa12;
	}

	public void setIsa12(String isa12) {
		this.isa12 = isa12;
	}

	public String getIsa13() {
		return isa13;
	}

	public void setIsa13(String isa13) {
		this.isa13 = isa13;
	}

	public String getIsa14() {
		return isa14;
	}

	public void setIsa14(String isa14) {
		this.isa14 = isa14;
	}

	public String getIsa15() {
		return isa15;
	}

	public void setIsa15(String isa15) {
		this.isa15 = isa15;
	}

	public String getIsa16() {
		return isa16;
	}

	public void setIsa16(String isa16) {
		this.isa16 = isa16;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
