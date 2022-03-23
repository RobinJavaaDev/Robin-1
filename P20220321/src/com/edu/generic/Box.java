package com.edu.generic;

// ArrayList<Interger>
// Type Parameter : 선언 한거에 따라 바뀜...
public class Box<T> {
	T obj;
      
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return this.obj;
	}
}
