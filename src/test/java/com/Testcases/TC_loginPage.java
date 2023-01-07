package com.Testcases;

import org.testng.annotations.Test;

import com.PageObject.indexPage;

public class TC_loginPage extends BaseClass{
    
	@Test
	public void verifyLogin()
	{
		driver.get(url);
		
		indexPage pg = new indexPage(driver);
		pg.enterEmailId("standard_user");
		pg.enterPassword("secret_sauce");
		pg.clickOnLogin();
	}

}
