package tymg.pdfReactor.form;

import tymg.pdfReactor.model.Endorser;
import tymg.pdfReactor.model.Person;
import tymg.pdfReactor.model.School;
import tymg.pdfReactor.model.Student;

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
