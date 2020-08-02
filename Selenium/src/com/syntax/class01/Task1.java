package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("Wrong Title!!!");
		}
		
		

	}

}
