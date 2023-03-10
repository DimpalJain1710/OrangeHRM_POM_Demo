package com.OrangeHRM.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrangeHRM_DataBase {

	private Connection con;

	private void ConnectToDB() throws SQLException, ClassNotFoundException {
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		String dbURL = "jdbc:mysql://localhost:3306/orangehrm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String txtUsername = "root";
		String txtPassword = "root";

		// Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		// Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		con = DriverManager.getConnection(dbURL, txtUsername, txtPassword);

	}

	private void CloseDB() throws SQLException {
		// closing DB Connection
		con.close();
	}

	public Object[][] getDatafromDB() throws SQLException, ClassNotFoundException {
		ConnectToDB();

		// Query to Execute
		String query = "select *  from employeedb;";

		// Query to Counting Rows
		String rows = "select count(*) from orangehrm.employeedb;";
		int rowsCount = 0;

		// Query to Counting Columns
		String columns = "SELECT COUNT(*) FROM INFORMATION_SCHEMA. COLUMNS WHERE table_schema = 'orangehrm' AND table_name = 'employeedb';";
		int columnsCount = 0;

		String[][] arrayExcelData = null;
		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery(query);

		Statement stmt_rowsCount = con.createStatement();
		ResultSet rowsCountQeery = stmt_rowsCount.executeQuery(rows);
		rowsCountQeery.next();
		rowsCount = ((Number) rowsCountQeery.getObject(1)).intValue();

		Statement stmt_columnCount = con.createStatement();
		ResultSet columnsCountQeery = stmt_columnCount.executeQuery(columns);
		columnsCountQeery.next();
		columnsCount = ((Number) columnsCountQeery.getObject(1)).intValue();

		// While Loop to iterate through all data and print results
		arrayExcelData = new String[rowsCount][columnsCount];
		int i = 0;
		while (rs.next()) {
			for (int j = 0; j < columnsCount; j++) {
				arrayExcelData[i][j] = rs.getString(j + 1);
			}
			i++;
		}

		CloseDB();
		return arrayExcelData;

	}

}
