package com.homework;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2));

		String lowerstr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();

		System.out.println(lowerstr1.equals(lowerstr2));

		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
