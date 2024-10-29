package com.taf.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.taf.constants.FrameworkConstants;
import com.taf.utils.ReadPropertyFile;

public class Driver {

	private Driver() {
		
	}
	
	//private static WebDriver driver;
	
	

	
	
	public static void initDriver() throws Exception {
		System.out.println(Thread.currentThread()+"  "+DriverManager.getDriver());
		if(Objects.isNull(DriverManager.getDriver())) {  // driver==null
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
		    // driver = new ChromeDriver();
			// DriverManager.setDriver(driver);
		  
			// Using Threadlocal methods
			// solved - facing issue when 2 Login and 1 Home Test It is failing 1 test  
			DriverManager.setDriver(new ChromeDriver()); 
		    DriverManager.getDriver().get(ReadPropertyFile.getValue("URL")); 	
		}
		
	}
	
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) { //driver != null
			DriverManager.getDriver().quit();	
//			driver=null;
			DriverManager.unload();
		}
		
	}
}
