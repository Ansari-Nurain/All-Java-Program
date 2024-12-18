package com.print_statement;

import java.util.Scanner;

/*Write a program in java to print if press 1 then print "Hello" and if press 2 then print "How are you"
and if press 3 then print "I am fine".*/

public class PrintStatement {
	
	public static void main(String[] args) {
		
		int button;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press any of these number 1,2 and 3");
		button = sc.nextInt();
		
		if(button==1) {
			System.out.println("Hello");
		}else if (button==2) {
			System.out.println("How are you ?");
		}else if (button==3) {
			System.out.println("I am fine ");
		}else {
			System.out.println("Invalid Option");
		}
	}

}
