package com.vtech.encapsulation;

public class ReserseString {

	public static void main(String[] args) {
		String name = "Vtech";
		char[] charArray = name.toCharArray(); // {'V', 't', 'e', 'c', 'h'}
		String revName = "";
		for (int i = charArray.length-1; i >=0; i--) {
			revName = revName+charArray[i];
		}
		System.out.println(revName);
		
	}
}
