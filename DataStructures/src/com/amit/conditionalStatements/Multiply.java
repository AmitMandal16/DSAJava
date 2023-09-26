package com.amit.conditionalStatements;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the no you want to get the table : ");
		
		int num= sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(num+ " * "+i+ " = " +num*i);		
			
		}

		sc.close();
	}

}
