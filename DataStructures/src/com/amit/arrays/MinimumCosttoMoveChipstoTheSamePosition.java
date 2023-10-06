package com.amit.arrays;

public class MinimumCosttoMoveChipstoTheSamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] position = {2,2,2,3,3};
		
		System.out.println("Minimum cost : "+ minCostToMoveChips(position));
	}
	
	 public static int minCostToMoveChips(int[] position) {
		 
		 int even=0, odd=0;
		 
		 for(int i=0; i<position.length; i++) {
			 
			 if(position[i] %2 ==0) {
				 even++;
			 }
			 
			 else {
			 odd ++;
			 }
		 }
		 
		 return Math.min(even, odd);
	        
	    }

}
