package tymg.pdfReactor.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tymg.pdfReactor.form.CorrespondenceForm;
import tymg.pdfReactor.form.EAForm;
import tymg.pdfReactor.form.Form;
import tymg.pdfReactor.model.Greeting;
import tymg.pdfReactor.service.DocumentService;
import tymg.pdfReactor.service.DocumentServiceImpl;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Document/")
public class DocumentationCreationController {
	
	private DocumentService docService; 

	

	private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
	    
	    @RequestMapping(value = "/Corr/{corrType}" , method = RequestMethod.POST )
	    public ResponseEntity<Form> createCorrDocument(@PathVariable(value="corrType") String docType, @RequestBody CorrespondenceForm form ){
	    	System.out.println("Create Document Hit With:" + docType);
	    	return null;
	    }
	    
	    @RequestMapping(value = "/EA/Default" , method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<ByteArrayResource> createEADocument(@RequestBody EAForm form ){
	    	System.out.println("Create EA Document Hit");
	    	 return ResponseEntity
	                 .ok()
	                 .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\\EA\\")
	                 .body(new ByteArrayResource(getDocService().createEADocument(form)));
	    }
	    
	    @RequestMapping(value = "/MPN/{mpnType}", method = RequestMethod.POST)
	    public ResponseEntity<Form> createMPNDocument(@PathVariable(value="mpnType") String mpnType, @RequestBody EAForm form ){
	    	System.out.println("Create Document Hit With:" + mpnType);
	    	return null;
	    }
	    
	    

		public DocumentService getDocService() {
			if(docService==null){
				docService = new DocumentServiceImpl();
			}
			return docService;
		}

		public void setDocService(DocumentService docService) {
			this.docService = docService;
		}
	    /*@RequestMapping(value = "/TEST", method = RequestMethod.POST)
	    public ResponseEntity<Form> createTestDocument(@RequestBody TestForm form ){
	    	System.out.println("Create Test Document Hit With:");
	    	return null;
	    }
*/
}
