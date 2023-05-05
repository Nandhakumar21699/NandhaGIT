
package org.base;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	
	//non parameterized constructor
	
	public FbLoginPojo() {
	
		PageFactory.initElements(driver, this);
	}
	
	//private webelements
	
	@FindAll({
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(xpath="//input[@data-testid='royal_email']")
	})
	private WebElement varRef;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement logBtn;
	
	//getters to access webelement outside the class

	public WebElement getVarRef() {
		return varRef;

	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}
	
	
	
	
	
	
	

}
