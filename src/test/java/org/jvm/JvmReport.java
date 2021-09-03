package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void jvmGenerate(String json) {
			
		File f = new File("D:\\SeleniumFrameworks - Workspace\\Cucumber_TestPaper\\REPORTS\\JVMReport");
        
		Configuration c = new Configuration(f,"E-Commerce Project");
		
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Selenium Version", "3.141.59");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		
	}


}
