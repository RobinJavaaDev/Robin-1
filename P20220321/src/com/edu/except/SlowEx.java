package com.edu.except;

public class SlowEx {
	public static void main(String[] args) {
		showInterval("Hello, world!\nNice, world!");
	}
public static void showInterval(String str) {
	for(int i=0; i< str.length(); i++) {
		System.out.print(str.charAt(i));
		try {
			Thread.sleep(150);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
	
	
	
	
}
