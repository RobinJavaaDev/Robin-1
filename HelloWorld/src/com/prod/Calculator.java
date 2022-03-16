package com.prod;

public class Calculator {

	double PI = 3.14;
	// 매개변수
	int add (int v1, int v2) {
		 return v1 +v2 ;
	}
	// 반환 int, minus메서드 이름, v1, v2  
	int minus (int v1, int v2) {
		 return v1 -v2 ;
	}


	// 사각형의 넓ㅇ ㅣ계산...
	double getRectArea(double x, double y) {
		return x * y;
	}
	
	// 원의 넓이 계산......
	double getCircleArea(double radius) { 
		return PI * radius * radius;
	}
	
	
	
}
