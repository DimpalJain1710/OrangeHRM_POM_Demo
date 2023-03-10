package com.OrangeHRM.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OrangeHRM.common.OrangeHRM_BasePage;
import com.OrangeHRM.common.OrangeHRM_BaseSetup;
import com.OrangeHRM.home.OrangeHRM_SignInPage;
import com.OrangeHRM.utils.OrangeHRM_TestData;

public class OrangeHRM_Login extends OrangeHRM_BaseSetup{

	OrangeHRM_SignInPage signIn;
	OrangeHRM_BasePage basePage;
	OrangeHRM_BaseSetup baseSetup;
	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		basePage = new OrangeHRM_BasePage(driver);
	}

	@Test(description = "validateLogo() method call for logo verification", priority = 3)
	public void logoVerifyTest() throws Exception {
		test = extent.createTest("Test Case 1", "Verify Logo image after login");
		signIn = basePage.GoToHomePageAndSignIn("admin", "admin123");
		Thread.sleep(3000);
		signIn.validateLogo();
	}

	@Test(dataProvider = "Login", dataProviderClass = OrangeHRM_TestData.class, description = "verifySignInPageURL() method call for URL verification", priority = 1)
	public void VerifyLoginurlTest(String userName, String passWord) throws Exception {
		test = extent.createTest("Test Case 2", "Verify Login Page URL");
		signIn = basePage.GoToHomePageAndSignIn(userName, passWord);
		Thread.sleep(3000);
		signIn.verifySignInPageURL();
		basePage.logout();
	}

	@Test(dataProvider = "Login", dataProviderClass = OrangeHRM_TestData.class, description = "verifySignInPageText() method call for Tab verification", priority = 2)
	public void VerifyLogintextTest(String userName, String passWord) throws Exception {
		test = extent.createTest("Test Case 3", "Verify Login Page tab's text");
		signIn = basePage.GoToHomePageAndSignIn(userName, passWord);
		Thread.sleep(3000);
		signIn.verifySignInPageText();
		basePage.logout();
	}

}
