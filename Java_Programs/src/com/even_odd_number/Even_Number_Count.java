package com.even_odd_number;

import java.util.Scanner;

public class Even_Number_Count {

	public static void main(String[] args) {
		
		int n, count=0;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter any number");

		n = sc.nextInt();
		System.out.println("Even number = ");
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.println("Total even number = "+ count);
	}
}
