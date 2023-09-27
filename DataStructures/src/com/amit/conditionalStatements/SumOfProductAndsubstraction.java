package com.amit.conditionalStatements;


/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.
		 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15*/

public class SumOfProductAndsubstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=234;
		int prod=1, sum=0;
		int rem=0;
		//this is to find the prod and sum
		while(n>0) {
			
			rem= n%10;
			prod= prod *rem;
			sum= sum + rem;
			n=n/10;
			
		}
		
		System.out.println("Product of number -> "+prod);
		System.out.println("Sum of number -> "+sum);
		
		System.out.println("Result -> " +(prod-sum));

	}

}
