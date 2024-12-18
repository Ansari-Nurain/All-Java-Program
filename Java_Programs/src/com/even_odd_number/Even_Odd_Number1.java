package com.even_odd_number;

import java.util.Scanner;

public class Even_Odd_Number1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
}
