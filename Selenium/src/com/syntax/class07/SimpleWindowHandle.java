package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://accounts.google.com");
		
		String singUpTitle = driver.getTitle();
		System.out.println("Main Page Title is: " + singUpTitle);
		
		driver.findElement(By.linkText("Help")).click();
		//How to get window handle?
		//We have two methods.
		//1. getWindowHandle();
		//2. getWindowHandles();
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();// Returns set of String IDs of all windows currently opened by the current instance 
		System.out.println("Number of windows are: " + allWindowHandles.size());
		Iterator<String> it = allWindowHandles.iterator();
		String mainWindowHandle = it.next();
		System.out.println("Id of Main window: " + mainWindowHandle);
		String childWindowHandle = it.next();
		System.out.println("Id of Child window: " + childWindowHandle);
		
		driver.switchTo().window(childWindowHandle);
		String childWindowTitle = driver.getTitle();
		System.out.println("Child Page Title is: " + childWindowTitle);
		driver.close();// will close only the focused window (if open only one window - will close browser)
		

	}

}
