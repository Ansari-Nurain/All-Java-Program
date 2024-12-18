package com.addition_of_number;

import java.util.Scanner;

public class Addition_of_two_number1 {

	public static void main(String[] args) {

		int a,b,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two number");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a+b;
		System.out.println("Addition of two number = "+sum);
	}

}
