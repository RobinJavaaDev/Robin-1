package com.edu;

public class UnivFriend extends Friend{
public UnivFriend() {
		super(); // Friend();
		
	}
	
	
	//> 학교 : 학교 이름, 전공
	
	public UnivFriend(String name, int age, double height, double weight, String phone) {
	super(name, age, height, weight, phone);
	
}
	public UnivFriend(String name, int age, double height, double weight, String phone, String university, String major) {
		super(name, age, height, weight, phone);
		this.university = university;
		this.major = major;
	}

	private String university;
	private String major;
	
	
	
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
//	
}
