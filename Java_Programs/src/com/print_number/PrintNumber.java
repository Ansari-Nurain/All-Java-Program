package com.print_number;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		
//		int n;
//		for(n=1; n<=10; n++) {
//			System.out.println(n);
//		}
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
