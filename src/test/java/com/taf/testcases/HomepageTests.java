package com.taf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.taf.driver.DriverManager;

public final class HomepageTests extends BaseTest {
	
	
	private HomepageTests() {
		
	}
	
	@Test
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation My Test Home",Keys.ENTER); //Ctrl+Shift+O -> Auto Import
	}
	
}
