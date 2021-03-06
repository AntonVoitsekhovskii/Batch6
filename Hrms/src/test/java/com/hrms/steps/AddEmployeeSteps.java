package com.hrms.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import hrms.utils.CommonMethods;
import hrms.utils.Constants;
import hrms.utils.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods{

	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}
	//this method has hardcoded values
	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {
		sendText(addEmp.firstName, "James");
		sendText(addEmp.lastName, "Smith");
	}
	//this method is enhance method and parameter 
	@When("user enters employees {string} and {string}")
	public void user_enters_employees_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
	}
	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmp.saveBtn);
	}
	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		String actual = pdetails.profilePic.getText();
		String expected = "Atacan Ata";
		Assert.assertEquals(expected, actual);
	}
	@Then("{string} is added successfully")
	public void employee_is_added_successfully(String expectedName) {
		String actual = pdetails.profilePic.getText();
		Assert.assertEquals(expectedName, actual);
	}
	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.employeeId.clear();
	}
	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		click(addEmp.checkboxLoginDetails);
	}
	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		addEmp.createEmpLoginCR();
	}
	@When("user enter employee {string}, {string} and {string}")
	public void user_enter_employee_and(String fName, String mName, String lName) {
	    sendText(addEmp.firstName, fName);
	    sendText(addEmp.middleName, mName);
	    sendText(addEmp.lastName, lName);
	    
	}

	@Then("{string}, {string} and {string} is added successfully")
	public void and_is_added_successfully(String string, String string2, String string3) {
	    
	}
	
	@When("user enters employee details and click on save then employee is added")
	public void user_enters_employee_details_and_click_on_save_then_employee_is_added(DataTable dataTable) {
	    List<Map<String, String>> addEmployeeList = dataTable.asMaps();
	    
	    for(Map<String, String> map : addEmployeeList) {
	    	
	    	String fname = map.get("Firstname");
	    	String mname = map.get("Midlename");
	    	String lname = map.get("Lastname");
	    	
	    	sendText(addEmp.firstName, fname);
	    	sendText(addEmp.middleName, mname);
	    	sendText(addEmp.lastName, lname);
	    	click(addEmp.saveBtn);
	    	//adding assertion
	    	String actual = pdetails.profilePic.getText();
	    	String expected = fname + " " + mname + " " + lname;
	    	Assert.assertEquals("Employee is not added successfully", expected, actual);
	    	jsClick(dashboard.addEmp);
	    }
	}
	
	@Then("employee is added") 
	public void employee_is_added() {
		System.out.println("Employee is added using datatable");		
	}
	
	@When("user enters employee data from {string} excel sheet then employee is added")
	public void user_enters_employee_data_from_excel_sheet_then_employee_is_added(String sheetName) {
	    List<Map<String, String>> excelList = ExcelUtility.excelIntoListOfMaps(Constants.TESTDATA_FILEPATH, sheetName);
	    
	    for(Map<String, String> data:excelList) {
			String fname=data.get("FirstName");
			String mname=data.get("MiddleName");
			String lname=data.get("LastName");
			
			sendText(addEmp.firstName, fname);
			sendText(addEmp.middleName, mname);
			sendText(addEmp.lastName, lname);
			click(addEmp.saveBtn);
			
			
			String actual=pdetails.profilePic.getText();
			String expected=fname+" "+mname+" "+lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			
		}
	}
	
}
