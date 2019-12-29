package com.ntiit.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGtestrunner {
	@CucumberOptions(
			features = {"Features"},
			glue = {"com.ntiit.Stepdef"}
			)
	public class Testrunner extends AbstractTestNGCucumberTests{}
}
