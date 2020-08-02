package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet1"); //accessing to sheet
		
		Row row1 = sheet.getRow(0); //accessing to row
		
		Cell cell = row1.getCell(1); //accessing to cell №2
		
		String r1cell2 = cell.toString();
		System.out.println(r1cell2);
		
		//how to get New York
		Row row3 = sheet.getRow(2);
		Cell r3c3 = row3.getCell(2);
		
		//access VA
		String cellValue = sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		//to retrieve value based on type
		double cellv = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);
		
		//how to get 20151 in a String format
		String valC = sheet.getRow(1).getCell(4).toString();
		String[] arr = valC.split("\\.");
		System.out.println(arr[0]);
		
		

	}

}
