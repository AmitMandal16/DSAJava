package com.amit.conditionalStatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the no : ");
		
		int num = sc.nextInt();
		int factorial=1;
		
		for(int i=1; i<=num; i++) {
			
			factorial= factorial * i;
			
		}
		
		System.out.print("Factorial of number "+num+ " = "+factorial);
		
		sc.close();
	}
}
