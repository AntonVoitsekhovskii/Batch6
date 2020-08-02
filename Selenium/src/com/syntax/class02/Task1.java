package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Anton");
		
		driver.findElement(By.name("lastName")).sendKeys("Voyts");
		
		driver.findElement(By.name("phone")).sendKeys("12345678");
		
		driver.findElement(By.name("userName")).sendKeys("Anton");
		
		driver.findElement(By.name("address1")).sendKeys("290 Quentin Rd");
		
		driver.findElement(By.name("address2")).sendKeys("--------");
		
		driver.findElement(By.name("city")).sendKeys("Brooklyn");
		
		driver.findElement(By.name("state")).sendKeys("NY");
		
		driver.findElement(By.name("postalCode")).sendKeys("11223");
		
		driver.findElement(By.name("register")).click();
		
		
		
		

	}

}
