/*
 * Proprietary and Confidential. Property of Accenture.
 *
 * For internal use only. All rights reserved.
 *
 * (c) Copyright Accenture 2016
 *
 */
 

package gov.ed.fsa.model;

public class Name {
	
	private String suffix;
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name() { }
	
	public Name(String firstName, String middleName, String lastName, String suffix) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setSuffix(suffix);
		
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName(){
		return  this.firstName + " " + this.middleName + " " + this.lastName ;
	}
	
	public String getNameLastFirstMiddle(){
		return this.lastName + " " + this.firstName + " " + this.middleName;
	}
	

}