package gov.ed.fsa;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import org.apache.commons.io.IOUtils;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

public class MustacheTemplateInjector {

	
	/**
	 * 
	 * The .mustache extension is required for Mustache to read it
	 * 
	 * @param templateName
	 * @return
	 */
	public String toHtml(String templateName) {
		MustacheFactory mf = new DefaultMustacheFactory();
		StringWriter mustacheExecutioner = new StringWriter();
		// Load html template from a saved location
		Mustache template = mf.compile("template/html/EA.mustache");
		// Use Mustache to create a template of type HTML from the input
		// stream
		HashMap<String, Object> scopes = new HashMap<String, Object>();
		scopes.put("name", "Matt");
		// This will fill in the data from the scopes HashMap we built into
		// the html template
		template.execute(mustacheExecutioner, scopes);
		return mustacheExecutioner.toString();
	}
}
