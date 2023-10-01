package com.amit.arrays;

import java.util.Scanner;

public class BuildPermutationArray {
//brute force approach
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the length of an array : ");
		int length= sc.nextInt();
		
		int[] arr= new int[length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] input = arrayPerm(arr);
		
		//System.out.println(Arrays.toString(input));
		
		for(int i: input) {
			
			System.out.print(i+ " ");
			
		}
		
		sc.close();

	}
	
	public static int[] arrayPerm(int[] num) {
		
		int[] ans = new int[num.length];
		
		for(int i=0; i<num.length; i++) {
			
			ans[i]= num[num[i]];
			
		}
		
		return ans;
	}

}



