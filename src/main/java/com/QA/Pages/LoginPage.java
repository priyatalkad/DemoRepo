package com.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Base.TestBaseClass;

public class LoginPage extends TestBaseClass {

	
	//// **************** Defining elements  ********** ////
	
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	
	//// **************** Initializing Elements ********** ////
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	//// ********** Defining actions present on the login page ********** ////
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean ValidateCRMLogo() {
		return crmLogo.isDisplayed();
	}

	public UserHomePage VerifyUserLogin(String uname, String pword) {
		username.sendKeys(uname);
		password.sendKeys(pword);
		loginBtn.click();
		return new UserHomePage();
	}

}
