package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class Task extends CommonMethods {

	public void openAndNavigate() throws InterruptedException {
		setUp();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void quiteBrowser() {
		tearDown();
	}
	
	@Test
	public void logoAndWelcomeValidation(){
		//LoginPageElements login = new LoginPageElements();
	}
	
	@Test
	public void validLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));		
		click(driver.findElement(By.id("btnLogin")));
		WebElement welcome = driver.findElement(By.id("welcome"));
		boolean isDisplayed = welcome.isDisplayed();
		if(isDisplayed) {
			System.out.println("validLogin Test Passed");
		}
		else {
			System.out.println("validLogin Test Failed");
		}
	}
	
}
