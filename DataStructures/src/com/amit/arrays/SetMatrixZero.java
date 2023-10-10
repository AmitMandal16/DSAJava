package com.amit.arrays;

public class SetMatrixZero {
	// brute force solution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
	    
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				 if(matrix[i][j]==0){
				markRow(i, matrix);
				markColumn(j, matrix);
				 }
			}
		}
		//to check whether the matrix is -1, if it is then convert to 0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j]== -1) {
					matrix[i][j]=0;
				}
			}
		}
		//to print
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			
			System.out.println();
		}

	}

	private static void markColumn(int j, int[][] matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.length; i++) {
			 if(matrix[i][j]!=0) {
	            	matrix[i][j]=-1;
				}
		}

	}

	private static void markRow(int i, int[][] matrix) {
		// TODO Auto-generated method stub
		for (int k = 0; k < matrix[0].length; k++) {
            if(matrix[i][k]!=0) {
            	matrix[i][k]=-1;
			}
		}
	}

}
