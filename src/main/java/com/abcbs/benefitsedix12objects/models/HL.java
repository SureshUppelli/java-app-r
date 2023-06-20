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
 *          X12 Segment Name:	Hierarchical Level
 *          X12 Purpose:		To identify dependencies among and the content of hierarchically related
 *          					groups of data segments
 *          X12 Comments:		1. The HL segment is used to identify levels of detail information using a
 *          					hierarchical structure, such as relating line-item data to shipment data, and
 *          					packaging data to line-item data.
 *          					2. The HL segment defines a top-down/left-right ordered structure.
 *          
 *          HL01 - 628 - Hierarchical ID Number
 *          					A unique number assigned by the sender to identify a particular data segment in
 *          					a hierarchical structure
 *          
 *          HL02 - 734 - Hierarchical Parent ID Number
 *          					Identification number of the next higher hierarchical data segment that the data
 *          					segment being described is subordinate to
 *          
 *          HL03 - 735 - Hierarchical Level Code
 *          					Code defining the characteristic of a level in a hierarchical structure
 *          
 *          HL04 - 736 - Hierarchical Child Code
 *          					Code indicating if there are hierarchical child data segments subordinate to the
 *          					level being described
 */
/*
 * Document modifications here:
 */
public class HL {

	private String hl01;
	private String hl02;
	private String hl03;
	private String hl04;

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
				
			put("628", "hl01");
			put("734", "hl02");
			put("735", "hl03");
			put("736", "hl04"); 
			
			
			 
		}
	};

	public HL() {

	}

	public HL(String hl01, String hl02, String hl03, String hl04, Map<String, String> dataelementmap) {
		super();
		this.hl01 = hl01;
		this.hl02 = hl02;
		this.hl03 = hl03;
		this.hl04 = hl04;
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

	public String getHl01() {
		return hl01;
	}

	public void setHl01(String hl01) {
		this.hl01 = hl01;
	}

	public String getHl02() {
		return hl02;
	}

	public void setHl02(String hl02) {
		this.hl02 = hl02;
	}

	public String getHl03() {
		return hl03;
	}

	public void setHl03(String hl03) {
		this.hl03 = hl03;
	}

	public String getHl04() {
		return hl04;
	}

	public void setHl04(String hl04) {
		this.hl04 = hl04;
	}

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
