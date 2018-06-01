package com.QA.TestClasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.Base.TestBaseClass;
import com.QA.Pages.LoginPage;
import com.QA.Pages.UserHomePage;

public class LoginPageTest extends TestBaseClass {

	LoginPage loginPage;
	UserHomePage userhp;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod()
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service",
				"Page title not as per requirement");
	}

	@Test(priority = 2)
	public void crmLogoImageTest() {
		boolean flag = loginPage.ValidateCRMLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginTest() {
		userhp = loginPage.VerifyUserLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
