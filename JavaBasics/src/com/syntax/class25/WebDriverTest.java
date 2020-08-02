package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver browser = new ChromeDriver();
		browser.openBrowser();
		browser.closeBrowser();
		browser.maximizeWindow();
		browser.findElement();
		
		System.out.println("===============================");
		
		WebDriver browser2 = new FirefoxDriver();
		browser2.openBrowser();
		browser2.closeBrowser();
		browser2.maximizeWindow();
		browser2.findElement();

	}

}
