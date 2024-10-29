package com.taf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.taf.driver.DriverManager;


// private - protected - default - public
public final class HomepageTests extends BaseTest {
	
	
	private HomepageTests() {
		
	}
	
	@Test
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Test Home-1",Keys.ENTER); //Ctrl+Shift+O -> Auto Import
	}
	
}
