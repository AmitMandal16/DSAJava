package com.amit.conditionalStatements;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the String: ");
		
		String word= sc.next();
		
		String temp = word;
		
		String rev = "";
		
		for(int i= word.length()-1; i>=0; i--) {
			rev = rev + word.charAt(i);
		}
		
		if (temp.equals(rev)) {
			
			System.out.println("It is a palindrome..");
			
		}
		
		else {
			System.out.println("It is not a palindrome.. ");
		}
		
		sc.close();
	}

}
