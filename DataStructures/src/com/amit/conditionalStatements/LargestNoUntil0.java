package com.amit.conditionalStatements;

import java.util.Scanner;

public class LargestNoUntil0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int largest=0;
		while(true) {
			
			System.out.print("Please enter a number -> ");
			
			int num= sc.nextInt();
			
			if(num!=0) {
				
				if(num>largest) {
					largest=num;
				}
			}
			
			else {
				break;
			}
			
		}
		
		System.out.println("Largest no => "+largest);
		
		sc.close();

	}

}
