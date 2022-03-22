package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
public static void main(String[] args) {
	Member obj1 = new Member ("blue","엄준식");
	Member obj2 = new Member ("blue", "엄준식");
	Member obj3 = new Member ("red", "엄준식");
	
	if(obj1.equals(obj2)) {
		System.out.println("obj1과 obj2는 동등함");
	} else {
		System.out.println("obj1과 obj2는 동등하지 않음");
	}
	
	if(obj1.equals(obj3)) {
		System.out.println("obj1과 obj3은 동등함");
	} else {
		System.out.println("obj1과 obj3은 동등하지 않음");
	}
	
	if(obj1 == obj2) {
		System.out.println("obj1과 obj2은 동등함");
	} else {
		System.out.println("obj1과 obj2은 동등하지 않음");
	}
	// 배열-> 컬랙션(ArrayList,HashSet,HashMap) : 여러개의 값을 저장.  
	Member [] memberAry = new Member[5]; // Member의 인스턴스 최대값5개 저장
	                                     // 크기 초과하면 새로운 배열 선언, 복사
	ArrayList<Member> memList = new ArrayList<Member>();
	
	memList.add(new Member("blue","엄준식"));
	memList.add(new Member("blue","엄준식"));
	
	for (int i=0; i<memList.size(); i++) {
		System.out.println(memList.get(i));
	}
	
	HashSet<Member> memSet = new HashSet<Member>();
	memSet.add(new Member("blue","엄준식")); // hashCode(), equals()
	memSet.add(new Member("blue","엄준식"));
	
	System.out.println(memSet.size());
	
	
}
}
