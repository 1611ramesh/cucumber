package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void jvmReport(String jsonFile) {
        
		File reportdir = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\output");
		
		Configuration conf = new Configuration(reportdir, "facebook automation");
		
		conf.addClassifications("brower", "chrome");
		conf.addClassifications("sprint", "23");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(li, conf);
		
		builder.generateReports();
		
}}
