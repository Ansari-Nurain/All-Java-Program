package com.even_odd_number;

import java.util.Scanner;

//print even number till n

public class Even_Number {


	public static void main(String[] args) {
		
		int n; 
		System.out.println("Enter any number");

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		System.out.print("Even number = ");
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
	}
	
}
