package com.Sum_of_natural_number;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of natural number is = " + sum);
	}
}
