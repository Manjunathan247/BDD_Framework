package com.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"},glue= {"com.stepDefinition"},
				tags = {"@Amazon"} ,plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"},strict = true, dryRun= false)


public class TestRunner {

}
