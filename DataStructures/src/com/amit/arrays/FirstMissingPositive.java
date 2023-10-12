package com.amit.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int firstMissingPositive(int[] nums) {
		 
		 Set<Integer> set = new HashSet<>();
		 
		 for(int element: nums) {
			 set.add(element);
		 }
		 
		 for(int i=1; i<=nums.length; i++) {
			 
			 if(!set.contains(i)) {
				 return i;
			 }
			 
		 }
		 
		 return nums.length+1;
	        
	    }

}
