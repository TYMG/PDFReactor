package gov.ed.fsa;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;

import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.xml.sax.SAXException;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.realobjects.pdfreactor.Configuration;
import com.realobjects.pdfreactor.PDFreactor;
import com.realobjects.pdfreactor.Result;
import com.realobjects.pdfreactor.Exceptions.PDFreactorException;

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PDFGenerator pdfGen = new PDFGenerator();
		pdfGen.generatePDF("EA");

	}
	

	

}
