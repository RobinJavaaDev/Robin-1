package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

//class String2 extends String{
//	// public final(상속불가선언) String{}
//}
public class ExceptionExample2 {
	public static void main(String[] args) {

		// Object
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드: " + obj.hashCode());
		// Exception
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e1) {
			// e1.printStackTrace();
			System.out.println("해당 클라스 존재하지 않음.");
		}
		// RuntimeException
		String str = null;
		// CharSequence interFace의 추상 메소드
		try {
			str.charAt(0);
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("널포인트 예외발생.");
			e.printStackTrace();

		}
		String nums1 = "백";
		String nums2 = "이백"; // 숫자이지만 문자열.
		int num1, num2;
		try {
			num1 = Integer.parseInt(nums1);
			num2 = Integer.parseInt(nums2);// -> int 변환
			
			str.charAt(0);
		} catch (Exception e) {

			num1 = 0;
			num2 = 0;
			System.out.println("상위 예외");
		}

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		try {
			showError();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("end of prog");
		
			
		}

	
//end of main
	public static void showError() throws ClassNotFoundException {
		Class.forName("java.lang.Strings");
}
} // end of
