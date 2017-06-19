package tymg.pdfReactor.service;

import tymg.pdfReactor.form.EAForm;

public interface DocumentService {
	public byte[] createEADocument(EAForm form);
}
