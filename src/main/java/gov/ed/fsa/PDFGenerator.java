package gov.ed.fsa;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.xml.sax.SAXException;

import com.realobjects.pdfreactor.Configuration;
import com.realobjects.pdfreactor.Configuration.Resource;
import com.realobjects.pdfreactor.PDFreactor;
import com.realobjects.pdfreactor.Result;
import com.realobjects.pdfreactor.Exceptions.PDFreactorException;

public class PDFGenerator {

	private PDFreactor pdfReactor;
	private Configuration config;
	private MustacheTemplateInjector mti;
	
	PDFGenerator(){
		PDFreactor pdfReactor = new PDFreactor();	
		this.setPdfReactor(pdfReactor);
		Configuration config = new Configuration();
		this.setConfig(config);
		MustacheTemplateInjector mti =  new MustacheTemplateInjector();
		this.setMustacheTemplateInjector(mti);
		config.setLicenseKey("<license> <licensee> <name>matthew.a.green@accenturefederal.com</name> </licensee> <product>PDFreactor</product> <licensetype>Personal</licensetype> <purchasedate>2017-05-22</purchasedate> <outputformats> <pdf/> </outputformats> <signatureinformation> <signdate>2017-05-22 22:26</signdate> <signature>302c02142126026f29d29003e0011b46e94719611f4004fb02142e182b44ab71714f913f3343fcf2c4c3c7a9e318</signature> <checksum>1512</checksum> </signatureinformation> </license>");
	}
	
	public void generatePDF(String fileName){
		
		config.setUserStyleSheets(new Resource().setContent(retrieveCSSStyling("teest")));
		config.setDocument(mti.toHtml(fileName));
		
		
		try {
			Result result = pdfReactor.convert(config);
			
			byte[] pdfBytes  = result.getDocument();
			
			FileUtils.writeByteArrayToFile(new File("C://Users//Matthew.A.Green/Documents/PDF Reactor/EA.pdf"), pdfBytes);
					
		} catch (PDFreactorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	/**
	 * Retrieve the CSS Stylesheets
	 * 
	 * lc.mustache is basically an html file. The .mustache extension is
	 * required for Mustache to read it
	 * 
	 * @param mustacheFileName
	 * @return
	 */
	public String retrieveCSSStyling(String mustacheFileName) {
		StringWriter mustacheTemplateWriter = new StringWriter();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("template/css/EA.css"); //
		try {
			IOUtils.copy(is,
					mustacheTemplateWriter, StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mustacheTemplateWriter.toString();
	}

	public PDFreactor getPdfReactor() {
		return pdfReactor;
	}

	public void setPdfReactor(PDFreactor pdfReactor) {
		this.pdfReactor = pdfReactor;
	}

	public Configuration getConfig() {
		return config;
	}

	public void setConfig(Configuration config) {
		this.config = config;
	}

	public MustacheTemplateInjector getMustacheTemplateInjector() {
		return mti;
	}

	public void setMustacheTemplateInjector(MustacheTemplateInjector mti) {
		this.mti = mti;
	}
}
