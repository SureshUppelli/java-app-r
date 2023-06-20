package com.abcbs.benefitsedix12objects.models;

/**
 * 
 * @author	CACOBB
 * @version	1.0
 * @since	6-13-2022
 * @contact	iscfcclaimscore@arkbluecross.com
 * 
 *          Wrapper object containing all meta-data and payload
 *          associated with an exchange of x12 data using a standardized
 *          message format via a broker.
 */
/*
 * Document modifications here:
 */
public class MessageWrapper {

	private Header header = new Header();
	public String payload;

	public MessageWrapper() {

	}

	public MessageWrapper(Header header, String payload) {
		super();
		this.header = header;
		this.payload = payload;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}
