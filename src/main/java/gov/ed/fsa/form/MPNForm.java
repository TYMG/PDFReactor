package gov.ed.fsa.form;

import gov.ed.fsa.model.EAMPNPerson;
import gov.ed.fsa.model.Employer;
import gov.ed.fsa.model.Endorser;
import gov.ed.fsa.model.Reference;
import gov.ed.fsa.model.School;
import gov.ed.fsa.model.Student;

public class MPNForm {

	private EAMPNPerson borrower;
	private Student student;
	private Reference reference1;
	private Reference reference2;
	private School school;
	private Employer employer;
	
	public EAMPNPerson getBorrower() {
		return borrower;
	}
	public void setBorrower(EAMPNPerson borrower) {
		this.borrower = borrower;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Reference getReference1() {
		return reference1;
	}
	public void setReference1(Reference reference1) {
		this.reference1 = reference1;
	}
	public Reference getReference2() {
		return reference2;
	}
	public void setReference2(Reference reference2) {
		this.reference2 = reference2;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	

}
