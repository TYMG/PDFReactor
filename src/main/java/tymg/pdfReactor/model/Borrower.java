/*
 * Proprietary and Confidential. Property of Accenture.
 *
 * For internal use only. All rights reserved.
 *
 * (c) Copyright Accenture 2016
 *
 */
 

package tymg.pdfReactor.model;

public class Borrower implements Person {

	private static final long serialVersionUID = 1L;

	
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String cityStateZip;
	private String ssn;
	private String dob;
	private String phoneNumber;
	private String directPLUSLoanAmount;
	private String borrowerPhoneNumber;
	private String schoolName;
	private String schoolAddress;
	private String schoolCityStateZip;
	private String loanIdentificationNumber;
	
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

	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNameLastFirstMiddle(){
		String[] nameSplit = this.name.split(" ");
		String lnFnMi = nameSplit[2] + " " + nameSplit[0] + " " + nameSplit[1];
		return lnFnMi;
	}
	public String getDirectPLUSLoanAmount() {
		return directPLUSLoanAmount;
	}
	public void setDirectPLUSLoanAmount(String directPLUSLoanAmount) {
		this.directPLUSLoanAmount = directPLUSLoanAmount;
	}
	public String getBorrowerPhoneNumber() {
		return borrowerPhoneNumber;
	}
	public void setBorrowerPhoneNumber(String borrowerPhoneNumber) {
		this.borrowerPhoneNumber = borrowerPhoneNumber;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolCityStateZip() {
		return schoolCityStateZip;
	}
	public void setSchoolCityStateZip(String schoolCityStateZip) {
		this.schoolCityStateZip = schoolCityStateZip;
	}
	public String getCityStateZip() {
		return cityStateZip;
	}
	public void setCityStateZip(String cityStateZip) {
		this.cityStateZip = cityStateZip;
	}
	public String getLoanIdentificationNumber() {
		return loanIdentificationNumber;
	}
	public void setLoanIdentificationNumber(String loanIdentificationNumber) {
		this.loanIdentificationNumber = loanIdentificationNumber;
	}
	
	
}