package com.syntax.class25;

interface TakesScreenShot {
	
	void takePicture();
}

public interface WebDriver {

		void openBrowser();
		
		void  closeBrowser();
		
		void maximizeWindow();
		
		void findElement();
}

class ChromeDriver implements WebDriver, TakesScreenShot {

	@Override
	public void openBrowser() {
		System.out.println("We can open Chrome window");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("We can close Chrome window");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can naximaze Chrome window size");
		
	}

	@Override
	public void findElement() {
		System.out.println("We can fin elements in Chrome window");
		
	}
	
	@Override
	public void takePicture() {
		System.out.println("");
	}
	
}

class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open web site");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox can close web site");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can maximize window of web site");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox can find elements of web site");
		
	}
	
}
