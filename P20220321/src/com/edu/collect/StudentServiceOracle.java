package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	// 입력
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score) "
				+ "values (?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStudentNum());
			psmt.setString(2, student.getStudentName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore());
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력완료");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}// end of insert

	@Override
	// 한건조회
	public Student getStudent(int sno) {
		conn = getConnect();
		Student stu = null;

		try {
			psmt = conn.prepareStatement("select * from student_info where student_no = ?");
			psmt.setInt(1, sno);
			rs = psmt.executeQuery();
			while (rs.next()) {
				stu = new Student();
				stu.setStudentNum(rs.getInt("student_no"));
				stu.setStudentName(rs.getString("student_name"));
				stu.setEngScore(rs.getInt("eng_score"));
				stu.setKorScore(rs.getInt("kor_score"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}
		return stu;
	} // end of search one thing

	@Override
	// 리스트
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentNum(rs.getInt("student_no"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	} // end of list

	@Override
	// 수정처리
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = " UPDATE student_info " + "SET eng_score = ? ,kor_score = ? " + "WHERE student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getStudentNum());
			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 수정완료.");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}
	} // end of update

	@Override
	// 제거처리
	public void removeStudent(int sno) {
		conn = getConnect();
		String sql = "DELETE FROM student_info " + "WHERE student_no =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 삭제완료.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	} // end of remove

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();

		try {
			psmt = conn.prepareStatement("SELECT *  " + "FROM student_info  " + "WHERE student_name LIKE '%'||?||'%'");
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				stu.setStudentNum(rs.getInt("student_no"));
				stu.setStudentName(rs.getString("student_name"));
				stu.setEngScore(rs.getInt("eng_score"));
				stu.setKorScore(rs.getInt("kor_score"));
				list.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	} // end of search

	@Override
	public void saveToFile() {

	}

} // end of class
