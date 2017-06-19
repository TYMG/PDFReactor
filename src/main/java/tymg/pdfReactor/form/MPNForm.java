package tymg.pdfReactor.form;

import tymg.pdfReactor.model.EAMPNPerson;
import tymg.pdfReactor.model.Employer;
import tymg.pdfReactor.model.Endorser;
import tymg.pdfReactor.model.Reference;
import tymg.pdfReactor.model.School;
import tymg.pdfReactor.model.Student;

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
