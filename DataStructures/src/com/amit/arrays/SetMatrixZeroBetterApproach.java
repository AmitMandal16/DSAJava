package com.amit.arrays;

public class SetMatrixZeroBetterApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		 
		 int r= matrix.length;
		 int c = matrix[0].length;
		 
		 int row[] = new int[r];
		 int col[] = new int[c];
		 
		 for(int i=0; i<r; i++) {
			 
			 for(int j=0; j<c; j++) {
				 
				 if(matrix[i][j] == 0) {
					 row[i] = 1;
					 col[j] = 1;
				 } 
			 } 
		 }
		 
           for(int i=0; i<r; i++) {
		 
			 for(int j=0; j<c; j++) {
				 
				 if(row[i] == 1 || col[j] == 1 ) {
					 matrix[i][j] = 0;
				 }			 
			 }
			 
         }
           
           for(int i=0; i<r; i++) {
      		 
  			 for(int j=0; j<c; j++) {
  				System.out.print(matrix[i][j]+ " ");		 
  			 }
  			 System.out.println();
           }
		 
	}

}
