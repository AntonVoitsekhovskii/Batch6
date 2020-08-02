package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:driver_type:hostname:port/db_name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void abc() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
		rs.next();
		String firstName = rs.getString("emp_firstname");
		System.out.println(firstName);
		rs.next();
		String firstName2 = rs.getObject("emp_firstname").toString();
		System.out.println(firstName2);

		String allData;
		while (rs.next()) {
			allData = rs.getObject("emp_firstname").toString();
			System.out.println(allData);
		}
		rs.close();
		st.close();
		conn.close();
		System.out.println("======================================");
	}
	

	// retrieve all the job titles and store them in arraylist and show it in
	// console from arraylist
	@Test
	public void cde() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		List<String> jobTitles = new ArrayList<>();
		while(rs.next()) {
			jobTitles.add(rs.getObject("job_title").toString());
		}
		
		for(String jt : jobTitles) {
			System.out.println(jt);
		}
	}
}
