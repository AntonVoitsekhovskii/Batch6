package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static String url = "http://newtours.demoaut.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Anton");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Voitsekhovskii");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("anton@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("290 Quentin Rd");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Brooklyn");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NY");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11223");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		

	}

}
