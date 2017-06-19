package tymg.pdfReactor.service;

import java.util.HashMap;

import tymg.pdfReactor.form.EAForm;
import tymg.pdfReactor.main.MustacheTemplateInjector;
import tymg.pdfReactor.main.MustacheTemplateInjectorHelper;
import tymg.pdfReactor.main.PDFGenerator;

public class DocumentServiceImpl implements DocumentService {

	private PDFGenerator pdfGenerator;
	MustacheTemplateInjector mti;
	
	public DocumentServiceImpl() {
	    mti =  new MustacheTemplateInjector();
		pdfGenerator = new PDFGenerator();
	}
	
	@Override
	public byte[] createEADocument(EAForm eaForm) {
		
		mti.compile("");
		HashMap<String, Object> scopes = new HashMap<String, Object>();
		//Endorser 
		scopes.put("eaForm", eaForm );
		MustacheTemplateInjectorHelper helper = new MustacheTemplateInjectorHelper();
		helper.determineCitizenshipStatus(eaForm.getEndorser().getCitizenshipStatus());
		helper.determineReference1Address2(eaForm.getReference1().getAddressLine2());
		helper.determineReference2Address2(eaForm.getReference2().getAddressLine2());
		helper.determineBorrowerAddress2Tag(eaForm.getBorrower().getAddressLine2());
		helper.setTodaysDate();
		scopes.put("helper",helper);
		return pdfGenerator.generatePDF("EA", mti.toHtml(scopes));
	}

}
