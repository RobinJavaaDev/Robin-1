package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // 추상 클라스...-> 인스턴스 생성 불가
		Animal animal = null;
		animal = new Dog();
		animal.setName("엄준식이");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("고오양이");
		animal.eat();
		animal.speak();
	}

}
