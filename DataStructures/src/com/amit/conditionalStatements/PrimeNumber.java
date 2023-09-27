package com.amit.conditionalStatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the no: ");
		int num = sc.nextInt();
		int temp=0;
		
		for(int i=2; i<num; i++) {
			if(num%i ==0) {
				temp = temp + 1;
			}
		}
		
		if(temp>0) {
			System.out.print("It is not a prime number");
		}
		else {
			System.out.print("It is a prime number");
		}
		
		sc.close();
	}

}
