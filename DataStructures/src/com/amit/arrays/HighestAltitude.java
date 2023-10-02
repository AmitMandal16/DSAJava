package com.amit.arrays;

import java.util.Scanner;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter the length of an array : ");
		int length= sc.nextInt();
		
		int arr[]= new int[length];
		
		for(int i=0; i<length; i++) {
			
			arr[i]= sc.nextInt();
			
		}
		
		int largestAltitude = largestAltitude(arr);
		
		System.out.println("Highest altitude : " +largestAltitude);
		
		sc.close();
	}

	 public static int largestAltitude(int[] gain) {
		 
		 int max=0;
		 int current=0;
		 
		 for(int i=0; i<gain.length; i++) {
			 
			 current = current + gain[i];
			 max = Math.max(current, max);
			 
		 }

		 return max;
	        
	    }
}
