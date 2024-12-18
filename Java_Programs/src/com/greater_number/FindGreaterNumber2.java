package com.greater_number;

public class FindGreaterNumber2 {
	
	public static void main(String[] args) {
		int a=10, b=20, c=30;
		
		if(a>b && a>c){
			System.out.println("A is greater number");
		}
		else if(b>a && b>c){
			System.out.println("B is greater number");
		}
		else{
			System.out.println("C is greater number");
		}
	}

}
