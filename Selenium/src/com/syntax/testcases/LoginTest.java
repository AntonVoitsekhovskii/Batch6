package com.syntax.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		/**
		 * User should be able to login the application with valid credentials
		 */
		
		setUp();
		WebElement userName = driver.findElement(By.id("email"));
		sendText(userName, ConfigsReader.getProperty("username"));
		
		//sending password
		WebElement password = driver.findElement(By.id("pass"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		//click on login
		
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='sex']"));
		clickRadioOrCheckbox(list, "-1");
		
		selectDdValue(driver.findElement(By.id("month")), "Jun");
		selectDdValue(driver.findElement(By.id("day")), "2");
		selectDdValue(driver.findElement(By.id("year")), 33);
		
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		switchToWindow();
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		//close browser
		//tearDown();
		
		
	}

}
