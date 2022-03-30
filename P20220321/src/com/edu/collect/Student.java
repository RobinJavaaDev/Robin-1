package com.edu.collect;

import java.io.Serializable;

public class Student implements Serializable{
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70).

	// 생성자: 기본 생성자, 매개값이 4개인 생성자.
	// Getter, Setter 생성.
	//

	private int StudentNum;
	private String StudentName;
	private int EngScore;
	private int KorScore;

	

	public Student(int studentNum, String studentName, int engScore, int korScore) {
		super();
		StudentNum = studentNum;
		StudentName = studentName;
		EngScore = engScore;
		KorScore = korScore;
	}
public Student(){
	
}
	

	public int getStudentNum() {
		return StudentNum;
	}

	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getEngScore() {
		return EngScore;
	}

	public void setEngScore(int engScore) {
		EngScore = engScore;
	}

	public int getKorScore() {
		return KorScore;
	}

	public void setKorScore(int korScore) {
		KorScore = korScore;
	}
//toString()=> 재정의

	@Override
	public String toString() {
		return "학생정보[ 학생번호: " + StudentNum + ", 이름:  "+ StudentName + ", 영어점수: " + EngScore +", 국어점수: "+ KorScore + " ]";
	}

	
	
	
}
