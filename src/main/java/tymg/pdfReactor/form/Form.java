package gov.ed.fsa.form;

import gov.ed.fsa.model.Endorser;
import gov.ed.fsa.model.Person;
import gov.ed.fsa.model.School;
import gov.ed.fsa.model.Student;

// TODO: Auto-generated Javadoc
/**
 * The Interface Form.
 *
 * @author matthew.a.green
 */
public interface Form {
	
	public Person getBorrower();
	public void setBorrower(Person borrower);
	public Endorser getEndorser();
	public void setEndorser(Endorser endorser);
	public Student getStudent();
	public void setStudent(Student student);
	public School getSchool();
	public void setSchool(School school);
	
}
