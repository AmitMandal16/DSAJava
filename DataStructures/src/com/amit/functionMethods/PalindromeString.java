package com.amit.functionMethods;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			
	     System.out.print("Please enter the string : ");
	     
	     String s= sc.next();
	     
	     boolean palindromeString = isPalindromeString(s);
	     
	     System.out.println("Palindrome string : " +palindromeString);
	     
	     sc.close();
	}
	
	public static boolean isPalindromeString(String s) {
		
		String rev="";
		String original = s;
		
		for(int i= s.length()-1; i>=0; i--) {
			
			rev= rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(original.equals(rev)) {
			return true;
		}
		
		return false;
	}

}
