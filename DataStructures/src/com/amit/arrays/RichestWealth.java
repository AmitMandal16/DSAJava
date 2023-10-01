package com.amit.arrays;

import java.util.Scanner;

public class RichestWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int m= sc.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int n= sc.nextInt();
		
		int[][] input= new int[m][n];
		
		for(int i=0; i<input.length; i++) {
			
			for(int j=0; j<input[i].length; j++) {
			  
				 input[i][j]= sc.nextInt();
			}
			
		}
		
		   int richestWealth = richestWealth(input);
		   
		   System.out.println("Richest Wealth -> "+richestWealth);
		
		sc.close();
	}
	
	public static int richestWealth(int[][] arr) {
		
		int max= Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			int sum=0;
			
			for(int j=0; j<arr[i].length; j++) {
				sum= arr[i][j]+sum;
			}
			
			if(max<sum || max == sum) {
				max= sum;
			}
			
		}
		
		return max;
	}

}
