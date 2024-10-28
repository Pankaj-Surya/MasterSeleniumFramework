package com.taf.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginpageTests {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/"); //Ctrl+Shift+O -> Auto Import
	}
	
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/"); //Ctrl+Shift+O -> Auto Import
	}
}
