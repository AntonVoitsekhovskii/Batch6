package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

		public static String url = "http://newtours.demoaut.com/";
	
		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("a[href*='mercuryregister']")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Anton");
		

	}

}
