package com.syntax.class20;

public class userClass {

	String name;
	int mobile;
	
}

class userInfo extends userClass {
	
	String address;
	
	userInfo(String address) {
		this.address = address;
	}
}
