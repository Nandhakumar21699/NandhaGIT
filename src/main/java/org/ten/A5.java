package org.ten;

import java.util.Date;

import org.base.BaseClass;
import org.pojo.FbLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A5 extends BaseClass{

	@Test(invocationCount = 3)
	private void tc1() {
		launchUrl("https://en-gb.facebook.com/");
		FbLoginPojo f = new FbLoginPojo();
		passText("nandha", f.getVarRef());
		passText("1234", f.getPass());
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
