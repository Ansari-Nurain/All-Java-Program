package com.greater_number;

import java.util.Scanner;

public class FindGreaterNumber1 {

	public static void main(String[] args) {

		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numers");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println("A is greater number");
		}else if (b>a) {
			System.out.println("B is greate number");
		}else {
			System.out.println("Both are equals");
		}
	}

}
