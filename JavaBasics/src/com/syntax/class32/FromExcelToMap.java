package com.syntax.class32;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
			
			String filePath = "/Users/stevenmckillip/eclipse-workspace/JavaBasics/testdata/Test.xlsx";
			FileInputStream fis = new FileInputStream(filePath);
			
			Workbook book = new XSSFWorkbook(fis);
			
			Sheet sheet = book.getSheet("Sheet1");
			
			int rows = sheet.getPhysicalNumberOfRows();
			int cols = sheet.getRow(0).getLastCellNum();
			
			List<Map<String, String>> listMap = new ArrayList<>();
			
			for(int r = 1; r < rows; r++) {	
				Map<String, String> map = new LinkedHashMap<>();
				for(int c = 0; c < cols; c++) {
					String key = sheet.getRow(0).getCell(c).toString();
					String value = sheet.getRow(r).getCell(c).toString();
					map.put(key, value);
				}
				listMap.add(map);
			}
			
			System.out.println(listMap);
			
			
	}

}
