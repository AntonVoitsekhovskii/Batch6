package com.syntax.class04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HW {

	@Test(dataProvider = "getData")
	public void test(String firstName, String lastName, String userName, String password) {
		
	}
	
	
	@DataProvider(name = "userData")
	public Object[][] getData() {
		Object[][] data = {
//				{"John", "Smith", "John@123", "AmirKhan@123"}, 
//				{"Raj", "Capoor", "raj1233", "AmirKhan@123"},
//				{"Mary", "Ann", "mary1233", "AmirKhan@123"},
				{"Rohani", "Sakhi", "rohani1233", "AmirKhan@123"}
		};
		return data;
	}
}
