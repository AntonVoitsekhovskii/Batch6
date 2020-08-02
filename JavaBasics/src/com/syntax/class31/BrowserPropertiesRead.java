package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserPropertiesRead {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/stevenmckillip/eclipse-workspace/JavaBasics/configs/Browser.properties";
		System.out.println(filePath);
		String userDirect = System.getProperty("user.dir");
		System.out.println(userDirect);
		
		String filePath1 = System.getProperty("user.dir") + "/configs/Browser.properties";
		System.out.println(filePath1);
		
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("os.name"));
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
		
	}
}
