package com.taf.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.taf.constants.FrameworkConstants;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); //Ctrl+Shift+O -> Auto Import
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
