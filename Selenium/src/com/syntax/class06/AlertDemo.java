package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//Handling simple alert/PopUps
		Alert simpleAlert = driver.switchTo().alert();
		String simpleText = simpleAlert.getText();
		System.out.println("This is simple alert text: " + simpleText);
		Thread.sleep(1000);
		simpleAlert.accept();
		
		//Handling confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmAText = confirmAlert.getText();
		System.out.println("This is confirm alert: " + confirmAText);
		Thread.sleep(1000);
		confirmAlert.accept();
		Thread.sleep(1000);
		
		//Handling Prompt alerts/confirmation alerts by providing some confirmation message
		String name = "Anton";
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("This is prompt alert: " + promptAlert.getText());
		promptAlert.sendKeys(name);
		Thread.sleep(1000);
		promptAlert.accept();
		String text = driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		
		if(text.contains(name)) {
			System.out.println("Text " + name + " was succesfully added");
		}
		else {
			System.err.println("Text " + name + " was NOT entered");
		}
		
		
		BaseClass.tearDown();
		
		
		
		
		

	}

}
