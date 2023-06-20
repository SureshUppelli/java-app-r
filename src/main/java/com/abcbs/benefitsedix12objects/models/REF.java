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
 *          X12 Segment Name:	Reference Information
 *          X12 Purpose:		To specify identifying information
 *          
 *          REF01 - 128 - Reference Identification Qualifier
 *          					Code qualifying the Reference Identification
 *          
 *          REF02 - 127 - Reference Identification
 *          					Reference information as defined for a particular Transaction Set or as specified
 *          					by the Reference Identification Qualifier
 *          
 *          REF03 - 352 - Description  
 *          
 *          REF04 - C040 - REFERENCE IDENTIFIER  
 */
/*
 * Document modifications here:
 */
public class REF {

	private String ref01;
	private String ref02;
	private String ref03;
	private String ref04;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("128", "ref01");
			put("127", "ref02");
			put("352", "ref03");
			put("C040", "ref04");
			//sumaja check with team to find ref03,04 exist in 270 or not
		}
	};

	public REF() {

	}

	public REF(String ref01, String ref02, String ref03, String ref04, Map<String, String> dataelementmap) {
		super();
		this.ref01 = ref01;
		this.ref02 = ref02;
		this.ref03 = ref03;
		this.ref04 = ref04;
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

	public String getRef01() {
		return ref01;
	}

	public void setRef01(String ref01) {
		this.ref01 = ref01;
	}

	public String getRef02() {
		return ref02;
	}

	public void setRef02(String ref02) {
		this.ref02 = ref02;
	}

	public String getRef03() {
		return ref03;
	}

	public void setRef03(String ref03) {
		this.ref03 = ref03;
	}

	public String getRef04() {
		return ref04;
	}

	public void setRef04(String ref04) {
		this.ref04 = ref04;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
