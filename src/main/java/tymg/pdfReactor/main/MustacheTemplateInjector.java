package tymg.pdfReactor.main;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.HashMap;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import tymg.pdfReactor.form.EAForm;
import tymg.pdfReactor.model.Borrower;
import tymg.pdfReactor.model.EAMPNPerson;
import tymg.pdfReactor.model.Employer;
import tymg.pdfReactor.model.Reference;
import tymg.pdfReactor.model.School;
import tymg.pdfReactor.model.Student;

public class MustacheTemplateInjector {

	private MustacheFactory mf;
	private Mustache template; 
	
	public MustacheTemplateInjector() {
		mf = new DefaultMustacheFactory();
	}
	
	
	
	public void compile(String fileLocation){
		 template = mf.compile("template/html/EA.mustache");
	}
	
	/**
	 * 
	 * The .mustache extension is required for Mustache to read it
	 * 
	 * @param templateName
	 * @return
	 */
	public String toHtml(HashMap<String, Object> scopes) {
		/*MustacheFactory mf = new DefaultMustacheFactory();
		// Load html template from a saved location
		Mustache template = mf.compile("template/html/EA.mustache");
		// Use Mustache to create a template of type HTML from the input
		// stream
		HashMap<String, Object> scopes = new HashMap<String, Object>();
		//Endorser 
		EAForm eaForm = createEAForm();
		scopes.put("eaForm", eaForm );
		MustacheTemplateInjectorHelper helper = new MustacheTemplateInjectorHelper();
		helper.determineCitizenshipStatus(eaForm.getEndorser().getCitizenshipStatus());
		helper.determineReference1Address2(eaForm.getReference1().getAddressLine2());
		helper.determineReference2Address2(eaForm.getReference2().getAddressLine2());
		helper.determineBorrowerAddress2Tag(eaForm.getBorrower().getAddressLine2());
		helper.setTodaysDate();
		scopes.put("helper",helper);
		scopes.put("endsr-info__ssn", "123456789");
		
		//Reference
		
		//Borrower
		
		//Dependent Undergraduate
		
		//Endorser Signature
		scopes.put("checked", "checked");
		// This will fill in the data from the scopes HashMap we built into
		// the html template
*/		
		StringWriter mustacheExecutioner = new StringWriter();
		template.execute(mustacheExecutioner, scopes);
		return mustacheExecutioner.toString();
	}

	/*public EAForm createEAForm(){	
		EAMPNPerson endorser = createEndorser();
		EAForm eaForm = new EAForm(createEndorser(),createReference1(),createReference2(),createBorrower(),createStudent(), createSchool(), createEmployer());
		return eaForm;
	}

	private Student createStudent() {
		Student student = new Student();
		student.setName("Bobby Brown");
		student.setSsn("123459999");
		return student;
	}

	private School createSchool() {
		School school = new School();
		school.setAddress1("000 Ripoff Dr SE");
		school.setName("IT Tech");
		school.setCityStateZip("Washington, D.C., 20009");
		return school;
	}

	private Borrower createBorrower() {
		Borrower borrower = new Borrower();
		borrower.setName("Lochness Monster");
		borrower.setSsn("987654321");
		borrower.setDob("7/7/1977");
		borrower.setAddressLine1("23 Strawberry Ln");
		borrower.setAddressLine2("Apt 999");
		borrower.setCityStateZip("Loch Lake, MD, 06660");
		borrower.setLoanIdentificationNumber("334567DFG54678GHJKL99");
		borrower.setDirectPLUSLoanAmount("$3.50");
		borrower.setPhoneNumber("(123) 666-5000");
		borrower.setSchoolName("IT Tech");
		borrower.setSchoolAddress("000 Ripoff Dr SE");
		return borrower;
	}

	private Reference createReference1() {
		Reference reference1 = new Reference();
		reference1.setFirstName("Johnny");
		reference1.setMiddleInitial("Z");
		reference1.setLastName("Quest");
		reference1.setAddressLine1("333 Quest Ln");
		reference1.setAddressLine2("Apt 456");
		reference1.setCity("New York");
		reference1.setState("NY");
		reference1.setZipCode("99999");
		reference1.setEmail("Johnny@Quest.com");
		reference1.setPhoneNumber("(561) 455-5000");
		return reference1;
	}
	
	private Reference createReference2() {
		Reference reference2 = new Reference();
		reference2.setFirstName("Race");
		reference2.setMiddleInitial("J");
		reference2.setLastName("Bannon");
		reference2.setAddressLine1("333 Quest Ln");
		reference2.setAddressLine2("Apt 456");
		reference2.setCity("New York");
		reference2.setState("NY");
		reference2.setZipCode("99999");
		reference2.setEmail("RaceBannon@Quest.com");
		reference2.setPhoneNumber("(561) 999-6660");

		return reference2;
	}

	private Employer createEmployer() {
		Employer employer = new Employer();
		employer.setName("Sanford and Son's");
		employer.setAddress("12345 Junkyard Rd");
		employer.setCityStateZip("Arlington, VA, 90990");
		employer.setWorkPhone("(703) 666-0000");
		return employer;
	}
	
	

	private EAMPNPerson createEndorser() {
		EAMPNPerson endorser = new EAMPNPerson();
		endorser.setName("Ginuwine");
		endorser.setSsn("123456789");
		endorser.setDob("6/6/1996");
		endorser.setAddressLine1("123 G Street");
		endorser.setAddressLine2("Apt 666");
		endorser.setCityStateZip("Washington, D.C., 20009");
		endorser.setMailingAddressLine1("666 M Street");
		endorser.setMailingAddressLine2("Apt 123");
		endorser.setMailingCityStateZip("Washington, D.C., 20009");
		endorser.setPhoneNumber("(281) 330-8004");
		endorser.setDlState("MD");
		endorser.setDlNum("12000000478DHH7788");
		endorser.setEmail("WhoIsMikeJones@test.gov");
		endorser.setCitizenshipStatus("OTHER");
		endorser.setAlienReg("VGVHG748320932");
		return endorser;
	}
	 
	 static class Person {
		    Person(String name) {
		       this.name = name;
		    }
		    String name;
		  }
*/}


