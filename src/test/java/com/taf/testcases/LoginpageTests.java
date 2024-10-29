package com.taf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.taf.driver.DriverManager;

public final class LoginpageTests extends BaseTest {

	@Test
	public void test1() {

		// Driver from BasTest and Driver From Login Test
		// Two instances of driver
		// To Avoid duplicate driver we set driver==null in Driver class
		//Driver.initDriver();
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Test Login-1", Keys.ENTER);
	}

	@Test
	public void test3() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Test Login-2", Keys.ENTER);// Ctrl+Shift+O -> AutoImport
	}
}
