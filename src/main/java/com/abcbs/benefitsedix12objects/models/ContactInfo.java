package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author CACOBB
 * @version 1.0
 * @since 5-18-2022
 * @contact iscfcclaimscore@arkbluecross.com
 * 
 *          This class is not an actual x12 object but a custom class used to
 *          store contact info and it's matching qualifier. Used in contact map
 *          in PER segment.
 */
/*
 * Document modifications here:
 */
public class ContactInfo {

	private String commnumqual;
	private String commnnum;

	public ContactInfo() {

	}

	public ContactInfo(String commnumqual, String commnnum) {
		super();
		this.commnumqual = commnumqual;
		this.commnnum = commnnum;
	}

	public String getCommnumqual() {
		return commnumqual;
	}

	public void setCommnumqual(String commnumqual) {
		this.commnumqual = commnumqual;
	}

	public String getCommnnum() {
		return commnnum;
	}

	public void setCommnnum(String commnnum) {
		this.commnnum = commnnum;
	}

}
