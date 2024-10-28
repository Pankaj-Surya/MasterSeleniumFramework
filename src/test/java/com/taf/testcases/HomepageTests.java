package com.taf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.taf.driver.Driver;

public final class HomepageTests extends BaseTest {
	
	
	private HomepageTests() {
		
	}
	
	@Test
	public void test1() {
		Driver.driver.findElement(By.name("q")).sendKeys("Automation My Test",Keys.ENTER); //Ctrl+Shift+O -> Auto Import
	}
	
}
