package com.amit.arrays;

public class SmallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[]= {8,1,2,2,3};
       
       int num1[]= new int[num.length];
              
       for(int i=0; i<num.length; i++) {
    	   int count=0;
    	   for(int j=0; j<num.length; j++) {
    		   
    		   if(num[i]>num[j] && j!=i) {
    			   count ++;
    		   }    		   
    	   }
    	   
    	   num1[i]= count;
       }
       for(int i: num1) {
    	   System.out.print(i+ " ");
       }
       
	}

}
