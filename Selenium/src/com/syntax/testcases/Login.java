package com.syntax.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Login extends CommonMethods{
	
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		intialize();
//	}
//	
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}
	
	@Test
	public void validAdminLogin() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		wait(2);
		
		String expectedUser="Welcome Admin";
		String actualUser=dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is NOT Logged in");
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
		System.out.println("Admin Log in Successful.");
	}
	
	@Test
	public void invalidPasswordLogin() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "svfbgrb");
		click(login.loginBtn);
		
		String expected = "Invalid credentials";		
		Assert.assertEquals(login.errorMessage.getText(), expected, "Error message text is not matched");
	}
	
	@Test
	public void emptyUsernameLogin() {
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		String expected = "Username cannot be empty";	
		Assert.assertEquals(login.errorMessage.getText(), expected, "Error message text is not matched");
	}
	
	

}
