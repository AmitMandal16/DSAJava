package com.amit.conditionalStatements;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the no: ");
		
		int num= sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("It is a even number");
		}
		
		else {
			System.out.println("It is a odd number ");
		}
		
		sc.close();
	}

}
