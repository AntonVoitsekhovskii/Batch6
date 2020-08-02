package com.hrmSyntax.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrmSyntax.utils.Configsreader;
import com.hrmSyntax.utils.Constants;

public class BaseClass {

	public static WebDriver driver;
	
	public static void setUp() {
		
		Configsreader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		switch(Configsreader.getProperties("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_FRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default: 
			throw new RuntimeException("Browser ERROR");
		}
		
		driver.get(Configsreader.getProperties("url"));
	}
	
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}
