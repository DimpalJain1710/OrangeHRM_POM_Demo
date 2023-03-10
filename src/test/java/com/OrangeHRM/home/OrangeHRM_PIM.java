package com.OrangeHRM.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PIM {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pimObject;

	@FindBy(xpath = "//a[normalize-space()='Add Employee']")
	WebElement addEmployee;

	@FindBy(name = "firstName")
	WebElement Addfirstname;

	@FindBy(name = "lastName")
	WebElement AddlastName;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement checkLogincheckBox;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement btnSaveLoginDetails;

	@FindBy(xpath = "//label[normalize-space()='Username']//parent::div/following-sibling::div/input")
	WebElement userName;

	@FindBy(xpath = "//label[normalize-space()='Password']//parent::div/following-sibling::div/input")
	WebElement userPassword;

	@FindBy(xpath = "//label[normalize-space()='Confirm Password']//parent::div/following-sibling::div/input")
	WebElement rePassword;

	@FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
	WebElement btnDialogDelete;

	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	WebElement btnDelete;

	public OrangeHRM_PIM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private void addEmployeeOption(String firstName, String lastName, String userName, String userPass, String rePass)
			throws InterruptedException {

		Addfirstname.sendKeys(firstName);
		Thread.sleep(1000);
		AddlastName.sendKeys(lastName);
		Thread.sleep(1000);
		checkLogincheckBox.click();
		Thread.sleep(1000);
		this.userName.sendKeys(userName);
		Thread.sleep(1000);
		this.userPassword.sendKeys(userPass);
		this.rePassword.sendKeys(rePass);
		Thread.sleep(1000);
		btnSaveLoginDetails.click();
		Thread.sleep(5000);
	}

	private void addEmpHead() throws InterruptedException {

		Thread.sleep(1000);
		pimObject.click();
		Thread.sleep(1000);
		addEmployee.click();
		Thread.sleep(1000);

	}

	public void addEmployees(String strFirstName, String strLastName, String strUserName, String strPassword, String strRePassword)
			throws InterruptedException {
		addEmpHead();
		Thread.sleep(1000);
		addEmployeeOption(strFirstName, strLastName, strUserName, strPassword, strRePassword);
	}

	private void deleteEmpOption(String _empName) throws InterruptedException {
		Thread.sleep(1000);
		pimObject.click();
		Thread.sleep(1000);
			//List<WebElement> rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td/a"));
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div//button[1]"));
			int rows_lenght = rows.size()/3;
			System.out.println(rows_lenght);
		String beforeXpath = "//div[@class='oxd-table-body']/div[";
		String afterXpath = "][@class='oxd-table-card']//div[4]";
		for (int i = 1; i < rows_lenght; i++) {
			String searchPath = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			if (searchPath.contains(_empName)) {
				if (!driver.findElement(By.xpath(beforeXpath + i + "]//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).isSelected()) {
					driver.findElement(By.xpath(beforeXpath + i + "]//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
				}
			}
		}
		Thread.sleep(1000);
		btnDelete.click();
		Thread.sleep(1000);
		btnDialogDelete.click();
		Thread.sleep(1000);

	}

	public void deleteEmployees(String strLastName) throws InterruptedException {
		deleteEmpOption(strLastName);
		Thread.sleep(1000);
	}

}
