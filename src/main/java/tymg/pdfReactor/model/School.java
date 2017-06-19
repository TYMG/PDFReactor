/*
 * Proprietary and Confidential. Property of Accenture.
 *
 * For internal use only. All rights reserved.
 *
 * (c) Copyright Accenture 2016
 *
 */
 

package gov.ed.fsa.model;

public class School implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	
	private String name;
	private String longName;
	private String address1;
	private String cityStateZip;
	private String phoneNumber;
	private String schoolCode;
	private String mpnId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCityStateZip() {
		return cityStateZip;
	}
	public void setCityStateZip(String cityStateZip) {
		this.cityStateZip = cityStateZip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phone) {
		this.phoneNumber = phone;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getMpnId() {
		return mpnId;
	}
	public void setMpnId(String mpnId) {
		this.mpnId = mpnId;
	}

	
	
}