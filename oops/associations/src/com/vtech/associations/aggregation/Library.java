package com.vtech.associations.aggregation;

public class Library {

	private Book book; //Composition(HAS-A)
	
	public Library(String name) {
		book = new Book(name);
	}
	
	public void showBook() {
		System.out.println("Book: "+book.name);
	}
}
