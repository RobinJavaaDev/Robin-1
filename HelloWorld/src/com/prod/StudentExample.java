package com.prod;

public class StudentExample {
	public static void main(String[] args) {
    Student s1 = new Student();
    s1.studentName = "엄준식";
    s1.korScore = 80;
    s1.engScore = 85;
    
    s1.study("재미 없는 자바 ");
    s1.eat("급식");
    s1.eat("간식도");
    s1.eat("개 맛업는 아샷추 (아이스티 샷추가 ㅎ)");
    int v1 = s1.getKorScore();
    int v2 = s1.getEngscore();
    System.out.println("국어점수: "+ v1 + ", 영어점수: " + v2);
	}
}
