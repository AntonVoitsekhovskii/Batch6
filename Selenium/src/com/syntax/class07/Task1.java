package com.syntax.class07;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		boolean isDisplayed = driver.findElement(By.id("message")).isDisplayed();
		System.out.println("Text It's back is displayed: " + isDisplayed);

	}

}
