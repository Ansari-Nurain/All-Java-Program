package com.table_number;

import java.util.Scanner;

public class Number_Of_Table1 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number that want to table");
		
		n = sc.nextInt();
		System.out.println("Table of "+n);
		for(int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+ " = "+n*i);
		}
	}

}
