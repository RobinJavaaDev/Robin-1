package com.edu;
// Object(객체) -> Class(도면, 틀) -> 인스턴스 생성(초기화).
public class ObjectExample {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 12.34;
		double num3 = 20; // 자동형변환(Promotion)
		int num4 = (int) 23.4; // 강제형변환(Casting)

		String str1 = "Hello"; // heap(인스턴스) 영역에 생 성.
		Car car1 = new Car(); // 초기화(인스턴스생성) ㅅ
		car1.setModel("Sonata");
		car1.setPrice(10000000);

	}

}