package com.syntax.class01;

public class VariableValue {

		public static void main(String[] args) {
			byte a = 120;
			short b = 31896;
			int c = 147658;
			long d = 4567891;
			
			a = 126;
			b = 31896 + 154;
			c = c * 2;
			d = d * 5 + c;
			
			float e = 13.896f;
			double f = 257.194;
			
			e = e - a;
			f = f - c / 4;
			
			char letter = 'G';
			boolean t = true;
			
			letter = 'H';
			t = false;
			
			System.out.println("byte: " + a);
			System.out.println("short: " + b);
			System.out.println("integer: " + c);
			System.out.println("long: " + d);
			System.out.println();
			System.out.println("float: " + e);
			System.out.println("double: " + f);
			System.out.println();
			System.out.println("char: " + letter);
			System.out.println("boolean: " + t);
		}
}
