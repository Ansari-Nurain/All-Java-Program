package com.methodoverloading;

public class StaticMethodOverloading {
	public static void display() {
		System.out.printf("display method of the StaticMethodOverloading class.");
	}
}

class ChildClass extends StaticMethodOverloading {
	public static void display() {
		System.out.println("Overridden static method in Child Class in Java");
	}
}

