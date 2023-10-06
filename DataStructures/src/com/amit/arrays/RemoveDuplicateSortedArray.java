package com.amit.arrays;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  int a[]= {0,0,1,1,1,2,2,3,3,4};
        
        int a[]= {1,1,2};
          	
        	//System.out.println(removeDuplicates(a));
        	
        	
        	 int[] temp= new int[a.length];
    		 int j=0;
    		 for(int i=0; i<a.length-1; i++) {
    			 
    			 if(a[i]!= a[i+1]) {
    				 temp[j] = a[i];
    				 j++;
    			 }
    			 
    		 }
    		 
    		 temp[j]= a[a.length-1];
    		 
    		 for(int arr: temp) {
    			 
    			 System.out.print(arr+ " ");
    		 }
	}
	
}
