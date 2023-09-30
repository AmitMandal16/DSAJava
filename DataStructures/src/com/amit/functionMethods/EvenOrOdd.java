package com.amit.functionMethods;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the num: ");
		int num = sc.nextInt();
		
	    evenOrOdd(num);
		
		sc.close();
	}
	
	public static void evenOrOdd(int num) {
		
		if(num % 2==0) {
			
			System.out.println("It is a even number");
			
		}
		
		else {
			System.out.println("It is a odd number");
		}
		
	}

}
