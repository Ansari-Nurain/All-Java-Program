package com.array;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[3]);
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}

