package com.edu.api;

public class IDCheck {
//주민번호 입력 -> 950304-1234567, 000205-4567890
	// 950304-1234567, 950304 1234567, 9503041234567

	// getGender()

	

	public String getGender(String sso) {
		String result = "";
		sso = sso.replace("-", "");
		sso = sso.replace(" ", "");
		char result1 = sso.charAt(6);
		switch (result1) {
		case '1':
		case '3':

			result = "남자입니다.";
			break;
		case '2':
		case '4':
			result = "여자입니다";
			break;
		}
		return result;
	}

}
