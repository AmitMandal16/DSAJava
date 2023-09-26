package com.amit.conditionalStatements;

public class NoOfOccurence {
	
	public static void main(String[] args) {
		
		int no = 1234522; 
		int c=2, i=0; // count the occurrence of 2 
				
		while(no>0) {
			
			int rem = no % 10;
			
			if(rem == c) {
				
			i= i+1;
				
			}			
			no = no/10;
		}
		
		System.out.println("No of occurence of 2 -> "+i);
	}

}
