package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		    //to read the file:
		//1. we need to have file:
		String filePath = "/Users/stevenmckillip/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		//2. bring object of FileInputStream
		FileInputStream fileInput = new FileInputStream(filePath);
		
		//3. to handle data from .properties file we need Properties Class
		Properties prop = new Properties();
		prop.load(fileInput);
		
		String name = prop.getProperty("name");
		System.out.println(name);
		
		String city = prop.getProperty("city");
		System.out.println(city);
		
		Set<Object> keys = prop.keySet();
		for(Object obj : keys) {
			System.out.println(obj);
		}
		
		

	}

}
