package org.tem;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TestNg13 extends BaseClass{
	
	@Test(retryAnalyzer = Failed.class )
	private void tc1() {
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("selenium@gmail.com");

		Assert.assertEquals("Facebook", "check your page title");
		
		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys("inmakes");

	}

	@Test
	private void tc9() {
		launchUrl("https://www.amazon.com/");
	}

	@Test(enabled = false)
	private void tc5() {
		launchUrl("https://www.flipkart.com/");
	}

	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	private void closeTheBrowser() {
		System.out.println("close the browser....");

	}


}
