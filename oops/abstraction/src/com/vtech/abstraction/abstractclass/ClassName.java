package com.vtech.abstraction.abstractclass;

public abstract class ClassName {
	abstract void method1(); //abstract method(no body)
	
	void method2() { //concrete method(has body)
		System.out.println("Concrete method inside abstract class");
	}
}
