package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement monthDD = driver.findElement(By.id("month"));
		
		Select select1 = new Select(monthDD);
		
		List<WebElement> options = select1.getOptions();
		
		int i = 0;
		for(WebElement option : options) {
		i++;
		//String text = option.getText();
		//System.out.println(text);
		
		}
		System.out.println("Number of months is " + (i - 1));
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select select2 = new Select(dayDD);
		
		List<WebElement> options2 = select2.getOptions();
		int j = 0;
		for(int k = 1; k < options2.size(); k++) {
			j++;
		}
		System.out.println("Number of the days are " + j);
	}

}
