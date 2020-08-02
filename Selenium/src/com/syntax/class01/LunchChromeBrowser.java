package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String url = driver.getCurrentUrl(); 
		System.out.println(url);
		
		driver.getTitle();// returns web site title is String
		System.out.println(driver.getTitle());
		
	}

}
