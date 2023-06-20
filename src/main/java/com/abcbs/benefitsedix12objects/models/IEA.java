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
 *          X12 Segment Name:	Interchange Control Trailer
 *          X12 Purpose:		To define the end of an interchange of zero or more functional groups and
 *          					interchange-related control segments.
 *          
 *          IEA01 - I16 - Number of Included Functional Groups
 *          					A count of the number of functional groups included in an interchange.
 *          
 *          IEA02 - I12 - Interchange Control Number
 *          					A control number assigned by the interchange sender.
 */
/*
 * Document modifications here:
 */
public class IEA {
	
	private String iea01;
	private String iea02;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("I16", "iea01");
			put("I12", "iea02");
		}
	};
	
	public IEA() {
		
	}

	public IEA(String iea01, String iea02, Map<String, String> dataelementmap) {
		super();
		this.iea01 = iea01;
		this.iea02 = iea02;
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

	public String getIea01() {
		return iea01;
	}

	public void setIea01(String iea01) {
		this.iea01 = iea01;
	}

	public String getIea02() {
		return iea02;
	}

	public void setIea02(String iea02) {
		this.iea02 = iea02;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}
	
	

}
