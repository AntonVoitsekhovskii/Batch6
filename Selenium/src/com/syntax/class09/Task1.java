package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		String month = driver.findElement(By.xpath("//span[(text()='May')]")).getText();
		
		while(!month.contains("July")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			month = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div")).getText();
		}
		
		List<WebElement> departCells = driver.findElements(By.xpath("//div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
		for(WebElement departCell : departCells) {
			String departText = departCell.getText();
			if(departText.contains("14")) {
				departCell.click();
				break;
			}
		}
		
		driver.findElement(By.id("aa-returningFrom")).click();
		String monthReturn = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		while(!monthReturn.contains("November")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			monthReturn = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div")).getText();
		}
		
		List<WebElement> departCellsReturn = driver.findElements(By.xpath("//div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
		for(WebElement departCellReturn : departCellsReturn) {
			String departTextReturn = departCellReturn.getText();
			if(departTextReturn.contains("8")) {
				departCellReturn.click();
				break;
			}
		}

}
}