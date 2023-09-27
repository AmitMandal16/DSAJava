package com.amit.conditionalStatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the no: ");
		
		int num= sc.nextInt();
	    int rev=0, rem=0;
	    
	    int tem= num;
	    
	   while(num>0) {
		   
		   rem = num % 10;
		   
		   rev= rev*10+rem;
		   
		   num=num/10;
		   
	   }
	   
	   System.out.println("Reverse of the num -> "+rev);
	   
	   if (tem == rev) {
		   System.out.println("It is a Palindrome number");
	   }
	   
	   else {
		   System.out.println("It is not a Palindrome number");
	   }
	   
	   sc.close();
	    
	}

}
