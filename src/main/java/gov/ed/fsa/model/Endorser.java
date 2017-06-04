/*
 * Proprietary and Confidential. Property of Accenture.
 *
 * For internal use only. All rights reserved.
 *
 * (c) Copyright Accenture 2016
 *
 */
 

package gov.ed.fsa.model;

public class Endorser implements Person {

	private static final long serialVersionUID = 1L;

	
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String stateCode;
	private String zipCode;
	private String ssn;
	private String phoneNumber;
	private String dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phone) {
		this.phoneNumber = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEndorserCityStateZip(){
		return this.getCity() + ", " + this.getStateCode() + " " + this.getZipCode();
	}
	
	public String getNameLastFirstMiddle(){
		String[] nameSplit = this.name.split(" ");
		String lnFnMi = nameSplit[2] + " " + nameSplit[0] + " " + nameSplit[1];
		return lnFnMi;
	}
	
	
}