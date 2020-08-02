package com.hrms.steps;

import org.junit.Assert;

import hrms.utils.CommonMethods;
import hrms.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("user_is_navigated_to_HRMS")
	public void user_is_navigated_to_HRMS() {
	  setUp();
	}

//	@Given("user is logged with valid admin credentials")
//	public void user_is_logged_with_valid_admin_credentials() {
//	  sendText(login.username, ConfigsReader.getProperty("username"));
//	  sendText(login.password, ConfigsReader.getProperty("password"));
//	  click(login.loginBtn);
//	}

	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	  click(login.loginBtn);
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		String expected = "Welcome Admin";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
	}

	@When("user enter {string} username and {string} password")
	public void user_enter_username_and_password(String user, String pass) {
		sendText(login.username, user);
		sendText(login.password, pass);
	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String expected = "Welcome Anton";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome message is not displayed or not correct", actual, expected);
		System.out.println(actual);

	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax");
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_Invalid_Credentials_text_on_login_page() {
	    String expected = "Invalid credentials";
	    String actual = login.errorMsg.getText();
	    System.out.println(actual);
	    Assert.assertEquals(actual, expected);
	}
	
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String userName, String passWord) {
	    sendText(login.username, userName);
	    sendText(login.password, passWord);
	}

	@Then("{string} is succesfully logged in")
	public void is_succesfully_logged_in(String firstName) {
		String expected = "Welcome " + firstName;
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome message is not displayed or not correct", actual, expected);
		System.out.println(actual); 
	}
}