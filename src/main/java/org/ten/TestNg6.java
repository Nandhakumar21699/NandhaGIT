package org.ten;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.FbLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg6 extends BaseClass {

//	            username  password
	@Parameters({ "user", "pass" })
	@Test
	private void tc1(@Optional("abc@gmail.com") String e, @Optional("1234") String pass) {
		driver.get("https://en-gb.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);

		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys(pass);

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
