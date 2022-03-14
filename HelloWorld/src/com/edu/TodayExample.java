package com.edu;
// 이름 입력 받기 (문자열,String) -> scn.nextLine();
// 연락처 입력 받기 (문자열,String) -> scn.nextLine();
// 나이 입력 받기 (int) -> scn.nextInt();
// 키 입력 받기 (double) -> scn.nextdouble();

import java.util.Scanner;

// 이름은 : ???
// 연락처는 : 000-1234-5678
// 나이 : 26
// 키 : 168.1
// 몸무게 : 51541541
// 적정몸무게: (키-100) * 0.9 => 60.3 보다 크면 과체중 적으면 저체중

// 만약 67.5, 이면 +-5킬로라 // 72.5 ~ 62.5
// 적정 67.5, 몸무게 69.3
// if(몸무게+5>적정 && 몸무게-5<적정) {
//      System.out.println(적정);    
//   } else { 
//      System.out.println(비정상);
//   }
//
// }
public class TodayExample {
public static void main(String[] args) {
	String name, num;
	int age;
	double height, weight, proper;
	Scanner scn = new Scanner(System.in);
	System.out.println("이름을 입력하세요:");
	name = scn.nextLine();
	System.out.println("연락처를 입력하세요:");
	num = scn.nextLine();
	System.out.println("나이를 입력하세요:");
	age = scn.nextInt();
	System.out.println("키를 입력하세요:");
	height = scn.nextDouble();
	System.out.println("몸무게를 입력하세요:");
	weight = scn.nextDouble();
	proper = (height - 100) * 0.9;
			
	
	
	System.out.println("이름은 "+ name + " 입니다");
	System.out.println("연락처는 "+ num + " 입니다");
	System.out.println("나이는 "+ age + " 세입니다");
	System.out.println("키는 "+ height + "cm입니다");
	System.out.println("몸무게는 "+ weight + "kg입니다");
	
	if(weight+5>proper && weight-5<proper) {
      System.out.println("적정");    
   } else { 
      System.out.println("비정상");
   }
	
	
	
	
	
	
//	if(weight>proper) {
//		System.out.println("당신의 몸무게는 " + weight + " 이며, 적정몸무게인 " + proper + "보다 많네요.. 다이어트... ");
//	} else {
//		System.out.println("당신의 몸무게는 " + weight + "이며, 적정몸무게인 " + proper + "와 비슷합니다! ");
//	}
	
	
}
}
