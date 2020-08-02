package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement continents = driver.findElement(By.id("continents"));
		
		Select select = new Select(continents);
		
		// By Value
		
		List<WebElement> options = select.getOptions(); // Will return list of all options in the DD
		
		for(WebElement option : options) {
			
			String text = option.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("Africa")) {
				option.click();
				String ddText = option.getText();
				Thread.sleep(2000);
				if(ddText.equals("Africa")) {
					System.out.println("Africa is selected:: " + option.isSelected());
				}
				else {
					System.err.println("Africa is NOT selected");
				}
				//select.selectByVisibleText("Antarctica"); //You can select by Visible test
			}
		}
		boolean isMultipe = select.isMultiple();
		System.out.println("The Continent DD is Multiple:: " + isMultipe);
		
		tearDown();
	}

}
