package com.amit.conditionalStatements;

import java.util.Scanner;

public class SumOfNoUntilPressQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		String choice="";
		
		while(!choice.equals("q")) {
			
			System.out.println("Please enter the no or q to quit : ");
			
			 choice= sc.next();
			
			if(!choice.equals("q")) {
				
				int num = Integer.parseInt(choice);
				
		     	sum = sum + num;	
			
			}
		}
		
		System.out.println("Sum of entered number -> "+ sum);
		
		sc.close();
		
	}

}
