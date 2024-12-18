package com.calculator;

import java.util.Scanner;

public class Calculator1 {
	
	public static void main(String[] args) {
		
		int num1, num2, button;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1 for addition");
		System.out.println("Please enter 2 for subtraction");
		System.out.println("Please enter 3 for multiplication");
		System.out.println("Please enter 4 for division");
		System.out.println(" ");
		
		button = sc.nextInt();
		
		if (button >= 1 && button <= 4) {
			System.out.println("Please enter any two numbers = ");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			switch (button) {
				case 1:
					int sum = num1 + num2;
					System.out.println("Addition of two numbers = " + sum);
					break;
				case 2:
					int sub = num1 - num2;
					System.out.println("Subtraction of two numbers = " + sub);
					break;
				case 3:
					int multi = num1 * num2;
					System.out.println("Multiplication of two numbers = " + multi);
					break;
				case 4:
					if (num2 != 0) {
						int div = num1 / num2;
						System.out.println("Division of two numbers = " + div);
					} else {
						System.out.println("Invalid division, denominator cannot be zero");
					}
					break;
			}
		} else {
			System.out.println("Invalid number");
		}
	}
}

