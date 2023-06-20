package com.abcbs.benefitsedix12objects.models.response;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.BHT;
import com.abcbs.benefitsedix12objects.models.SE;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 * 			The ST segment is the contents of the 270/271 transaction.  See each class/loop
 * 			for further documentation.
 * 
 *          X12 Segment Name:	Transaction Set Header
 *          X12 Purpose:		To indicate the start of a transaction set and to assign a control number.
 *          
 *          ST01 - 143 - Transaction Set Identifier Code
 *          					Code uniquely identifying a Transaction Set.
 *          
 *          ST02 - 329 - Transaction Set Control Number
 *          					Identifying control number that must be unique within the transaction set
 *          					functional group assigned by the originator for a transaction set.
 *          
 *          ST03 - 1705 - Transaction Set Version
 *                               Implementation Convention Reference
 *          					Reference assigned to identify Implementation Convention   
 */
/*
 * Document modifications here:
 */
public class ST {

	private String st01;
	private String st02;
	private String st03;
	private BHT bht = new BHT();
	private Loop2000A loop2000a = new Loop2000A();
	private Loop2000B loop2000b = new Loop2000B();
	private Loop2000C loop2000c = new Loop2000C();
//	private Loop2000D loop2000d = new Loop2000D();
//	private Loop2000E loop2000e = new Loop2000E();
	private SE se = new SE();

	private Map<String, String> dataelementmap = new HashMap<String, String>() {

		{
			put("143", "st01");
			put("329", "st02");
			put("1705", "st03");
		}
	};

	public ST() {

	}

	public ST(String st01, String st02, String st03, BHT bht, Loop2000A loop2000a, Loop2000B loop2000b,
			Loop2000C loop2000c, /* Loop2000D loop2000d, */
			/* Loop2000E loop2000e, */ SE se, Map<String, String> dataelementmap) {
		super();
		this.st01 = st01;
		this.st02 = st02;
		this.st03 = st03;
		this.bht = bht;
		this.setLoop2000a(loop2000a);
		this.setLoop2000b(loop2000b);
		this.setLoop2000c(loop2000c);
//		this.loop2000d = loop2000d;
	//	this.loop2000e = loop2000e;
		this.se = se;
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

	public String getSt01() {
		return st01;
	}

	public void setSt01(String st01) {
		this.st01 = st01;
	}

	public String getSt02() {
		return st02;
	}

	public void setSt02(String st02) {
		this.st02 = st02;
	}

	public String getSt03() {
		return st03;
	}

	public void setSt03(String st03) {
		this.st03 = st03;
	}

	public BHT getBht() {
		return bht;
	}

	public void setBht(BHT bht) {
		this.bht = bht;
	}

	 

//	public Loop2000D getLoop2000d() {
//		return loop2000d;
//	}
//
//	public void setLoop2000d(Loop2000D loop2000d) {
//		this.loop2000d = loop2000d;
//	}

//	public Loop2000E getLoop2000e() {
//		return loop2000e;
//	}
//
//	public void setLoop2000e(Loop2000E loop2000e) {
//		this.loop2000e = loop2000e;
//	}

	public SE getSe() {
		return se;
	}

	public void setSe(SE se) {
		this.se = se;
	}

	 

	public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

	public Loop2000A getLoop2000a() {
		return loop2000a;
	}

	public void setLoop2000a(Loop2000A loop2000a) {
		this.loop2000a = loop2000a;
	}

	public Loop2000B getLoop2000b() {
		return loop2000b;
	}

	public void setLoop2000b(Loop2000B loop2000b) {
		this.loop2000b = loop2000b;
	}

	public Loop2000C getLoop2000c() {
		return loop2000c;
	}

	public void setLoop2000c(Loop2000C loop2000c) {
		this.loop2000c = loop2000c;
	}

}
