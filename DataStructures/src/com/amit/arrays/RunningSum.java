package com.amit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the length of an array : ");
		int length = sc.nextInt();

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		     int[] array = runningSum(arr);
		     
		     System.out.println(Arrays.toString(array));
		     
      sc.close();
	}
	
	public static int[] runningSum(int[] nums) {
		
		for(int i=1; i<nums.length; i++) {
			
			nums[i]= nums[i]+ nums[i-1];
			
		}
		
		return nums;
	}

}
