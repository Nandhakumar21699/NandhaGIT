package org.ten;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg9 extends BaseClass {
	
	@Test
	private void tc1() {
		
		driver.get("https://en-gb.facebook.com/");
		String title = pageTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("selenium@gmail.com");
		
//		hard assert
		Assert.assertTrue(title.contains("facebook"), "check your page title");

		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys("inmakes");

	}
	
	@Test
	private void tc9() {
		
		driver.get("https://en-gb.facebook.com/");
		
		String title = pageTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nandha@gmail.com");
		
//		soft assert 
		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"), "check your title");
		

		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys("1234");
		
		s.assertAll();
		
		

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
