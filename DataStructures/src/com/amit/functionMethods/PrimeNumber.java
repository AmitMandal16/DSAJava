package com.amit.functionMethods;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the num: ");
		int num = sc.nextInt();
		
		boolean primeNumber = isPrimeNumber(num);
		
		System.out.println("It is a prime number : " +primeNumber);

      sc.close();
	}
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		int c=2;
		
		while(c*c < num) {
			
			if(num % c==0) {
				return false;
			}
			
			c++;	
		}
		
		return true;
	}

}
