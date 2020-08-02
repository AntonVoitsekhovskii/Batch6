package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.redfin.com/";
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println(driver.getCurrentUrl());
		}
		else {
			System.out.println("Wrong URL!!!");
		}
		driver.close();
	}

}
