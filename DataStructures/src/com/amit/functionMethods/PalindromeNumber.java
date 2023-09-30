package com.amit.functionMethods;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the num: ");
		int num = sc.nextInt();
		
		boolean palindrome = isPalindrome(num); 
		
		System.out.println("It is a palindrome number : " +palindrome);
		
		sc.close();

	}
	
	public static boolean isPalindrome(int num) {
		
		int original = num;
		int rev=0;
		
		while(num>0) {
			
			int rem = num % 10;
			
			rev= rev*10+rem;
			
			num= num/10;	
			
		}
		
		if(original == rev) {
			System.out.println("rev -> "+rev);
			return true;
		}
		
		else {
			
			return false;
			
		}
	
	}

}
