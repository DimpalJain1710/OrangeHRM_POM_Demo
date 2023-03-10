package com.OrangeHRM.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_HomePage {
	
	WebDriver driver;

	public OrangeHRM_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminTab;

	@FindBy(xpath = "//span[normalize-space()='User Management']")
	WebElement tbUserManagement;

	@FindBy(xpath = "//a[normalize-space()='Users']")
	WebElement tbSystemUsers;

	@FindBy(xpath = "//span[normalize-space()='Job']")
	WebElement tbJob;

	@FindBy(xpath = "//a[normalize-space()='Job Titles']")
	WebElement tbViewJob;

	@FindBy(xpath = "//a[normalize-space()='Pay Grades']")
	WebElement tbviewPayGrades;

	@FindBy(xpath = "//a[normalize-space()='Employment Status']")
	WebElement tbEmploymentStatus;

	@FindBy(xpath = "//a[normalize-space()='Job Categories']")
	WebElement tbJobCategory;

	@FindBy(xpath = "//a[normalize-space()='Work Shifts']")
	WebElement tbWorkShift;

	@FindBy(xpath = "//span[normalize-space()='Organization']")
	WebElement tbOrganization;

	@FindBy(xpath = "//a[normalize-space()='General Information']")
	WebElement tbGeneralInformation;

	@FindBy(xpath = "//a[normalize-space()='Locations']")
	WebElement tbViewLocations;

	@FindBy(xpath = "//a[normalize-space()='Structure']")
	WebElement tbCompanyStructure;

	@FindBy(xpath = "//span[normalize-space()='Qualifications']")
	WebElement tbQualifications;

	@FindBy(xpath = "//a[normalize-space()='Skills']")
	WebElement tbSkills;

	@FindBy(xpath = "//a[normalize-space()='Education']")
	WebElement tbEducation;

	@FindBy(xpath = "//a[normalize-space()='Licenses']")
	WebElement tbLicenses;

	@FindBy(xpath = "//a[normalize-space()='Languages']")
	WebElement tbLanguages;

	@FindBy(xpath = "//a[normalize-space()='Memberships']")
	WebElement tbMembership;

	@FindBy(xpath = "//a[normalize-space()='Nationalities']")
	WebElement tbNationality;

	@FindBy(xpath = "//span[normalize-space()='Configuration']")
	WebElement tbConfiguration;

	@FindBy(xpath = "//a[normalize-space()='Email Configuration']")
	WebElement tbMailConfiguration;

	@FindBy(xpath = "//a[normalize-space()='Email Subscriptions']")
	WebElement tbEmailNotification;

	@FindBy(xpath = "//a[normalize-space()='Localization']")
	WebElement tbLocalization;

	@FindBy(xpath = "//a[normalize-space()='Language Packages']")
	WebElement tbLanguagePackage;

	@FindBy(xpath = "//a[normalize-space()='Modules']")
	WebElement tbModules;

	@FindBy(id = "menu_admin_openIdProvider")
	WebElement tbOpenIdProvider;

	@FindBy(xpath = "//a[normalize-space()='Register OAuth Client']")
	WebElement tbAuthClient;

	@FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/b")
	WebElement PIMTab;

	@FindBy(id = "menu_pim_Configuration")
	WebElement tbpimConfiguration;

	@FindBy(id = "menu_pim_configurePim")
	WebElement tbConfigurePim;

	@FindBy(id = "menu_pim_listCustomFields")
	WebElement tbListCustomFields;

	@FindBy(id = "menu_admin_pimCsvImport")
	WebElement tbPimCsvImports;

	@FindBy(id = "menu_pim_viewReportingMethods")
	WebElement tbReportingMethods;

	@FindBy(id = "menu_pim_viewTerminationReasons")
	WebElement tbTerminationReasons;

	@FindBy(id = "menu_pim_viewEmployeeList")
	WebElement tbEmployeeList;

	@FindBy(id = "menu_pim_addEmployee")
	WebElement tbAddEmployee;

	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	WebElement tbPredefinedReports;

	@FindBy(xpath = "//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	WebElement LeaveTab;

	@FindBy(id = "menu_leave_applyLeave")
	WebElement tbApplyLeave;

	@FindBy(id = "menu_leave_viewMyLeaveList")
	WebElement tbviewMyLeaveList;

	@FindBy(id = "menu_leave_Entitlements")
	WebElement tbEntitlements;

	@FindBy(id = "menu_leave_addLeaveEntitlement")
	WebElement tbaddLeaveEntitlement;

	@FindBy(id = "menu_leave_viewLeaveEntitlements")
	WebElement tbLeaveEntitlements;

	@FindBy(id = "menu_leave_viewMyLeaveEntitlements")
	WebElement tbviewMyLeaveEntitlements;

	@FindBy(id = "menu_leave_Reports")
	WebElement tbReports;

	@FindBy(id = "menu_leave_viewLeaveBalanceReport")
	WebElement tbBalanceReport;

	@FindBy(id = "menu_leave_viewMyLeaveBalanceReport")
	WebElement tbMyLeaveBalanceReport;

	@FindBy(id = "menu_leave_Configure")
	WebElement tbConfigure;

	@FindBy(id = "menu_leave_defineLeavePeriod")
	WebElement tbdefineLeavePeriod;

	@FindBy(id = "menu_leave_defineLeavePeriod")
	WebElement tbLeavePeriod;

	@FindBy(id = "menu_leave_leaveTypeList")
	WebElement tbleaveTypeList;

	@FindBy(id = "menu_leave_defineWorkWeek")
	WebElement tbdefineWorkWeek;

	@FindBy(id = "menu_leave_viewHolidayList")
	WebElement tbviewHolidayList;

	@FindBy(id = "menu_leave_viewLeaveList")
	WebElement tbviewLeaveList;

	@FindBy(id = "menu_leave_assignLeave")
	WebElement tbassignLeave;

	@FindBy(xpath = "//*[@id=\"menu_time_viewTimeModule\"]/b")
	WebElement TimeTab;

	@FindBy(id = "menu_time_Timesheets")
	WebElement tbTimesheets;

	@FindBy(id = "menu_time_viewMyTimesheet")
	WebElement tbviewMyTimesheet;

	@FindBy(id = "menu_time_viewEmployeeTimesheet")
	WebElement tbviewEmployeeTimesheet;

	@FindBy(id = "menu_attendance_Attendance")
	WebElement tbAttendance;

	@FindBy(id = "menu_attendance_viewMyAttendanceRecord")
	WebElement tbMyAttendanceRecord;

	@FindBy(id = "menu_attendance_punchIn")
	WebElement tbpunchIn;

	@FindBy(id = "menu_attendance_viewAttendanceRecord")
	WebElement tbAttendanceRecord;

	@FindBy(id = "menu_attendance_configure")
	WebElement tbAttendConfigure;

	@FindBy(id = "menu_time_Reports")
	WebElement tbAttendReports;

	@FindBy(id = "menu_time_displayProjectReportCriteria")
	WebElement tbAttendPRCriteria;

	@FindBy(id = "menu_time_displayEmployeeReportCriteria")
	WebElement tbEmpReportCriteria;

	@FindBy(id = "menu_time_displayAttendanceSummaryReportCriteria")
	WebElement tbSumReportCriteria;

	@FindBy(id = "menu_admin_ProjectInfo")
	WebElement tbProjectInfo;

	@FindBy(id = "menu_admin_viewCustomers")
	WebElement tbviewCustomers;

	@FindBy(id = "menu_admin_viewProjects")
	WebElement tbviewProjects;

	@FindBy(xpath = "//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")
	WebElement RecruitmenTab;

	@FindBy(id = "menu_recruitment_viewCandidates")
	WebElement tbViewCandidates;

	@FindBy(id = "menu_recruitment_viewJobVacancy")
	WebElement tbJobVacancy;

	@FindBy(xpath = "//*[@id=\"menu_pim_viewMyDetails\"]/b")
	WebElement DetailsTab;

	@FindBy(xpath = "//*[@id=\"menu__Performance\"]/b")
	WebElement PerformanceTab;

	@FindBy(id = "menu_performance_Configure")
	WebElement tbPerfConfigure;

	@FindBy(id = "menu_performance_searchKpi")
	WebElement tbPerfsearchKpi;

	@FindBy(id = "menu_performance_addPerformanceTracker")
	WebElement tbPerTracker;

	@FindBy(id = "menu_performance_ManageReviews")
	WebElement tbManageReviews;

	@FindBy(id = "menu_performance_searchPerformancReview")
	WebElement tbPerfReview;

	@FindBy(id = "menu_performance_myPerformanceReview")
	WebElement tbMyPerfReview;

	@FindBy(id = "menu_performance_searchEvaluatePerformancReview")
	WebElement tbEvalPerfReview;

	@FindBy(id = "menu_performance_viewMyPerformanceTrackerList")
	WebElement tbPerfTrackerList;

	@FindBy(id = "menu_performance_viewEmployeePerformanceTrackerList")
	WebElement tbEmpPerfTrackerList;

	@FindBy(xpath = "//*[@id=\"menu_dashboard_index\"]/b")
	WebElement dashboardTab;

	@FindBy(xpath = "//*[@id=\"menu_directory_viewDirectory\"]/b")
	WebElement directoryTab;

	@FindBy(xpath = "//*[@id=\"menu_maintenance_purgeEmployee\"]/b")
	WebElement maintenanceTab;

	@FindBy(id = "menu_maintenance_PurgeRecords")
	WebElement tbPurgeRecords;

	@FindBy(linkText = "Employee Records")
	WebElement tbPurgeEmployee;

	@FindBy(id = "menu_maintenance_purgeCandidateData")
	WebElement tbCandidateData;

	@FindBy(id = "menu_maintenance_accessEmployeeData")
	WebElement tbAcEmployeeData;

	@FindBy(xpath = "//*[@id=\"menu_buzz_viewBuzz\"]/b")
	WebElement BuzzTab;

	@FindBy(xpath = ".//*[@id='welcome']")
	WebElement txtWelcome;
	
	@FindBy(xpath = ".//*[@id='aboutDisplayLink']")
	WebElement aboutDisplayLink;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;

	@FindBy(id = "MP_link")
	WebElement MP_link;

	@FindBy(id = "Subscriber_link")
	WebElement Subscriber_link;

	// This method will return object of OrangeHRM_UsersPage class as we are
	// landing on
	// OrangeHRM_UsersPage using this method
	public OrangeHRM_AddUserPage clickOnAdminTab() {
		adminTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_PIM clickOnPIMTab() {
		PIMTab.click();
		return new OrangeHRM_PIM(driver);
	}

	public OrangeHRM_AddUserPage clickOnLeaveTab() {
		LeaveTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnTimeTab() {
		TimeTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnRecruitmenTab() {
		RecruitmenTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnDetailsTab() {
		DetailsTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnPerformanceTab() {
		PerformanceTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnMaintenanceTab() {
		maintenanceTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnDirectoryTab() {
		directoryTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnDashboardTab() {
		dashboardTab.click();
		return new OrangeHRM_AddUserPage();
	}

	public OrangeHRM_AddUserPage clickOnBuzzTab() {
		BuzzTab.click();
		return new OrangeHRM_AddUserPage();
	}

	private void Navigation(WebElement... MenuTabs) throws InterruptedException {
		Actions navigate = new Actions(driver);
		for (int i = 0; i < MenuTabs.length; i++) {
			navigate.moveToElement(MenuTabs[i]).build().perform();
			Thread.sleep(500);
		}
	}

	public void NavigateTohomePage(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		adminTabMenu();
		Thread.sleep(1000);
		pimTabMenu();
		Thread.sleep(1000);
		leaveTabMenu();
		Thread.sleep(1000);
		timeTabMenu();
		Thread.sleep(1000);
		recruitmentTabMenu();
		Thread.sleep(1000);
		detailsTabMenu();
		Thread.sleep(1000);
		performanceTabMenu();
		Thread.sleep(1000);
		dashboardMenuTab();
		Thread.sleep(1000);
		directoryTabMenu();
		Thread.sleep(1000);
		maintanenceTabMenu();
		Thread.sleep(1000);
		buzzTabMenu();
		Thread.sleep(1000);
		highLevelMenuTabs();

	}
	
	private void adminTabMenu() throws InterruptedException {
		if (navigateAdminPage(driver)) {
			System.out.println("Successfully navigated to Admin page");
			Navigation(tbUserManagement, tbSystemUsers, tbJob, tbViewJob, tbviewPayGrades, tbEmploymentStatus,
					tbJobCategory, tbWorkShift, tbOrganization, tbGeneralInformation, tbViewLocations,
					tbCompanyStructure, tbQualifications, tbSkills, tbEducation, tbLicenses,
					tbLanguages, tbMembership, tbNationality, tbConfiguration, tbMailConfiguration, tbEmailNotification,
					tbLocalization, tbLanguagePackage, tbModules, tbOpenIdProvider, tbAuthClient);
		} else {
			System.out.println("ERROR: can not navigate to Admin page");
		}
	}
	
	private void pimTabMenu() throws InterruptedException {
		if (navigatePIMPage(driver)) {
			System.out.println("Successfully navigated to PIM page");
			Navigation(tbpimConfiguration, tbConfigurePim, tbListCustomFields, tbPimCsvImports, tbReportingMethods,
					tbTerminationReasons, tbEmployeeList, tbAddEmployee, tbPredefinedReports);
		} else {
			System.out.println("ERROR: can not navigate to PIM page");
		}
	}

	private void leaveTabMenu() throws InterruptedException {
		if (navigateLeavePage(driver)) {
			System.out.println("Successfully navigated to Leave page");
			Navigation(tbApplyLeave, tbviewMyLeaveList, tbEntitlements, tbaddLeaveEntitlement, tbLeaveEntitlements,
					tbviewMyLeaveEntitlements, tbReports, tbBalanceReport, tbMyLeaveBalanceReport, tbConfigure,
					tbdefineLeavePeriod, tbLeavePeriod, tbleaveTypeList, tbdefineWorkWeek, tbviewHolidayList,
					tbviewLeaveList, tbassignLeave);
		} else {
			System.out.println("ERROR: can not navigate to Leave page");
		}
	}
	
	private void timeTabMenu() throws InterruptedException {
		if (navigateTimePage(driver)) {
			System.out.println("Successfully navigated to Time page");
			Navigation(tbTimesheets, tbviewMyTimesheet, tbviewEmployeeTimesheet, tbAttendance, tbMyAttendanceRecord,
					tbpunchIn, tbAttendanceRecord, tbAttendConfigure, tbAttendReports, tbAttendPRCriteria,
					tbEmpReportCriteria, tbSumReportCriteria, tbProjectInfo, tbProjectInfo, tbviewCustomers,
					tbviewProjects);
		} else {
			System.out.println("ERROR: can not navigate to Time page");
		}
	}
	
	private void recruitmentTabMenu() throws InterruptedException{
		if (navigateRecruitmentPage(driver)) {
			System.out.println("Successfully navigated to Recruitmant page");
			Navigation(tbViewCandidates, tbJobVacancy);
		} else {
			System.out.println("ERROR: can not navigate to Recruitment page");
		}
	}
	
	private void detailsTabMenu() {
		if (navigateDetailsPage(driver)) {
			System.out.println("Successfully navigated to Details page");
		} else {
			System.out.println("ERROR: can not navigate to Details page");
		}
	}
	
	private void performanceTabMenu() throws InterruptedException {
		PerformanceTab.click();
		System.out.println("Successfully navigated to Performance page");
		Navigation(tbPerfConfigure, tbPerfsearchKpi, tbPerTracker, tbManageReviews, tbPerfReview, tbMyPerfReview,
				tbEvalPerfReview, tbPerfTrackerList, tbEmpPerfTrackerList);
	}
	
	private void dashboardMenuTab() {
		if (navigateDashboardPage(driver)) {
			System.out.println("Successfully navigated to Dashboard page");
		} else {
			System.out.println("ERROR: can not navigate to Dashboard page");
		}
	}
	
	private void directoryTabMenu() {
		if (navigateDirectoryPage(driver)) {
			System.out.println("Successfully navigated to Directory page");
		} else {
			System.out.println("ERROR: can not navigate to Directory page");
		}
	}
	
	private void maintanenceTabMenu() throws InterruptedException {
		if (navigateMaintenancePage(driver)) {
			Navigation(tbPurgeRecords, tbPurgeEmployee, tbCandidateData, tbAcEmployeeData);
		} else {
			System.out.println("ERROR: can not navigate to Maintenance page");
		}
	}
	
	private void buzzTabMenu() {
		if (navigateBuzzPage(driver)) {
			System.out.println("Successfully navigated to Buzz page");
		} else {
			System.out.println("ERROR: can not navigate to Buzz page");
		}
	}
	
	private void highLevelMenuTabs() throws InterruptedException {
		Navigation(MP_link, Subscriber_link);
		Thread.sleep(1000);
		txtWelcome.click();
		Navigation(aboutDisplayLink, logout);
		Thread.sleep(1000);
		txtWelcome.click();
		Thread.sleep(1000);
	}
	

	public boolean navigateAdminPage(WebDriver driver) {
		adminTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigatePIMPage(WebDriver driver) {
		PIMTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateLeavePage(WebDriver driver) {
		LeaveTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateTimePage(WebDriver driver) {
		TimeTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateRecruitmentPage(WebDriver driver) {
		RecruitmenTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateDetailsPage(WebDriver driver) {
		DetailsTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateDashboardPage(WebDriver driver) {
		dashboardTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateDirectoryPage(WebDriver driver) {
		directoryTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateMaintenancePage(WebDriver driver) {
		maintenanceTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/maintenance/purgeEmployee";
		return pageURL.contains(expectedPageURL);
	}

	public boolean navigateBuzzPage(WebDriver driver) {
		BuzzTab.click();
		String pageURL = driver.getCurrentUrl();
		String expectedPageURL = "https://opensource-demo.orangehrmlive.com/index.php/buzz/viewBuzz";
		return pageURL.contains(expectedPageURL);
	}

}
