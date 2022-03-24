package com.edu.lambda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
public static void main(String[] args) {
	// functional interface : 람다표현식 가능
	Consumer<String> consumer = (t) -> {
			System.out.println(t + " 출력합니다");
						
	};
	consumer.accept("메세지 를!");
	
	BiConsumer<Integer, Integer> biCon = (t, u) -> { 

		
			System.out.println("result => " + (t + u));
			
		};
		biCon.accept(28, 40);
	}
}

