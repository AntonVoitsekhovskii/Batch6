package com.syntax.class03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		String filePath = "/Users/stevenmckillip/eclipse-workspace/Selenium/configs/Task1Prop.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
			
		driver.findElement(By.id("u_0_m")).sendKeys(prop.getProperty("fName"));
		
		driver.findElement(By.id("u_0_o")).sendKeys(prop.getProperty("lName"));
		
		driver.findElement(By.id("u_0_r")).sendKeys(prop.getProperty("mobile"));
		
		driver.findElement(By.id("u_0_13")).click();
		
		
	}

}
