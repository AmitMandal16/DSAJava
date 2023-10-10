package com.amit.arrays;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};   
		int[] ans = new int[arr.length];
		
		int[] right = new int[arr.length];
		                                    //     1 2 6
		int[] left = new int[arr.length];  //    0 1 2 3 
		                                   //        
		left[0] = 1;
		for(int i=1; i<arr.length; i++) {
			left[i]= left[i-1] * arr[i-1];
		}
		
		right[arr.length-1]=1;
		for(int i= arr.length-2; i>-1; i--) {
			right[i]= right[i+1] * arr[i+1];
		}
		
		for(int i=0; i<arr.length; i++) {
			ans[i] = right[i] * left[i];
		}
		
		for(int a: ans) {
			System.out.print(a+ "  ");
		}

	}
	
}
