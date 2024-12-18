package com.methodoverloading;

public class MethodOverriding {
	public void display() {
		System.out.println("Parent class method");
	}

  class ClassChild extends MethodOverriding {
	  public void display() {
			System.out.println("Parent class method");
		}
}

	public static void main(String[] args) {

		MethodOverriding mo = new MethodOverriding();
		ClassChild cc = new ClassChild();
		
		mo.display();
	}

}
