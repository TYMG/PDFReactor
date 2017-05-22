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
		
		configuration.setDocument("<html><body>Hello World</body></html>");
		
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
