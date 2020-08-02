package com.hrms.steps;

import hrms.utils.DBUtils;
import io.cucumber.java.en.When;

public class DBSteps {
	
	@When("get data from db")
	public void get_data_from_db() {
	  String sqlQuery = "select emp_firstname from hs_hr_employees where employee_id = 14688";
	  DBUtils.storeDataFromDB(sqlQuery);
	}
}
