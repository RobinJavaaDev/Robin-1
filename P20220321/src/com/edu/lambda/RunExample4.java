package com.edu.lambda;

interface Runnable4 {
	public int run();
}

public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 10);

		};
		int result = runnable.run();
		System.out.println(result);
		
		// 함수적인 프로그램을 작성을 하고 싶을때(간단하게 표현),, 람다 식 활용
	    // 기능을 변수에 담아서 씀	
		runnable = () -> {
			return (int) (Math.random() * 100);
			
		};
		result = runnable.run();
		System.out.println(result);
	}
}
