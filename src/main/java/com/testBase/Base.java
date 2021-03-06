package com.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.utility.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	public Wait wait;
	public static Properties prop;
	public static Configuration config;
	

	public void initilizeDriver(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			driver = new ChromeDriver();
			log.info("I am in Chrome");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("I am in Firefox");
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.info("I am in IE");
			driver.manage().window().maximize();
		}
		wait = new Wait(driver);
		wait.implicitWait(config.ImplicitWait());
	}

	public void loadConfigurationFile() throws Throwable {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "/Configuration/GlobalData.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		log.info("Loading Property file");
	}

	public String screenShot(String testCaseName, WebDriver driver) throws Throwable {
		String path = System.getProperty("user.dir") + "\\Screenshots\\" + testCaseName + ".png";
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		File desc = new File(path);
		FileUtils.copyFile(source, desc);
		return path;
	}

}
