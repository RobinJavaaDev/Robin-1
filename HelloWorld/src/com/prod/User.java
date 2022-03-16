package com.prod;

public class User {
	private String userId;
	private String userGrade;
	private String userPhonenum;
	private int userPoint;


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserId() {
		return this.userId;
	}


	public String getUserGrade() {
		return this.userGrade;
	}


	public String getUserPhonenum() {
		return this.userPhonenum;
	}


	public int getUserPoint() {
		return userPoint;
	}


	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}


	public void setUserPhonenum(String userPhonenum) {
		this.userPhonenum = userPhonenum;
	}


	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}


	public String getUserInfo() {
		String result = "조회한 ID " + this.userId + "인 유저의 등급은 " + this.userGrade + "등급 이며, " //
				+ "잔여 포인트는" + this.userPoint + "이고 유저의 연락처는 " + this.userPhonenum +" 입니다.";
		return result;
	}
}
