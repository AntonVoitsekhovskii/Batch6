package com.syntax.class15;

public class HW1 {

	public static void main(String[] args) {
		Email em = new Email();
		System.out.println(em.creatEmail("anton", "voyts", "gmail.com"));
		System.out.println(em.creatEmail("john", "snow", "yahoo.com"));
	}

}

	 	class Email  {
		String creatEmail(String name, String lastName, String emailType) {	
		String s = name + lastName + "@" + emailType;
		return s;
		}
	}
	