package com.hrmSyntax.methodTesting;

import java.util.List;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrmSyntax.testbase.BaseClass;
import com.hrmSyntax.utils.CommonMethods;

public class Testing extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		List<WebElement> sex = driver.findElements(By.xpath("//input[@name='sex']"));
		radioAndcheckBox(sex, "2");

	}

}
