package com.print_statement;

import java.util.Scanner;

/*Write a program in java to print if press 1 then print "Hello" and if press 2 then print "How are you"
and if press 3 then print "I am fine".*/

public class Print_Statement1 {

	public static void main(String[] args) {
		
		int button;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please press any number between 1,2,3");
		
		button = sc.nextInt();
		switch(button) {
		
		case 1 : System.out.println("Hello");
		break;
		case 2 : System.out.println("How are you ?");
		break;
		case 3 : System.out.println("I am fine");
		break;
		default : System.out.println("Invalid Option");
		}
	}
}
