package com.hrms.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class TitleLogoAndloginValidation extends CommonMethods{

	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void quiteBrowser() {
		tearDown();
	}
	
	@Test
	public void titleValidation() throws InterruptedException {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("titleValidation Test Passed");
		}
		else {
			System.out.println("titleValidation Test Failed");
		}
		Thread.sleep(2000);
	}
	
	@Test
	public void logoValidation() throws InterruptedException {
		String logoPath = "//div[@id='divLogo']/img";
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		boolean isDisplayed = logo.isDisplayed();
		if(isDisplayed) {
			System.out.println("logoValidation Test Passed");
		}
		else {
			System.out.println("logoValidation Test Failed");
		}
		Thread.sleep(2000);
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
	
	@Test
	public void negativeLogin() {
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		click(driver.findElement(By.id("btnLogin")));
		WebElement warning = driver.findElement(By.id("spanMessage"));
		boolean isDisplayed = warning.isDisplayed();
		if(isDisplayed) {
			System.out.println("negativeLogin Test Passed");
		}
		else {
			System.out.println("negativeLogin Test Failed");
		}
	}
	
}
