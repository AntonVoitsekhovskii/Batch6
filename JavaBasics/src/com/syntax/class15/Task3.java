package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
	Palindrome word = new Palindrome();
	word.check("Bob");

	}

}

	class Palindrome {
		void check(String s) {
			s = s.replaceAll(" ", "");
			String s2 = "";
			for(int i = s.length() - 1; i >= 0; i-- ) {
				s2 += s.charAt(i);
			}
			if(s.equalsIgnoreCase(s2)) {
				System.out.println("String is palindrome");
			}
			else {
				System.out.println("String is NOT palindrome");
			}
		}
	}