package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {

		public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		public static String password = "test";
		public static String userNam = "Tester";
		
	
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement userName = driver.findElement(By.xpath("//input[contains(@id, 'user')]"));
			
			userName.sendKeys(userNam);
			//Thread.sleep(3000);
			
			
			WebElement pass = driver.findElement(By.cssSelector("input[id$='password']"));
			pass.clear();
			pass.sendKeys(password);
			WebElement loginBtn = driver.findElement(By.cssSelector("input[id$='button']"));
			loginBtn.click();
			boolean logoIsDisplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
			
			if(logoIsDisplayed) {
				System.out.println("Logo is Displayed, Test Case passed");
			}
			else {
				System.out.println("Logo is NOT Displayed, Test Case failed");
			}
			
			WebElement loginInfo = driver.findElement(By.xpath("//div[@class='login_info']"));
			String text = loginInfo.getText();
			
			if(text.contains("Tester")) {
				System.out.println("User Succesfully logged in, Test Case Passed");
			}
			else {
				System.out.println("User is NOT logged in, Test Case Faild");
			}
			
			
			
			
			

	}

}
