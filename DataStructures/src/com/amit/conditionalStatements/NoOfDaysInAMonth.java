package com.amit.conditionalStatements;

import java.util.Scanner;

public class NoOfDaysInAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the month -> ");
		int month= sc.nextInt();
		
		System.out.print("Please enter the year -> ");
		int year = sc.nextInt();
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ) {
			System.out.print("No of days in a month = 31 ");	
		}
		
		else if((month == 2) && ((year % 4==0 && year %100!=0) || (year % 400 ==0))) {
			System.out.print("No of days in a month = 29 ");
		}
		
		else if(month == 2) {
			System.out.print("No of days in a month = 28 ");
		}
		
		else {
			System.out.print("No of days in a month = 30 ");
		}
		
		sc.close();
	}

}
