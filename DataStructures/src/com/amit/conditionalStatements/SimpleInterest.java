package com.amit.conditionalStatements;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the principal: ");		
		int principal = sc.nextInt();
		
		System.out.println("Please enter the rate per annum: ");
		int rate = sc.nextInt();
		
		System.out.println("Please enter the time in years: ");
		int time = sc.nextInt();
		
		double SimpleIntrest = (principal*rate*time)/100;
		
		System.out.println("SimpleIntrest -> "+ SimpleIntrest);
		
		sc.close();

	}

}
