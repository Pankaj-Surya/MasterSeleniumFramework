package com.taf.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomepageTests extends BaseTest {
	@Test
	public void test1() {
		driver.findElement(By.name("q")).sendKeys("Automation My Test",Keys.ENTER); //Ctrl+Shift+O -> Auto Import
	}
	
}
