package com.OrangeHRM.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_SignInPage {

private WebDriver driver;
	
	@FindBy(xpath = "//span[normalize-space()='PIM']")
	WebElement lnPIM;
	
	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement divLogo_img;

	public OrangeHRM_SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {
		divLogo_img.isDisplayed();
		return true;
	}
	
	public boolean verifySignInPageURL() {
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		return pageURL.contains(expectedPageURL);
	}

	public boolean verifySignInPageText() {
		String pageText = lnPIM.getText();
		String expectedPageText = "PIM";
		return pageText.contains(expectedPageText);
	}
	
	public boolean verifyTitleOfPage() {
		String pageTitle = driver.getTitle();
		String expectedPageTitle = "OrangeHRM";
		return pageTitle.contains(expectedPageTitle);
	}

}
