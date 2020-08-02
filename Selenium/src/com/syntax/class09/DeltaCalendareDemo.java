package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DeltaCalendareDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		while(!month.equals("July")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(3000);
			month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		List<WebElement> date = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
		for(WebElement cellDate : date) {
			String day = cellDate.getText();
			if(day.equals("14")) {
				cellDate.click();
				break;
			}
		}
	}
}
