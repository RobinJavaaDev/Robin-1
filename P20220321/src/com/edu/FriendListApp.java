package com.edu;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
        
		UnivFriend f1 = new UnivFriend("엄준식", 33, 178.9, 69.2, "010-7845-3265");
		UnivFriend f2 = new UnivFriend("이재석", 31, 174.9, 63.2, "010-7845-3265");
		UnivFriend f3 = new UnivFriend("정상길", 28, 164.9, 60.2, "010-7845-3265");
		
		Friend f4 = new Friend();
		f4.setName("진휘용");
		f4.setAge(25);
		f4.setHeight(178.3);
		f4.setWeight(68.9);
		f4.setPhone("010-7795-6541");

		
		UnivFriend f5 = new UnivFriend("서현일", 29, 178.9, 69.2, "010-7845-3265");
		f5.setUniversity("대구대학교");
		f5.setMajor("컴퓨터공학과");
		
		
		ComFriend f6 = new ComFriend("최규오ㅓㄴ", 29 , 197.2, 75.5, "010-454-445" , "네이버sㄴ.ㄴ >" , "지도개발연구");
		
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		
		friends[4] = f5;
		friends[5] = f6;
		
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] !=null)
			System.out.println(friends[i].toString());
			
		}
//		Friend friend = f2 ; // univFrend ; getUniv, geMajor xxx
//		friend = f1;
//		UnivFriend un1 = null;
//		if(friend instanceof UnivFriend) { // un1 변수값이 UnivFriend의 인스턴스?
//			un1= (UnivFriend) friend;//Casting 해야함
//			un1.getUniversity();//  부모클래서의 참조변수 -> 자식클래스의 참조변수할당
			
			for(int i=0; i<friends.length; i++) {
				if(friends[i] !=null) 
					System.out.println(friends[i].toString());
			}
			
			
		}
		
		
	}


