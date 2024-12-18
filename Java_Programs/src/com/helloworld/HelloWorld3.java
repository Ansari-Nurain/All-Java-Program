package com.helloworld;

import java.util.Scanner;

public class HelloWorld3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		
		String str = sc.next();
		
		for(int i=1; i<=10; i++) {
		
			System.out.println(i+" "+str);

		}
		
	}

}


//Write a program in java and print hello world ten times and input taken by users