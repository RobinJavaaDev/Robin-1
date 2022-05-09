package com.dev;

public class ForExample {
public static void main(String[] args) {
	// for (int i = 1; i <= 10; i++) {
	//  
 	// }
	
	// 1~10부터 더하기?
	int sum =0;
	for (int i = 1; i <= 5; i++) {
		
		sum=sum+i;
	}
	
	
	
	System.out.println("합계:" + sum);
	int arr[];
	int i=0;
	arr = new int[10];
	arr[0] = 0;
	arr[1] = 1;
	while(i<8) {
		arr[i+2] = arr[i+1] + arr[i];
		i++;
	}
	System.out.println(arr[9]);
} 
}
