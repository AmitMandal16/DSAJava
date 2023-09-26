package com.amit.conditionalStatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter the no : ");
		
		int a= sc.nextInt(); //1234
		
		int rev= 0;
		
		while(a>0) {
			
		int rem = a%10;
		
		rev = rev*10+rem;
		
		a= a/10;
			
		}
		
		System.out.println("Reverse: "+rev);
		
		sc.close();
		
	}

}
