package com.amit.arrays;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
          
         System.out.println("The sum of matrix diagonal : "+ diagonalSum(mat));
	}
	
	 public static int diagonalSum(int[][] mat) {
		 
		 int length= mat.length;
		 int sum=0;
		 
		 for(int i=0; i<length; i++) {
			 
			 sum= sum + mat[i][i];
			 sum= sum+ mat[i][length-1-i];
			 
		 }
		 
		 if(length %2 !=0) {
			 sum= sum-mat[length/2][length/2];
		 }
		 
		 return sum;
	        
	    }
	 

}
