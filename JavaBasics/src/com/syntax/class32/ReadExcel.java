package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//System.out.println(System.getProperty("user.dir"));
		String filePath = System.getProperty("user.dir") + "/testdata/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		//get an Object of Workbook type
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		//need to find numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();
		//find number of columns
		int colls = sheet.getRow(0).getLastCellNum();
		
		//get data from all rows and all columns
		for(int i = 0; i < rows; i++) {
			for(int c = 0; c < colls; c++) {
				String cellVal = sheet.getRow(i).getCell(c).toString();
				System.out.println(cellVal + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
