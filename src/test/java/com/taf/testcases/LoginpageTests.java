package com.taf.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.taf.constants.FrameworkConstants;

public class LoginpageTests extends BaseTest {
	


	@Test
	public void test1() {
	  driver.findElement(By.name("q")).sendKeys("Automatiom",Keys.ENTER);
	}
	
	@Test
	public void test2() {
		driver.findElement(By.name("q")).sendKeys("Automation Testing",Keys.ENTER); //Ctrl+Shift+O -> Auto Import
	}
}
