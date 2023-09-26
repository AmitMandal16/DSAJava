package com.amit.conditionalStatements;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1, temp;
		
		int n=10;
		
		System.out.print(a+ " , "+b);
		
		for(int i=2; i<=n; i++) {
			
		   temp = a+b;
		   System.out.print(" , "+temp);
		   a = b;
		   b = temp;
		   
		   		
		}
		

	}

}
