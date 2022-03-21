package com.edu;

public class InheritExample{
//g 학생, 직장인,주부-정보	
	// ㅈ학교,학년
	// 직장명,직급
	// 출신지
	public static void main(String[] args) {
		
		
		Students student = new Students();
		student.setName("엄준식");
		student.setAge(25);
		student.setSchool("동탄대");
		student.setGrade(44);
		
		Workers worker= new Workers();
		worker.setName("준식엄");

		
		// 부모클래스의 참조변수에 자식클래스의 참조변수 자동형변환(Promotion)
		Person p1 = new Person();
		p1 = (Person)student;
		p1 = worker;
		
//		student = worker;
		
		
	}
	
}

