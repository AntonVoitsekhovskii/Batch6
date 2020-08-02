package com.syntax.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		LoginPage login = new LoginPage();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		boolean flag = login.logo.isDisplayed();
		
		if(flag) {
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("Logo is NOT displayed");
		}
		
		wait(5);
		
		tearDown();
		

	}

}
