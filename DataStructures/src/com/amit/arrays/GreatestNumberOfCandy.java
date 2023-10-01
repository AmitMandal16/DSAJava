package com.amit.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumberOfCandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the length of an array : ");
		int length = sc.nextInt();

		System.out.print("Please enter the array : ");
		int[] arr = new int[length];
        
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Please enter the no of extra candies : ");
		int extraCandy= sc.nextInt();
		
		     List<Boolean> kidsWithCandy = kidsWithCandy(arr, extraCandy);
		     
		     System.out.println(kidsWithCandy);
		     
      sc.close();

	}
	
	public static List<Boolean> kidsWithCandy(int[] candies, int extracandy){
		
		List<Boolean> list = new ArrayList<>();
		
		int max=0;
		
		for(int i=0; i<candies.length; i++) {
			
			if(max<candies[i]) {			
				max=candies[i];
			}		
		}
		
		for(int i=0; i<candies.length; i++) {
			
			if(candies[i]+extracandy >= max) {
				list.add(true);
			}
			else {
				list.add(false);
			}	
		}
		
		return list;
		
	}

}
