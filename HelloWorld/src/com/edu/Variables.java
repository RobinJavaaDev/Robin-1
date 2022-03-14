package com.edu;

public class Variables {
	public static void main(String[] args) {
		// 변수:메모리공
		int age = 20;
		System.out.println("age변수: " + age);
		int num1 = 30;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("20 + 10 = 30");

		String name = "홍길동"; //
		name = "엄준식";
		System.out.println(name + "의 나이는" + age + "입니다.");

//		String myName = "이재빈"; // 상수

		// 전화번호, 이메일 값을 담을 수 있는 변수
		String phoneNumber = "010-1234-1234";
		String email = "qwert@naver.com";
		System.out.println(name + "의 전화먼호 " + phoneNumber + "이고 이메일은 " + email + " 입니다. ");
//		System.out.println("엄준식의 번호: 010-1234-1234이고 이메일은 qwert@naver.com 입니다");

	}
}
