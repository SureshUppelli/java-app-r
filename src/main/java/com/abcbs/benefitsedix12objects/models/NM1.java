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
 *          X12 Segment Name:	Individual or Organizational Name
 *          X12 Purpose:		To supply the full name of an individual or organizational entity
 *          
 *          NM101 - 98 - Entity Identifier Code
 *          					Code identifying an organizational entity, a physical location, property or an
 *          					individual
 *          
 *          NM102 - 1065 - Entity Type Qualifier
 *          					Code qualifying the type of entity
 *          
 *          NM103 - 1035 -  Name Last or Organization Name
 *          					Individual last name or organizational name
 *          
 *          NM104 - 1036 -  Name First
 *          					Individual first name
 *          
 *          NM105 - 1037 -  Name Middle
 *          					Individual middle name or initia
 *          
 *          NM106 - 1038 -  Name Prefix
 *          
 *          NM107 - 1039 -  Name Suffix
 *          					Suffix to individual name
 *          
 *          NM108 - 66 -  Identification Code Qualifier
 *          					Code designating the system/method of code structure used for Identification
 *          					Code (67)
 *          
 *          NM109 - 67 -  Identification Code
 *          					Code identifying a party or other code
 *          
 *          NM110 - 706 - Entity Relationship Code
 *          
 *          NM111 - 98 - Entity Identifier Code
 *          
 *          NM112 - 1035 - Name Last or Organization Name
 */
/*
 * Document modifications here:
 */
public class NM1 {

	private String nm101;
	private String nm102;
	private String nm103;
	private String nm104;
	private String nm105;
	private String nm106;
	private String nm107;
	private String nm108;
	private String nm109;
	private String nm110;
	private String nm111;
	private String nm112;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("98", "nm101");
			put("1065", "nm102");
			put("1035", "nm103");
			put("1036", "nm104");
			put("1037", "nm105");
			put("1038", "nm106");
			put("1039", "nm107");
			put("66", "nm108");
			put("67", "nm109");
			put("706", "nm110");
			put("98", "nm111");
			put("1035", "nm112");
			//sumaja -check with team to find nm106,nm110,111,112
		}
	};

	public NM1() {

	}

	public NM1(String nm101, String nm102, String nm103, String nm104, String nm105, String nm106, String nm107,
			String nm108, String nm109, String nm110, String nm111, String nm112, Map<String, String> dataelementmap) {
		super();
		this.nm101 = nm101;
		this.nm102 = nm102;
		this.nm103 = nm103;
		this.nm104 = nm104;
		this.nm105 = nm105;
		this.nm106 = nm106;
		this.nm107 = nm107;
		this.nm108 = nm108;
		this.nm109 = nm109;
		this.nm110 = nm110;
		this.nm111 = nm111;
		this.nm112 = nm112;
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

	public String getNm101() {
		return nm101;
	}

	public void setNm101(String nm101) {
		this.nm101 = nm101;
	}

	public String getNm102() {
		return nm102;
	}

	public void setNm102(String nm102) {
		this.nm102 = nm102;
	}

	public String getNm103() {
		return nm103;
	}

	public void setNm103(String nm103) {
		this.nm103 = nm103;
	}

	public String getNm104() {
		return nm104;
	}

	public void setNm104(String nm104) {
		this.nm104 = nm104;
	}

	public String getNm105() {
		return nm105;
	}

	public void setNm105(String nm105) {
		this.nm105 = nm105;
	}

	public String getNm106() {
		return nm106;
	}

	public void setNm106(String nm106) {
		this.nm106 = nm106;
	}

	public String getNm107() {
		return nm107;
	}

	public void setNm107(String nm107) {
		this.nm107 = nm107;
	}

	public String getNm108() {
		return nm108;
	}

	public void setNm108(String nm108) {
		this.nm108 = nm108;
	}

	public String getNm109() {
		return nm109;
	}

	public void setNm109(String nm109) {
		this.nm109 = nm109;
	}

	public String getNm110() {
		return nm110;
	}

	public void setNm110(String nm110) {
		this.nm110 = nm110;
	}

	public String getNm111() {
		return nm111;
	}

	public void setNm111(String nm111) {
		this.nm111 = nm111;
	}

	public String getNm112() {
		return nm112;
	}

	public void setNm112(String nm112) {
		this.nm112 = nm112;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
