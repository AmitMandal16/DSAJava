package com.amit.arrays;

public class GoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a = {1,2,3,1,1,3};
      int count =0;
      
      for(int i=0; i<a.length; i++) {
    	  
    	  for(int j=0; j<a.length; j++) {
    		  
    		  if(a[i]==a[j] && i<j) {
    			  count++;
    		  }
    	  }	  
      }
      
      System.out.println("No of good Pairs : "+count);
	}

}
