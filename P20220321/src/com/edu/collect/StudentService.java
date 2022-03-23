package com.edu.collect;

import java.util.List;

public interface StudentService {

	void insertStudent(Student student);

	Student getStudent(int sno);

	List<Student> studentList();

	void modifyStudent(Student student);

}
