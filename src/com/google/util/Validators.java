package com.google.util;

public class Validators {

	public static boolean isEmpty(String str) {
		return str == null || str.trim().length() == 0;
	}

	public static boolean isAlpha(String str) {
		// a-z A-Z
		// regex
		String alphaRegex = "[a-zA-Z]+";// 1 and n

		return str.matches(alphaRegex);// true

	}

	public static boolean isDigit(String str) {
		String digitRegex = "[0-9]+";
		return str.matches(digitRegex);
	}

	public static boolean isEmail(String email) {
		String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}";//

		return email.matches(emailRegex);
	}

	public static void main(String[] args) {
		System.out.println(isAlpha("ram"));
		System.out.println(isAlpha("ram1"));

	}
}
