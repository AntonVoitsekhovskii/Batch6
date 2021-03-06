package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

		public static String url = "https://demoqa.com/automation-practice-form/";
	
		public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		System.out.println(maleRadioB.isDisplayed()); //true
		System.out.println(maleRadioB.isEnabled()); //true
		System.out.println(maleRadioB.isSelected()); //false
		
		System.out.println("**********************");
		
		//first way to click on a Radio Button
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected()); //true
		
		//second way to click on group of Radio Buttons
		List<WebElement> proList = driver.findElements(By.xpath("//input[@name='profession']"));
		
		int listSize = proList.size();
		System.out.println(listSize);
		
		String valueToBeSelected = "Manual Tester";
		for(WebElement profession : proList) {
			
			if(profession.isEnabled()) { // Checking if the check box is enabled
				String value = profession.getAttribute("value"); // get value of "value" attribute
				
				System.out.println(value);
				
				if(value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
			}
		}
		
	
	
	
	
	
	
	
	}
}
