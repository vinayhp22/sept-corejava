package com.vtech;

import java.util.Scanner;

public class SumOfAllArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers");
		
		int[] arr = new  int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			//sum = sum + arr[i]; // 0+1 = 1, 1+2 = 3, 3+3 = 6, 6 + 4 = 10, 10+5 = 15
			sum += arr[i];
		}
		System.out.println("Sum: "+sum);
		
	}
}
