package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
public static void main(String[] args) {
	List<Student> list = new ArrayList<Student>();
	list.add(new Student("홍길동", "남자", 70, 100)); // 170
	list.add(new Student("김순희", "여자", 80, 120)); // 200
	list.add(new Student("김부식", "남자", 85, 95));  // 180
	list.add(new Student("박한나", "여자", 88, 99));  // 187
	
	
	
	// 남자,여자 상관 없이 score + point 더했을때 180 이상인 학생들만 출력 하기
	
	
	
	list.stream().filter(student -> student.score >= 80)
	.filter(student->student.gender.equals("여자"))
	.forEach(student -> System.out.println(student));
	// 컬렉션으로부터 스트림 생성       80점 이상인 대상만 필터링           필터링된 대상을 출력
	System.out.println("=========================================================================================");
	
	list.stream() // 스트림 생성
//	.filter(student -> student.score + student.point >= 180) // 180 이상 필터링
	.sorted() // Comparable 구성해서 정렬
	.forEach(student -> System.out.println("score + point가 180 이상: " + student));
	// 결과 출력
	
	
}
}
