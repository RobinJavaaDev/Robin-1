package com.edu.collect;

import java.io.*;
import java.util.*;

// StudentServiceImpl(중첩클래스의 기능대체)
// 입력,수정,삭제 => 파일에 저장됨
public class StudentServiceFile implements StudentService {

	// 필드.
	List<Student> list = new ArrayList<Student>();
	File file;

	// 생성자.
	// 기본 생성자에 파일에 저장되어 있는 것을 읽어서 list 값을 담아준다.
	public StudentServiceFile() {
		try {
			FileReader fr = new FileReader("studentList.data");
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(","); // 101,홍길동,80,90
				// contents[0] <= 101, contents[1] <= 홍길동, contents[2] <= 80 ...
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));

			}
			br.close();
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// 메소드.
	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNum() == sno) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Student> studentList() {

		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentName() == student.getStudentName()) {
				list.get(i).setEngScore(student.getEngScore()); // 영어점수수정.
				list.get(i).setKorScore(student.getKorScore()); // 국어점수수정.
			}
		}
	}

	@Override
	public void removeStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudentNum() == sno) {
				list.remove(i);
				System.out.println("삭제완료");

			}
		}
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchList = new ArrayList<Student>();
		// 찾앗다고 종료 X
		for (int i = 0; i < list.size(); i++) {
			// 같은 이름이 잇는지 찾아보고 잇으면 searchList.add()
			if (list.get(i).getStudentName().equals(name)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}

	@Override
	public void saveToFile() {
		// 작성했던 ArrayList<Student> list => 파일저장
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림의 생성자의 매개값으로 기본스트림.

			for (Student stud : list) {
				bw.write(stud.getStudentNum() + "," + stud.getStudentName() + "," + stud.getEngScore() + ","
						+ stud.getKorScore() + "\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
