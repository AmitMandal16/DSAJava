package com.amit.arrays;

public class SprialMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=3;
      
      int arr[][]= new int[n][n];
      
      int top=0, bottom = n-1;
      int left=0, right = n-1;
      int count=1;
      
      while(top<=bottom && left<=right) {
    	  
    	  for(int i=left; i<=right; i++) {
    		  arr[top][i]= count++;
    	  }
    	  top++;
    	  
    	  for(int i=top; i<=bottom; i++) {
    		  arr[i][right]= count++;
    	  }
    	  right--;
    	  
    	  if(top <= bottom) {
    	  for(int i=right; i>=left; i--) {
    		  arr[bottom][i]= count++;
    	  }
    	  bottom--;
    	  }
    	  
    	  if(left <= right) {
    	  for(int i=bottom; i>=top; i--) {
    		  arr[i][left]= count++;
    	  }
    	  left++;
    	  }
      }
      
      //to print all the element
      for(int i=0; i<arr.length; i++) {
    	  for(int j=0; j<arr[0].length; j++) {
    		  
    		  System.out.print(arr[i][j]+ " ");
    	  }
      }
      
	}

}
