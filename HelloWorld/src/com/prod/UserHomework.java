package com.prod;

public class UserHomework {
public static void main(String[] args) {
	User user1 = new User();
	user1.setUserId("001");
	user1.setUserGrade("A");
	user1.setUserPhonenum("010-1234-5678");		
	user1.setUserPoint(10000);
		
	User user2 = new User();
	user2.setUserId("002");
	user2.setUserGrade("B");
	user2.setUserPhonenum("010-5678-7778");		
	user2.setUserPoint(500); 
	
	User user3 = new User();
	user3.setUserId("003");
	user3.setUserGrade("A");
	user3.setUserPhonenum("010-1222-9478");		
	user3.setUserPoint(1100);
	
	User user4 = new User();
	user4.setUserId("004");
	user4.setUserGrade("C");
	user4.setUserPhonenum("010-9765-1234");		
	user4.setUserPoint(90);
	
	System.out.println(user1.getUserInfo());
	System.out.println(user4.getUserInfo());
	System.out.println(user2.getUserInfo());
	System.out.println(user3.getUserInfo());
	
	
	User [] userInq = { user1, user2, user3, user4 };
	for (int i=0; i<userInq.length; i++) {
		if (userInq[i].getUserPoint()>1000 && userInq[i].getUserGrade()=="A") {
			System.out.println("사용자 등급 A, 1000 포인트 이상인 회원은 "+ userInq[i].getUserId());
		}
		
	}
	
}
}
