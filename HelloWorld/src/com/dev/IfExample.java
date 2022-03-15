package com.dev;

public class IfExample { // WhichExample, first name, first_name
	public static void main(String[] args) {
//  조건문 if, ....
//		60점 이상이면 Pass.
		int score = 86;
		if (score > 60) {
			System.out.println("pass입니다.");

		} else {
			System.out.println("fail입니다.");
		}

//		90점 이상이면 A, 80 이상이면 B, 70 이상 C, 60 이상 D, 그외 F
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("a+ !!");
			} else {
				System.out.println("a입니다");
			}
		}

		else if (score >= 80) {
			System.out.println("b입니다");
			if (score >= 85) {
				System.out.println("b+ 입니다");
			} else {
				System.out.println("b입니다");

			}
		}

		else if (score >= 70) {
			System.out.println("c입니다");
			if (score >= 75) {
				System.out.println("c+ 입니다");
			} else {
				System.out.println("c입니다");

			}
		}

		else if (score >= 60) {
			if (score >= 65) {
				System.out.println("d+ 입니다");
			} else {
				System.out.println("d입니다");

			}
		} else

		{
			System.out.println("f입니다");
		}
		System.out.println("end of program");
	}

}
