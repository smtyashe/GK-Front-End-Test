package com.gkauto.name.gkAutomation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@SuppressWarnings("unused")
public class BaseTest {

	WebDriver driver;
	 private static String browser = "https://www.seleniumhq.org";
	@BeforeMethod
	public void setUp() throws Exception {
		switch (browser)
        {
            case "Chrome":
                driver = new ChromeDriver();
             break;
            case "IE":
                driver = new InternetExplorerDriver();
            break;
            case "Firefox":
                driver = new FirefoxDriver();
            break;
        }
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(browser);
	}
	
	public static String getBrowser() {
		return browser;
	}

	public static void setBrowser(String browser) {
		BaseTest.browser = browser;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@AfterMethod
	   public void tearDown() throws Exception {
		
	      driver.quit();
	     
	   }
	
	
}
