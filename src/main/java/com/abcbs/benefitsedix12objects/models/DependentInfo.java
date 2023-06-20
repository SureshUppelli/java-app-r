package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Class representing the DependentInfo element found within the EDIInfo class
 *          of the Header of the MessageWrapper (Header.EDIInfo.DependentInfo).
 *          
 *          This is an optional class and may or may not be present in the wrapper.
 */
/*
 * Document modifications here:
 */
public class DependentInfo {

	private String firstname;
	private String lastname;
	private String middlename;
	private String suffix;
	private String membernumber;

	public DependentInfo() {

	}

	public DependentInfo(String firstname, String lastname, String middlename, String suffix, String membernumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.suffix = suffix;
		this.membernumber = membernumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getMembernumber() {
		return membernumber;
	}

	public void setMembernumber(String membernumber) {
		this.membernumber = membernumber;
	}

}
