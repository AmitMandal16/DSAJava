package com.amit.arrays;

import java.util.Arrays;

public class FirstAndLastPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {5,7,7,8,8,10};
		int target = 8 ;
		
		System.out.println(Arrays.toString(searchRange(nums, target)));

	}
	
	 public static int[] searchRange(int[] nums, int target) {
		 
		 int[] res = {-1, -1};
	        
	        // Search for the start and end indices of the target value.
	        int startval = range(nums, target, true);
	        int endval = range(nums, target, false);

	        // Update the result array with the found indices.
	        res[0] = startval;
	        res[1] = endval;

	        return res;
	        
	    }
	
	 public static int range(int[] nums, int target, boolean findStartIndex) {
		 
		 int start=0;
		 int end= nums.length-1;
		 int mid= (start+end)/2;
		 
		 int result=-1;
		 
		 while(start<=end) {
			 
			 if(nums[mid]== target) {
				 
				 result = mid;
				 
				 if(findStartIndex) {
					 end = mid-1;
				 }
				 else {
					 start = mid+1;
				 }
			 }
			 
			 else if(target > nums[mid]) {
				 start = mid+1;
			 }
			 else {
				 end = mid-1;
			 }
			 
			 mid = (start+end)/2;
		 }
		 
	        return result;
	    }

}
