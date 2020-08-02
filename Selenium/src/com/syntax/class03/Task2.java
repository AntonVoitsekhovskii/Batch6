package com.syntax.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		if(driver.getCurrentUrl().contains("zillow")) {
			System.out.println("This URL contains Zillow");
		}
		else {
			System.out.println("Error, you got wrong URL");
		}

	}

}
