package com.methodoverloading;

public class MethodOverloading {
	
	public void display() {
		System.out.println("First Method of the class");
	}
	public void display(String str) {
		System.out.println("Second Method of the class");
	}

	public static void main(String[] args) {

		MethodOverloading mv = new MethodOverloading();
		mv.display();
		mv.display("str");
		
	}

}
