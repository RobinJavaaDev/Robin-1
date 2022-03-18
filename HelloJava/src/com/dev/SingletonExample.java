package com.dev;

public class SingletonExample {
public static void main(String[] args) {
	Singleton s1 = Singleton.getInstance(); 
	Singleton s2 = Singleton.getInstance(); 
	//	Singleton s2 = new Singleton();
	
	System.out.println(s1 == s2);
	System.out.println(s2);
	
}
}
