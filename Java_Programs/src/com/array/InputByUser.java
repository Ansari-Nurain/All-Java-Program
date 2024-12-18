package com.array;

import java.util.Scanner;

public class InputByUser {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		
		 n = sc.nextInt();
		
		System.out.println("Enter array number");
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
