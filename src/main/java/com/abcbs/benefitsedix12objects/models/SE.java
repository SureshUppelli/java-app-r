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
 *          X12 Segment Name:	Transaction Set Trailer
 *          X12 Purpose:		To indicate the end of the transaction set and provide the count of the
 *          					transmitted segments (including the beginning (ST) and ending (SE) segments)
 *          X12 Comments:		1. SE is the last segment of each transaction set
 *          
 *          SE01 - 96 - Number of Included Segments
 *          					Total number of segments included in a transaction set including ST and SE segments.
 *          
 *          SE02 - 329 - Transaction Set Control Number
 *          					Identifying control number that must be unique within the transaction set
 *          					functional group assigned by the originator for a transaction set.
 */
/*
 * Document modifications here:
 */
public class SE {
	
	private String se01;
	private String se02;
	
	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("96", "se01");
			put("329", "se02");
		}
	};
	
	public SE() {
		
	}

	public SE(String se01, String se02, Map<String, String> dataelementmap) {
		super();
		this.se01 = se01;
		this.se02 = se02;
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

	public String getSe01() {
		return se01;
	}

	public void setSe01(String se01) {
		this.se01 = se01;
	}

	public String getSe02() {
		return se02;
	}

	public void setSe02(String se02) {
		this.se02 = se02;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}
	
	

}
