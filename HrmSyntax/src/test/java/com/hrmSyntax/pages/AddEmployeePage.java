package com.hrmSyntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage {

	@FindBy(id = "firstName")
	public WebElement fName; 
	
	@FindBy(id = "lastName")
	public WebElement lName; 
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn; 
}
