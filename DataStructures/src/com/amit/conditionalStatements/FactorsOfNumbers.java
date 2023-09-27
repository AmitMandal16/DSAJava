package com.amit.conditionalStatements;

import java.util.Scanner;

public class FactorsOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the no -> ");
		
		int num= sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if(num % i==0) {
				System.out.print(i+ " , ");
			}
			
		}
		
		sc.close();
	}

}
