package com.prod;


public class ReferenceExample {
	public static void main(String[] args) {
		// 잠조타입 vs 기본(데이터)타입
		int num1 = 10; // 리터럴
		int num2 = 10; //
		// int, double, (byte, short, long, float, char, boolean)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);

		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1); // ex) 123asdf34
		System.out.println(str2); // ex) as2fd44gf
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// 정수 애들(기본타입)은비ㅣ교해도 잘나오지만 str(참조타입)=> 주소를 가져오는 느낌? 비교연산자 돌려도 false뜸
	}
}
