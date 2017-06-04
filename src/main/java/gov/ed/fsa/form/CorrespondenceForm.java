package gov.ed.fsa.form;

import java.util.List;

import gov.ed.fsa.model.Borrower;
import gov.ed.fsa.model.CreditBureau;
import gov.ed.fsa.model.Endorser;
import gov.ed.fsa.model.School;
import gov.ed.fsa.model.Student;

public class CorrespondenceForm  {


	public static class CorrespondenceFormData {
		public String requestDate;
		public String accountNumber;
		public String awardId;
		public String accountNumberUnmasked;
		public String creditLimit;
		public String coApplicantName;
		public String loanApprovedAmount;

		public CorrespondenceFormData() {
		}
	}
	private CorrespondenceFormData correspondenceInfo;
	private List<String> declinedReasonList;
	
	
	private Borrower borrower;
	private Endorser endorser;
	private Student student;
	private School school;
	private CreditBureau creditBureau;
	
	
	public CorrespondenceFormData getData() {
		return correspondenceInfo;
	}
	public void setData(CorrespondenceFormData correspondenceFormData) {
		this.correspondenceInfo = correspondenceFormData;
	}
	
	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	public Endorser getEndorser() {
		return endorser;
	}
	public void setEndorser(Endorser endorser) {
		this.endorser = endorser;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public CreditBureau getCreditBureau() {
		return creditBureau;
	}
	public void setCreditBureau(CreditBureau creditBureau) {
		this.creditBureau = creditBureau;
	}
	public CorrespondenceFormData getCorrespondenceFormData() {
		return correspondenceInfo;
	}
	public void setCorrespondenceFormData(CorrespondenceFormData correspondenceFormData) {
		this.correspondenceInfo = correspondenceFormData;
	}
	public String getLoanApprovedAmount() {
		return correspondenceInfo.loanApprovedAmount;
	}
	public void setLoanApprovedAmount(String loanApprovedAmount) {
		this.correspondenceInfo.loanApprovedAmount = loanApprovedAmount;
	}
	
	public String getRequestDate() {
		return correspondenceInfo.requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.correspondenceInfo.loanApprovedAmount = requestDate;
	}
	
	public String getAwardId() {
		return correspondenceInfo.awardId;
	}
	
	public void setAwardId( String awardId){
		this.correspondenceInfo.awardId = awardId;
	}
	
	public List<String> getDeclinedReasonList() {
		return declinedReasonList;
	}
	public void setDeclinedReasonList(List<String> declinedReasonList) {
		this.declinedReasonList = declinedReasonList;
	}
	
	public String getAccountNumber() {
		return correspondenceInfo.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.correspondenceInfo.accountNumber = accountNumber;
	}

	public String getAccountNumberUnmasked() {
		return correspondenceInfo.accountNumberUnmasked;
	}

	public void setAccountNumberUnmasked(String accountNumberUnmasked) {
		this.correspondenceInfo.accountNumberUnmasked = accountNumberUnmasked;
	}

	public String getCreditLimit() {
		return correspondenceInfo.creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.correspondenceInfo.creditLimit = creditLimit;
	}

	public String getCoApplicantName() {
		return correspondenceInfo.coApplicantName;
	}

	public void setCoApplicantName(String coApplicantName) {
		this.correspondenceInfo.coApplicantName = coApplicantName;
	}
	
}
