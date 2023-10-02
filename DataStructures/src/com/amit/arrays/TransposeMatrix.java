package com.amit.arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix= {{1,2,3},{4,5,6}};
		
		System.out.println("Before transpose ===========");
		
           for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
				
				System.out.print(matrix[i][j]+ " ");	
			}
			
			System.out.println();
           }
		
		
		
		int[][] transposeMatrix = transposeMatrix(matrix);
		
		System.out.println("After transpose ===========");
		
        for(int i=0; i<transposeMatrix.length; i++) {
			
			for(int j=0; j<transposeMatrix[i].length; j++) {
				System.out.print(transposeMatrix[i][j]+ " ");
			}
			System.out.println();
        }
			

	}

	public static int[][] transposeMatrix(int[][] matrix) {
		
		int column= matrix[0].length;
		int row = matrix.length;

		int[][] z = new int[column][row];

		for (int i = 0; i < column; i++) {

			for (int j = 0; j <row; j++) {

				z[i][j] = matrix[j][i];

			}

		}

		return z;

	}

}
