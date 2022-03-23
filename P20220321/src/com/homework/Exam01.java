package com.homework;

public class Exam01 {
	public static void main(String[] args) {
		int num1, num2, result = 0;
		num1 = 25;
		num2 = 30;
		if (num1 > num2) {
			result = num1 - num2;

		}
		if (num2 > num1) {
			result = num2 - num1;
		}
		System.out.println("result: " + result);
	}
}
