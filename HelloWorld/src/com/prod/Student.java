package com.prod;

public class Student {
	// 학번... ex) 22-123456 , - 떔에 문자!!!
	// 필드,(field) 
	String studentNo;
	String studentName;
	int korScore;
	int engScore;

	// method : 기능 ... 함수
	void study(String gwamok) {
		System.out.println(gwamok + "를! 합니니닌ㄴ닫ㄷ다.");
	}

	void eat(String food) {
		System.out.println(food + " 먹어라 준식아");

	}

	int getKorScore() {
		return korScore;
	}

	int getEngscore() {
		return engScore;
	}

}
