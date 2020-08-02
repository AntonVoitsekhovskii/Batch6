package com.syntax.class26;

public class RegistrationTest {
	
	public static void main(String[] args) {
		
		RegistrationClass user1 = new RegistrationClass();
		user1.setEmail("antonvoyts@yahoo.com");
		System.out.println(user1.getEmail());
		
		user1.setUserName("Anthony");
		System.out.println(user1.getUserName());
		
		user1.setPassword("1234567");
		System.out.println(user1.getPassword());
	}
}
