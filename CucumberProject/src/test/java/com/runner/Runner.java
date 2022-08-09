package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.stepDefinition"},
monochrome=true,
plugin= {"html:Reports\\HTMLReports.html",
		"json:Reports\\JSONReports.json",
		"junit:Reports\\JunitReports.xml"},
dryRun=false
)

public class Runner 
{

	
	
}
