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
 * X12 Segment Name    : Military Personnel Information
 * X12 Purpose         : To report military service data
 * X12 Syntax          : 1. P0607 If either MPI06 or MPI07 is present, then the other is required.
 * Loop                : 2100C — SUBSCRIBER NAME
 * Segment Repeat      : 1
 * Usage               : SITUATIONAL
 * Situational Rule    : Required when this transaction is processed by DOD or CHAMPUS/TRICARE 
 *                      and when necessary to convey the Subscriber’s military service data If not required by this implementation guide, 
 *                      do not send.
 * TR3 Example         : MPI✽C✽AO✽A✽✽L3~
 * Current Active Military - Overseas Air Force Lieutenant Colonel
 *          
 *	MPI01 1201 Information Status Code
 *	          A code to indicate the status of information.
*	MPI02 584 Employment Status Code 
*	          Code showing the general employment status of an employee/claimant.
MPI03 1595 Government Service Affiliation Code 
            Code specifying the government service affiliation.
MPI04 352 Description
           A free-form description to clarify the related data elements and their content.
            SEMANTIC: MPI04 is the actual response to further identify the exact military unit.
MPI05 1596 Military Service Rank Code 
            Code specifying the military service rank.
MPI06 1250 Date Time Period Format Qualifier 
             Code indicating the date format, time format, or date and time format.
MPI07 1251 Date Time Period 
            Expression of a date, a time, or range of dates, times or dates and times.
 */
/*
 * Document modifications here:
 */
public class MPI {


	private String mpi01;
	private String mpi02;
	private String mpi03;
	private String mpi04;
	private String mpi05;
	private String mpi06;
	private String mpi07;
	 

	private Map<String, String> dataelementmap = new HashMap<String, String>() {
		{
			put("1201", "mpi01");
			put("584", "mpi02");
			put("1595", "mpi03");
			put("352", "mpi04");
			put("1596", "mpi05");
			put("1250", "mpi06");
			put("1251", "mpi07"); 
		}
	};

	public MPI() {

	}

	public MPI(String mpi01, String mpi02, String mpi03, String mpi04, String mpi05, String mpi06, String mpi07 , Map<String, String> dataelementmap) {
		super();
		this.mpi01 = mpi01;
		this.mpi02 = mpi02;
		this.mpi03 = mpi03;
		this.mpi04 = mpi04;
		this.mpi05 = mpi05;
		this.mpi06 = mpi06;
		this.mpi07 = mpi07;
		 
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

	public String getMpi01() {
		return mpi01;
	}

	public void setMpi01(String mpi01) {
		this.mpi01 = mpi01;
	}

	public String getMpi02() {
		return mpi02;
	}

	public void setMpi02(String mpi02) {
		this.mpi02 = mpi02;
	}

	public String getMpi03() {
		return mpi03;
	}

	public void setMpi03(String mpi03) {
		this.mpi03 = mpi03;
	}

	public String getMpi04() {
		return mpi04;
	}

	public void setMpi04(String mpi04) {
		this.mpi04 = mpi04;
	}

	public String getMpi05() {
		return mpi05;
	}

	public void setMpi05(String mpi05) {
		this.mpi05 = mpi05;
	}

	public String getMpi06() {
		return mpi06;
	}

	public void setMpi06(String mpi06) {
		this.mpi06 = mpi06;
	}

	public String getMpi07() {
		return mpi07;
	}

	public void setMpi07(String mpi07) {
		this.mpi07 = mpi07;
	}

	 public Map<String, String> getDataelementmap() {
		return dataelementmap;
	}

	public void setDataelementmap(Map<String, String> dataelementmap) {
		this.dataelementmap = dataelementmap;
	}

}
