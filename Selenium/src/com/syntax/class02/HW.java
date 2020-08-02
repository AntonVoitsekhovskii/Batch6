package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/configs/HW.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		//WebDriver driver;
		
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
	
		
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.id("u_0_b")).click();
	}

}
