package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp(); //please uncomment uitestpractice.com
		String text = driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		//By Index
		driver.switchTo().frame(0);
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Anton");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//By Name or ID
		driver.switchTo().frame("iframe_a");
		name.clear();
		name.sendKeys("Paul");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		//By WebElement
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Max");
		
		
		Thread.sleep(2000);
		tearDown();

	}

}
