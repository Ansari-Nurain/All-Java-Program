package com.day_of_week;

import java.util.Scanner;

public class Print_Week_Day1 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number ");
		
		n = sc.nextInt();
		System.out.print("Week of a day = ");
		
		switch(n) {
		
		case 1 : System.out.println("Sunday");
		break;
		case 2 : System.out.println("Monday");
		break;
		case 3 : System.out.println("Tuesday");
		break;
		case 4 : System.out.println("Wednesday");
		break;
		case 5 : System.out.println("Thuresday");
		break;
		case 6 : System.out.println("Friday");
		break;
		case 7 : System.out.println("Satuday");
		break;
		default : System.out.println("Invalid number");

		
		}
	}

}
