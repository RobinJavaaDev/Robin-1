package com.edu;

import com.dev.Students;

// 절차프로그램(데이터,함수) -> 객체(데이터, [필드,메소드], 기능(함수),)지향
// Object(객체) -> Class(도면, 틀) -> 인스턴스 생성(초기화).
// 학생(객체:Object) -> Class Student -> instance(new student())
public class ObjectExample {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 12.34;
		double num3 = 20; // 자동형변환(Promotion)
		int num4 = (int) 23.4; // 강제형변환(Casting)

		String str1 = "Hello"; // heap(인스턴스) 영역에 생 성.
		Car car1 = new Car(); // 초기화(인스턴스생성)
		car1.setModel("Sonata");
		car1.setPrice(10000000);

		Students s1 = new Students(); // 초기화 시점에 값을 지정하려함.
		s1.setStudNo(100);
		s1.setStudName("김형민");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(85);
		s1.setKorScore(95);

		System.out.println("영어점수 값: " + s1.getEngScore());
		System.out.println("이름의 값: " + s1.getStudName());
		System.out.println(s1.getStudName() + "의 합계 " + s1.getSumScore());
		System.out.println(s1.getStudName() + "의 평균 " + s1.getAvgScore());

	}

}