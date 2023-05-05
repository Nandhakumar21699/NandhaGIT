package org.ten;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg10One {
	
	@Test
	private void tc3() {
		System.out.println("test case 3 : "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nandha@gmail.com");

		WebElement pas = driver.findElement(By.name("pass"));
		pas.sendKeys("1234");


	}
	
	@Test
	private void tc1() {
		System.out.println("test case 1 : "+Thread.currentThread().getId());
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
			
    }
	
	@Test
	private void tc2() {
		System.out.println("test case 2 : "+Thread.currentThread().getId());

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		
		

	}
	

}
