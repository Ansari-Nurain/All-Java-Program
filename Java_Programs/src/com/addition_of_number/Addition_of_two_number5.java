package com.addition_of_number;

import java.util.Scanner;

//public class Addition_of_two_number5 {
//
//	static void addNumber(int a, int b) {
//		int sum = a+b;
//		System.out.println("Addition of two number = "+sum);
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any two number");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		addNumber(a, b);
//		
//	}
//
//}

public class Addition_of_two_number5 {

	static int addNumber(int a, int b) {
		int sum = a+b;
		System.out.println("Addition of two number = "+sum);
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		addNumber(a, b);
		
	}

}
