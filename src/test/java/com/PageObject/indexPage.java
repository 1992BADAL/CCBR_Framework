package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {

	// 1.Create WebDriver Object
	WebDriver ldriver;

	// 2. Create Constructor
	public indexPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	
	//3. Identify WebElement
	@FindBy(id="user-name")
	WebElement emailId ;
	
	@FindBy(id="password")
	WebElement password ;
	
	@FindBy(id="login-button")
	WebElement login ;
	
	//Identify action on webElement
	public void enterEmailId(String emailAdd)
	{
		emailId.sendKeys(emailAdd);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		login.click();
	}

}
