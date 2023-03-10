package com.OrangeHRM.utils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.IllegalFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class OrangeHRM_TestData {

	@DataProvider(name = "Login")
	public Object[][] Login(){
		return new Object[][] {
			{"Admin", "admin123"},
		};
	}
	
	@DataProvider(name = "addUsers")
	public Object[][] dataForAddingUsers() {
		return new Object[][] {
			{"Admin", "Fiona Grace", "grandal", "Enabled", "grandal@123", "grandal@123"},
			{"ESS", "Fiona Grace", "fclarson", "Disabled", "userAdd@1", "userAdd@1"},
			{"ESS", "Fiona Grace", "thuds123", "Enabled", "thuds@@@123", "thuds@@@123"},
		};
	}
	
	@DataProvider(name = "addEmployeeExel") 
	public Object[][] dataForEmployeeFromExel() throws EncryptedDocumentException, IllegalFormatException, IOException {
		OrangeHRM_ExcelParsing excel = new OrangeHRM_ExcelParsing();
		Object[][] testObjArray = excel.getExcelData("Employee.xls", "Employee");
		System.out.println(testObjArray);
		return testObjArray;
	}
	
	@DataProvider(name = "addEmployeeDataBase") 
	public Object[][] dataForEmployeeFromDataBase() throws EncryptedDocumentException, IllegalFormatException, IOException, SQLException, ClassNotFoundException {
		OrangeHRM_DataBase db = new OrangeHRM_DataBase();
		Object[][] testObjArray = db.getDatafromDB();
		System.out.println(testObjArray);
		return testObjArray;
	}
}
