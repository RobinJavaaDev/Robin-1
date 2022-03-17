package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100 ,"이가영"); // studNo = 100
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setKorScore(100);
		s1.setEngScore(60); // set으로 메소드 값을 지정 하거나.
		s1.setMathScore(80);

		Student s2 = new Student("이혜린",101 ,80, 82, 85); // 생성자를 통해 필드의 값을 지정.(초기화 해주면서 바로 값 지정)
		Student s3 = new Student("서현일", 102,70, 80, 90);
		Student s4 = new Student("최규완", 103,77, 82, 83);

		Student[] students = { s1, s2, s3, s4 };

		while (true) {
			System.out.println("조회 하려는 학생의 이름 입력:(ex:홍길동) ");
			String searchName = scn.next();
			if (searchName.equals("종료")) {
				break;
			}

			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName))
					System.out.println(students[i].getStudentInfo());
			}

		}
		System.out.println("시스템 종료");
	}
}
