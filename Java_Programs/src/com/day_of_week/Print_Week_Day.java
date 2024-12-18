package com.day_of_week;

import java.util.Scanner;

public class Print_Week_Day {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		n = sc.nextInt();
		System.out.print("Day of a week = ");
		if(n==1) {
			System.out.println("Sunday");
		}else if(n==2) {
			System.out.println("Monday");
		}else if(n==3) {
			System.out.println("Tuesday");
		}else if(n==4) {
			System.out.println("Wednesday");
		}else if(n==5) {
			System.out.println("Thursday");
		}else if(n==6) {
			System.out.println("Frieday");
		}else if(n==7) {
			System.out.println("Saturday");
		}else {
			System.out.println("Invalid number");
		}
				
	}

}
