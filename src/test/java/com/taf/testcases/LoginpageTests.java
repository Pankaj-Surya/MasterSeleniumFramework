package com.taf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.taf.driver.Driver;

public final class LoginpageTests extends BaseTest {

	@Test
	public void test1() {
		// Driver from BasTest and Driver From Login Test
		// Two instances of driver
		// To Avoid duplicate driver we set driver==null in Driver class
		Driver.initDriver();
		Driver.driver.findElement(By.name("q")).sendKeys("Automatiom", Keys.ENTER);
	}

	@Test
	public void test2() {
		
		Driver.driver.findElement(By.name("q")).sendKeys("Automation Testing", Keys.ENTER); // Ctrl+Shift+O -> Auto
																							// Import
	}
}
