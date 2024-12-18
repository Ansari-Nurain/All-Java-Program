
// write a java program to print the ststemant like --- To input the 'hello' and give output 'hello'

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		String s ;
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.println(s);
	}

}
