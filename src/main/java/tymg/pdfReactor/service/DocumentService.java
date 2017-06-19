package gov.ed.fsa.service;

import gov.ed.fsa.form.EAForm;

public interface DocumentService {
	public byte[] createEADocument(EAForm form);
}
