package com.amit.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequenceArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {3,9,1,10,4,20,2,5};
		
      System.out.println("Max length of sub array : " +maxSubArray(num));
      
	}
	
	 public static int maxSubArray(int[] nums) {
		 
		 HashSet<Integer> set= new HashSet<>();	
		 
		 for(int i=0; i<nums.length; i++) {
			 set.add(nums[i]);
		 }
		 
		 int long_length=0;
		 
		// int a[] = new int[long_length];
		 
		 for(int i=0; i<nums.length; i++) {
			 if(!set.contains(nums[i]-1)) {
				
				 int no= nums[i];
				 
				 while(set.contains(no)) {				
					 no++;
				 }
				 
				 if(long_length< no-nums[i]) {
					 
					 long_length= no-nums[i];
				 }
			 }
		 }
		// System.out.println(long_length);
		 
	        return long_length;
	    }

}
