package HomeWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

	public static String url = "http://newtours.demoaut.com/";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String filePath = "/Users/stevenmckillip/eclipse-workspace/Selenium/testdata/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet3");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int colls = sheet.getRow(0).getLastCellNum();
		
		int j = 0;
		for(int i = 1; i < rows; i++) {
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(sheet.getRow(i).getCell(j).toString());
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(sheet.getRow(i).getCell(j+1).toString());
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(sheet.getRow(i).getCell(j+2).toString());
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(sheet.getRow(i).getCell(j+3).toString());
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(sheet.getRow(i).getCell(j+4).toString());
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(sheet.getRow(i).getCell(j+5).toString());
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(sheet.getRow(i).getCell(j+6).toString());
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(sheet.getRow(i).getCell(j+7).toString().substring(0, 5));
		driver.navigate().refresh();
		}//driver.findElement(By.xpath("//input[@name='register']")).click();
		
		
		

	}

}
