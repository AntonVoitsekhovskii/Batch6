package com.syntax.class26;

public class RegistrationClass {

	
	private String email;
	private String userName;
	private String password;
	
	public void setEmail(String email) {
		if(email.contains("yahoo")) {
			this.email = email;
		}
		else {
			System.out.println("Invalid email, please enter yahoo email");
		}
	}
	
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		}
		else {
			System.out.println("Invalid user name, please enter another user name");
		}
	}
	
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length() > 6 && !password.equalsIgnoreCase(userName)) {
			this.password= password;
		}
		else {
			System.out.println("Invalid password, please enter another password");
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
}
