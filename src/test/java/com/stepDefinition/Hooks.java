package com.stepDefinition;

import com.testBase.Base;
import com.testBase.Configuration;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@Amazon")
	public void launchBrowser() throws Throwable {
		loadConfigurationFile();
		config = new Configuration(prop);
		initilizeDriver(config.browserName());
	}

	@After("@Amazon")
	public void tearDown() {
		driver.close();
	}
}
