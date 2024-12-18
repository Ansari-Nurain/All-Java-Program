package com.methodoverloading;

public class MainMethod {

	public static void main(String[] args) {
		StaticMethodOverloading pc = new StaticMethodOverloading();
		ChildClass cc = new ChildClass();
		cc.display();
		pc.display();
	}

}
