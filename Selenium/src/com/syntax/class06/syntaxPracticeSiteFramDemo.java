package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;


public class syntaxPracticeSiteFramDemo {

	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.setUp();
		
		driver.switchTo().frame("FrameOne");
		boolean logoIsDisplayed = driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("Logo inside this frame One is displayed: " + logoIsDisplayed);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean buttonIsEnable = driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Button inside this frame Two is displayed: " + buttonIsEnable);
	}

}
