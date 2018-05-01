package com.crm.qa.testdata;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePages;
import com.crm.qa.pages.LoginPages;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPages loginpages;
	HomePages homepage;
	
	public LoginPageTest() throws Exception {
		super();
		}
	
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		LoginPages loginpage = new LoginPages();
	}
	
	@Test(priority = 1)
	public void LoginPagetitleTest() {
		String title = loginpages.validateloginpageTitle();
	    Assert.assertEquals(title, "#1 Free CRM software in the cloud powers sales and customer service");
	}
	
	@Test(priority = 2)
	public void crmlogoImageTest() {
		boolean flag = loginpages.validateCRMImage();
	Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest() {
	homepage =	loginpages.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	

}
