package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//drag a file and drop it in the source. Longer way
		//action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		//drag a file and drop it in the source. Short way
		action.dragAndDrop(drag, drop).perform();		
		Thread.sleep(5000);
		driver.quit();
	}

}
