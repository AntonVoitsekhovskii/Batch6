package com.syntax.class10;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class FileUploadDemo extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		//click on File Upload
		driver.findElement(By.linkText("File Upload")).click();
		
		//click 
		//driver.findElement(By.id("file-upload")).click();
		
		driver.findElement(By.id("file-upload")).sendKeys("⁩/Users/stevenmckillip/Desktop/Screen.png⁩");

	}

}
