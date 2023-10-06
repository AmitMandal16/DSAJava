package com.amit.arrays;

public class ReshapeTheMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2 }, { 3, 4 } };

		int r = 1, c = 4;
		
		matrixReshape(mat, r, c);
	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {

		int row = mat.length;
		int column = mat[0].length;

		int[][] output_arr = new int[r][c];

		if (row * column != r * c) {
			return mat;
		}

		for (int i = 0; i < r * c; i++) {

			output_arr[i / c][i % c] = mat[i / column][i % column];

		}

		return output_arr;

	}

}
