package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPages extends TestBase{
	
	//Page Factory OR
	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type ='submit']")
	WebElement login;
	
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement signup;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmlogo;

	//Initializing the Page Objects
	public LoginPages() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateloginpageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmlogo.isDisplayed();
	}
	
	public HomePages login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePages();
	}

	
}
