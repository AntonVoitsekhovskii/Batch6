package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

	}

}
