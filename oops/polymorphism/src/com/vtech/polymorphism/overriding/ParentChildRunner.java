package com.vtech.polymorphism.overriding;

public class ParentChildRunner {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marry(); //arrange marraiage
		
		Child c = new Child();
		c.marry(); //Love marriage
		
		Parent c1 = new Child(); 
		c1.marry(); //Love marriage
	}

}
