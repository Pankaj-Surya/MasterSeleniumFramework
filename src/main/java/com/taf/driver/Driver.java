package com.taf.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.taf.constants.FrameworkConstants;

public class Driver {

	private Driver() {
		
	}
	
	private static WebDriver driver;
	
	

	
	
	public static void initDriver() {
		if(Objects.isNull(driver)) {  // driver==null
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
		    driver = new ChromeDriver();
		    
		    // Using Threadlocal methods
		    DriverManager.setDriver(driver);
		    DriverManager.getDriver().get("https://www.google.com/"); //Ctrl+Shift+O -> Auto Import	
		}
		
	}
	
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) { //driver != null
			driver.quit();	
//			driver=null;
			DriverManager.unload();
		}
		
	}
}
