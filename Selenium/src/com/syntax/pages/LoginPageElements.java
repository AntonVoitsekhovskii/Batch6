package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class LoginPageElements extends CommonMethods{

	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(id = "txtPassword")
	public WebElement password;
	
	@FindBy(id = "btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='divLogo']/img")
	public WebElement logo;
	
	@FindBy(id = "spanMessage")
	public WebElement errorMessage;
	
	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void login(String uid, String pwd) {
		sendText(username, uid);
		
	}
	
	
}
