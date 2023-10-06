package com.amit.arrays;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
      
      System.out.println("Max sum: " +maxSubArray(nums));
      
	}
	
	 public static int maxSubArray(int[] nums) {
		 
		 int max_so_far= Integer.MIN_VALUE;
		 int current= 0, s=0, si=0, ei=0;
		 
		 for(int i=0; i<nums.length; i++) {
			 
			 current= current + nums[i];
			 
			 if(max_so_far < current) {
				 max_so_far= current;
				 
				 si= s; ei=i;
			 }
			 
			 if(current<0) {
				 current=0; 
				 s= i+1;
			 }
			 
		 }
		 System.out.println(si+" , "+ei);
		 
		 return max_so_far;
	        
	    }

}
