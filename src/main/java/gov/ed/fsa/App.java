package gov.ed.fsa;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.xml.sax.SAXException;

import com.realobjects.pdfreactor.Configuration;
import com.realobjects.pdfreactor.PDFreactor;
import com.realobjects.pdfreactor.Result;
import com.realobjects.pdfreactor.Exceptions.PDFreactorException;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PDFreactor pdfReactor = new PDFreactor();		
		Configuration configuration = new Configuration();
		configuration.setLicenseKey("<license> <licensee> <name>matthew.a.green@accenturefederal.com</name> </licensee> <product>PDFreactor</product> <licensetype>Personal</licensetype> <purchasedate>2017-05-22</purchasedate> <outputformats> <pdf/> </outputformats> <signatureinformation> <signdate>2017-05-22 22:26</signdate> <signature>302c02142126026f29d29003e0011b46e94719611f4004fb02142e182b44ab71714f913f3343fcf2c4c3c7a9e318</signature> <checksum>1512</checksum> </signatureinformation> </license>");
		
		configuration.setDocument("<html><body><h1>Hello World</h1><div><h3>Hello from Matt Green!!!</h3></div></body></html>");
		
		try {
			Result result = pdfReactor.convert(configuration);
			
			byte[] pdfBytes = result.getDocument();
			
			FileUtils.writeByteArrayToFile(new File("C://Users//Matthew.A.Green/Documents/PDF Reactor/HelloWord.pdf"), pdfBytes);
					
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

}
