package com.syntax.utils;

import com.syntax.pages.AddEmployeePageElements;
import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPageElements;
import com.syntax.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static DashboardPage dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements pdetails;
	
	
	public static void intialize() {
		
		login = new LoginPageElements();
		dashboard = new DashboardPage();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
	}
}
