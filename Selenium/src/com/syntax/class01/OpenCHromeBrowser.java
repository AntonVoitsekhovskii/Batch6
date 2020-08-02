package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenCHromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2"); // making connection to the  chrome driver
		WebDriver driver = new ChromeDriver(); // go ahead open chrome browser
		
		driver.get("https://www.facebook.com/");
		String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://www.facebook.com/";
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title = driver.getTitle();
			System.out.println(title);
		}
		else {
			System.out.println("Wrong Url");
		}
		
		//Thread.sleep(2000); // will leave browser for 2 sec than close it
		
		driver.close(); //close browser
		
	//	 System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
	//	WebDriver driver2 = new FirefoxDriver(); 
		
		
	//	driver2.get("https://syntaxtechs.com"); // will navigate to web site by link
		
		
		
	}

}
