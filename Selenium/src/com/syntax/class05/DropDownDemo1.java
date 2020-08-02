package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.setUp();
		
		WebElement weekDD = driver.findElement(By.id("select-demo"));
		
		Select select = new Select(weekDD);
		
		 //Selenium provides three different ways to select a value from a DD.
		 
		//1 By Index
		
		List<WebElement> options = select.getOptions();
		System.out.println("Number of Operations in the DD:: " + options.size());
		
		select.selectByIndex(3);
		for(int i = 1; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		//2 By Visible Text(String str)
		select.selectByVisibleText("Friday");
		
		Thread.sleep(1000);
		tearDown();
		
		//3 By Value
	}

}
