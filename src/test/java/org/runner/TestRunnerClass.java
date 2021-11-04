package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"org.stepdefinition" }, monochrome = true, plugin = { "pretty",
				"json:src/test/resources/Output/report2.json" }, dryRun = false, snippets = SnippetType.CAMELCASE, strict = true)
public class TestRunnerClass {

	@AfterClass
	public static void afterclass() {
		Reporting.jvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Output\\report2.json");
	}
}
