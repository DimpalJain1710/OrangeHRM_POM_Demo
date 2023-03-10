package com.OrangeHRM.test;

import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OrangeHRM.common.OrangeHRM_BasePage;
import com.OrangeHRM.common.OrangeHRM_BaseSetup;
import com.OrangeHRM.home.OrangeHRM_PIM;
import com.OrangeHRM.utils.OrangeHRM_TestData;
import com.OrangeHRM.home.OrangeHRM_SignInPage;

public class OrangeHRM_AddEmployee extends OrangeHRM_BaseSetup{

	OrangeHRM_BasePage basePage;
	OrangeHRM_SignInPage signIn;
	OrangeHRM_PIM pim;
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		driver = getDriver();
		basePage = new OrangeHRM_BasePage(driver);
		pim = new OrangeHRM_PIM(driver);
	}

	@AfterClass
	public void LogOut() throws InterruptedException {
		basePage.logout();
		Thread.sleep(1000);
	}
	
	@Test(dataProvider = "Login", dataProviderClass = OrangeHRM_TestData.class, priority = 7)
	public void urlTest(String userName, String passWord) throws Exception {
		test = extent.createTest("Test Case 7", "Sign in");
		signIn = basePage.GoToHomePageAndSignIn(userName, passWord);
		Thread.sleep(3000);
		signIn.verifySignInPageURL();
	}
	
	@Test(dataProvider = "addEmployeeExel", dataProviderClass = OrangeHRM_TestData.class, priority = 8)
	public void addEmployeesExel(String strFirstName, String strLastName, String strUserName, String strPassword, String strRePassword) throws InterruptedException, EncryptedDocumentException, IllegalFormatException, IOException {
		test = extent.createTest("Test Case 8", "Add Employees from Exel");
	    pim.addEmployees(strFirstName, strLastName, strUserName, strPassword,strRePassword);
	    Thread.sleep(1000);
	}
	
	@Test(dataProvider = "addEmployeeExel", dataProviderClass = OrangeHRM_TestData.class, priority = 9)
	public void deleteEmployeesExel(String strFirstName, String strLastName, String strUserName, String strPassword, String strRePassword) throws InterruptedException, EncryptedDocumentException, IllegalFormatException, IOException {
		test = extent.createTest("Test Case 9", "Delete Employees");
	    pim.deleteEmployees(strLastName);
	    Thread.sleep(1000);
	}
	
	@Test(dataProvider = "addEmployeeDataBase", dataProviderClass = OrangeHRM_TestData.class, priority = 10)
	public void addEmployeesDataBase(String strFirstName, String strLastName, String strUserName, String strPassword,String strRePassword) throws InterruptedException, EncryptedDocumentException, IllegalFormatException, IOException {
		test = extent.createTest("Test Case 10", "Add Employees from Data Base");
		pim.addEmployees(strFirstName, strLastName, strUserName, strPassword,strRePassword);
	    Thread.sleep(1000);
	}
	
	@Test(dataProvider = "addEmployeeDataBase", dataProviderClass = OrangeHRM_TestData.class, priority = 11)
	public void deleteEmployeesDataBase(String strFirstName, String strLastName, String strUserName, String strPassword,String strRePassword) throws InterruptedException, EncryptedDocumentException, IllegalFormatException, IOException {
		test = extent.createTest("Test Case 11", "Delete Employees");
	    pim.deleteEmployees(strLastName);
	    Thread.sleep(1000);
	}

}
