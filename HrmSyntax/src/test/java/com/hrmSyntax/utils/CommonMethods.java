package com.hrmSyntax.utils;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.hrmSyntax.testbase.BaseClass;

public class CommonMethods extends BaseClass{

	/********************************************************************************************
	 * 
	 * Method that send keys to WebElement
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	//*******************************************************************************************
	
	public static void radioAndcheckBox(List<WebElement> radioCheck, String value) {
		String actualValue;
		for(WebElement element : radioCheck) {
			actualValue = element.getAttribute("value").trim();
			if(element.isEnabled() && actualValue.equals(value)) {
				element.click();
				break;
			}
		}
	}
	
	//*******************************************************************************************
	
	
}
