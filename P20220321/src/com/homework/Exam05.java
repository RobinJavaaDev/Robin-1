package com.homework;

import java.util.Scanner;

public class Exam05 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("책 제목 입력>>");
	String title = scn.next();
	System.out.println("저자 입력>>");
	String author = scn.next();
	System.out.println("출판사 입력>>");
	String press = scn.next();
	System.out.println("가격 입력>>");
	int price = scn.nextInt();
	
	
	Book book = new Book(title, author, press, price);
	book.showInfo();
	
}
}
