package com.syntax.class04;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		
		int count = 0;
		for(WebElement elem : allLinks) {
			String text = elem.getText();
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Number of all links is " + count);
		driver.quit();
	}

}
