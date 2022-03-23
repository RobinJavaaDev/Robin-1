package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
       Set<String> set = new HashSet<String>(); // set: 중복된 값은 허용x 
       set.add("hello");
       set.add("world");
       set.add("good");
       set.add("world"); // 중복 요소는 추가 되지 않음.
       
       set.remove("good");
       System.out.println("Set 크기: " + set.size());
      
		
		Iterator<String> iter = set.iterator(); // 반복자....
		while(iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		System.out.println("end of prog");
	}

}
