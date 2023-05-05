package org.ten;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg8 extends BaseClass
{
	
	@DataProvider(name = "Sample Data")
	private Object[][] data() {
		return new Object[][] {
			{"abc@gmail.com","12345"},
			{"selenium@gmail.com","inmakes"},
			{"nandha@gmail.com","1234"},
			{"kmckaf@gmail.com","72379"}
    };
	}

	@Test(dataProvider = "Sample Data")
	private void tc1(String e,String pass) {
		driver.get("https://en-gb.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(e);

		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys(pass);

	}
	
	@DataProvider(name="Amazon data")
	//private se a8
	public Object[][] datas() {
		return new Object[][] {
			{"football"},
			{"sanitizer"},
			{"xbox"},
			{"play station"},
			{"shoes"}

	};
	}

	@Test(dataProvider ="Amazon data")
	private void tc9(String product) throws AWTException {
		launchUrl("https://www.amazon.com/");
		windowMaximize();
		
		WebElement srchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    srchBox.sendKeys(product);
	    
	    Robot r = new Robot();
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	
	
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

//		watch last 2 min of this video
	}



}
