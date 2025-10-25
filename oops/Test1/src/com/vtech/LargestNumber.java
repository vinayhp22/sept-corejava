package com.vtech;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+(i+1)+"th element");
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max) { 
				max = arr[i]; //5, 10, 25, 75
			}
		}
		
		System.out.println("Largest element: "+max);
	}
}
