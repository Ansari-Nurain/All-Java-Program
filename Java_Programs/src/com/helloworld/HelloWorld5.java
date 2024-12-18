package com.helloworld;

import java.util.Scanner;

public class HelloWorld5 {
	
	public void testHello() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.next();
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		HelloWorld5 h = new HelloWorld5();
		
		h.testHello();

	}

}
