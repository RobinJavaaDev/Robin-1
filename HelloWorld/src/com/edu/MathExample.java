package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double num1, num2;
		System.out.println("첫 번째 수를 입력 하세요");
		num1 = scn.nextDouble();
		System.out.println("두 번째 수를 입력 하세요");
		num2 = scn.nextDouble();
		 
		System.out.println("두 수의 합은 " + (num1 + num2) + " 입니다.");
		System.out.println("두 수의 차는 " + (num1 - num2) + " 입니다.");
		System.out.println("두 수의 곱은 " + (num1 * num2) + " 입니다.");
		System.out.println("두 수의 몫은 " + (int)(num1 / num2) + " 입니다.");
		System.out.println("두 수를 나머지는 " + (num1 % num2) + " 입니다.");
		
		scn.close();
	}
}
