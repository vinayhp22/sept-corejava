package com.vtech.inheritance;

public class Runner {

	public static void main(String[] args) {
		Child c = new Child();
		c.property(); //inherited method
		c.ownProperty(); // own method
		
		Parent c1 = new Child(); 
		c1.property(); 
		//c1.ownProperty(); 
		//own method can't access because reference type is Parent class
			
		//Child c = new Parent(); //Type mismatch: cannot convert from Parent to Child
		
		C a =new C();
		a.display();
	}
}
