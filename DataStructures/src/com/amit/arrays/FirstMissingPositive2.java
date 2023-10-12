package com.amit.arrays;

public class FirstMissingPositive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int firstMissingPositive(int[] nums) {
		 int n= nums.length;
		 
		 for(int i=0; i<n; i++) {
			 if(nums[i]<=0 || nums[i]>n) {
				nums[i] = n+1; 
			 }
		 }
		 
		 for(int i=0; i<n; i++) {
			int id = Math.abs(nums[i]);
			
			if(id>n)continue;
			
			id--;
			
			if(nums[id]>0) {
				nums[id]= -nums[id];
			}
		 }
		 
		 return 0;
	 }

}
