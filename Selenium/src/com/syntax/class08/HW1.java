package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class HW1 extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expValue = "Susan McLaren";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		//for(int i = 1; i < rows.size(); i++) {
			//String text = rows.get(i - 1).getText();
			if(rows.contains(expValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th[13]")).click();
			//}
		}
	}

}
