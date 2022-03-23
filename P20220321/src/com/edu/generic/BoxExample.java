package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
public static void main(String[] args) {
//	Box box = new Box();
//	box.setObj("Hello");
//	String result = (String) box.getObj(); // String => String
//	
//	System.out.println(result);
//	Integer result1 = (Integer) box.getObj(); //String -> Integer
//	System.out.println(result);
	
	Box<String> stringbox = new Box<String>();
	stringbox.setObj("Hello");
	String result = stringbox.getObj();
	
	
	Box<Integer> intBox = new Box<Integer>();
	intBox.setObj(100);
	Integer result1 = intBox.getObj();
	
	ArrayList<Integer> intAry = new ArrayList<Integer>();
	
	
	
}
}
