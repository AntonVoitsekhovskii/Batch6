package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().fullscreen();
		
		driver.navigate().to("https://www.google.com"); // will navigate in the same browser to another url
		
		driver.navigate().back(); // will navigate in the same browser back

		driver.navigate().to("https://www.amazon.com");
		
		driver.navigate().forward(); // will navigate in the same browser forward
		
		driver.navigate().refresh(); // will refresh same web page
		
		driver.close();
	}

}
