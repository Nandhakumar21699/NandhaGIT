package org.ten;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg2 extends BaseClass{
	
	@Test
	private void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	private void tc9() {
		System.out.println("Test Case 9");
	}

	@Test
	private void tc5() {
		System.out.println("Test Case 5");
	}
	
	@BeforeMethod
	private void startDate() {
		System.out.println("Test case starting date and time");
	}
	
	@AfterMethod
	private void endDate() {
		System.out.println("Test case end date and time");
    }
	
	@BeforeClass
	private void launchTheBrowser() {
		System.out.println("Launch the browser....");
    }
	
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("close the browser....");
	}
	
	
	



}
