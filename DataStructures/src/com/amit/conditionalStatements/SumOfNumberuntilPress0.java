package com.amit.conditionalStatements;

import java.util.Scanner;

public class SumOfNumberuntilPress0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int sum=0;
		while(true) {
			
			System.out.print("Please enter a number -> ");
			
			int num= sc.nextInt();
			
			if(num!=0) {
				
				sum = sum+num;
			}
			
			else {
				break;
			}
			
		}
		
		System.out.println("Sum of all numbers => "+sum);
		
		sc.close();
	}

}
