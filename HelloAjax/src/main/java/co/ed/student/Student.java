package co.ed.student;

public class Student {
 private int studentNo;
 private String studentName;
 private int engScore;
 private int korScore;
 
 
@Override
public String toString() {
	return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", engScore=" + engScore + ", korScore="
			+ korScore + "]";
}


public int getStudentNo() {
	return studentNo;
}


public void setStudentNo(int studentNo) {
	this.studentNo = studentNo;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public int getEngScore() {
	return engScore;
}


public void setEngScore(int engScore) {
	this.engScore = engScore;
}


public int getKorScore() {
	return korScore;
}


public void setKorScore(int korScore) {
	this.korScore = korScore;
}


public Student() {
	super();
	this.studentNo = studentNo;
	this.studentName = studentName;
	this.engScore = engScore;
	this.korScore = korScore;
}
}
