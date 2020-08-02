package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import hrms.utils.CommonMethods;
import hrms.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeSearchSteps extends CommonMethods{
	
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	  click(login.loginBtn);
	}
	
	

	@Given("user navigates to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String empId) {
		sendText(viewEmp.empID, empId);
	}

	@When("clicks search button")
	public void click_on_search_button() {
		jsClick(viewEmp.searchBtn);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		String expected = "Gustavo J";
		for(WebElement e :viewEmp.empList) {
			String actual = e.toString();
			Assert.assertEquals("Employee was not found", expected, actual);
		}
		
		//System.out.println("Employee is displayed");
	}

	@When("user enters valid employee {string} and {string}")
	public void user_enters_valid_employee_name_and_last_name() {
		sendText(viewEmp.empID, "Gustavo J");
	}
	
	@Then("verify table is displayed")
	public void verify_table_is_displayed() {
	   Assert.assertEquals(true, viewEmp.isTableDisplayed());
	}

	@Then("get first name from table")
	public void get_first_name_from_table() {
	    System.out.println(viewEmp.getFirstNameFromTable());
	}
	
	//@Then("verify first name from ui against db")
	//public void verify_first_name_from_ui_against_db() {
	//    Assert.assertEquals(DBSteps, )
	//}

}
