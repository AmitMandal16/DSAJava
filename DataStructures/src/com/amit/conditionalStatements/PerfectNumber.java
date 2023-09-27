package com.amit.conditionalStatements;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the no: ");
		int num = sc.nextInt();
		
		int sum=1;		
		for(int i=2; i<num; i++) {
			
			if(num % i == 0) {
				sum = sum+i;
			}
			
		}
		
		if (sum==num) {
			System.out.print("It is a Perfect number ");
		}
		
		else {
			System.out.print("It is not a Perfect number ");
		}
		
		sc.close();
		
	}

}
