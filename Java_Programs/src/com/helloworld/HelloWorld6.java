package com.helloworld;

import java.util.Scanner;

public class HelloWorld6 {
	
	public void testHello(String str) {
		System.out.println(str);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.next();
		
		HelloWorld6 h = new HelloWorld6();
		h.testHello(str);
	}

}
