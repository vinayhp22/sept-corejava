package com.vtech;

public class ReverseIntEx {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] temp = new int[arr.length]; //0,1,2,3,4
		
		int tempCount = temp.length; //5
		
		for(int i = 0; i< arr.length; i++) {
			temp[tempCount-1] = arr[i];
			tempCount--;
		}
		System.out.print("{");
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
			if(i != temp.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
