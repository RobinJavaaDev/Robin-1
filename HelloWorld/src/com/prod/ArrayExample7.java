package com.prod;

public class ArrayExample7 {
	public static void main(String[] args) {
		int num1 = 22;
		int num2 = 77;
		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("num1: " + num1);
		System.out.println("num1: " + num2);

		int[] numbers = new int[2];
		numbers[0] = 15;
		numbers[1] = 20;
		
		temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;

		System.out.println("바뀐 첫번째 " + numbers[0]);
		System.out.println("바뀐 두번째 " + numbers[1]);
	}
}
