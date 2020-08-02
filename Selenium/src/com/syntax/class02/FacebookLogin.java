package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("antonvoyts@yahoo.com"); // find element by ID and send key "syntaxtest@yahoo.com"
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.id("u_0_b")).click(); // find element by ID and click on it
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgot Pass")).click(); // can use partial link text if it is real long

	}

}
