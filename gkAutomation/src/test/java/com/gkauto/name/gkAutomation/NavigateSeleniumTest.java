package com.gkauto.name.gkAutomation;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

import com.gkauto.name.gkAutomation.BaseTest;

//@SuppressWarnings("deprecation")
public class NavigateSeleniumTest extends BaseTest {
	@Test
	public void navigateSelenimWebsite(){

		BaseTest.getBrowser();
	// Check that the page title contains the term "Software Testing"
    AssertJUnit.assertTrue(driver.getTitle().contains("Browser Automation")); 
    
   //search selenium page.
    driver.findElement(By.id("q")).sendKeys("selenium webdriver");
    
    //Click go which submit button
    driver.findElement(By.id("submit")).click();
    
	}
}
