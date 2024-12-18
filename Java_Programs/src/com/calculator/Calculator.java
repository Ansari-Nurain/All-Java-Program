package com.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		int num1,num2,button;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1 for addtion");
		System.out.println("Please enter 2 for subtraction");
		System.out.println("Please enter 3 for multiplication");
		System.out.println("Please enter 4 for division");
		System.out.println(" ");
		
		button = sc.nextInt();
		if (button >= 1 && button <= 4) {
		
			System.out.println("Please enter any two numbers = ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if(button==1) {
			int sum = num1+num2;
			System.out.println("Addition of two numbers = "+sum);
		}else if(button==2) {
			int sub = num1-num2;
			System.out.println("Subtraction of two numbers = "+sub);
		}else if(button==3) {
			int multi = num1*num2;
			System.out.println("Subtraction of two numbers = "+multi);
		}
		else if(button==4) {
			if(num2<=0) {
				System.out.println("Invalid divdision");
			}else {
				int div = num1/num2;
				System.out.println("Division of two numbers = "+div);
			}
			
		}
		}else {
			System.out.println("Invalid numbers");
		}
	}


}
