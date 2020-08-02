package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = BaseClass.setUp();
		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList'] "));
		Actions action = new Actions(driver);
		action.moveToElement(account).perform();
		
		WebElement element = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		action.contextClick(element).perform();
		

		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		//action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();
		
		Thread.sleep(5000);
		BaseClass.tearDown();
		
	}

}
