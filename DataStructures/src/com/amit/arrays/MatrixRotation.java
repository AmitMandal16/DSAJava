package com.amit.arrays;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]= {{0,0,0},{0,1,0},{1,1,1}};
		int target[][]= {{1,1,1},{0,1,0},{0,0,0}};
		
		System.out.println(findRotation(mat, target));
	}
	
    public static boolean findRotation(int[][] mat, int[][] target) {
    	for(int i=0; i<4; i++) {
    	
    	if(same(mat, target)) {
    		return true;
    	}
    	
    	mat= rotate(mat);
    	}
    	
    	return false;
        
    }

	private static boolean same(int[][] mat, int[][] target) {
		// TODO Auto-generated method stub
		if((mat.length== target.length) && (mat[0].length== target[0].length)) {
			
			for(int i=0; i<mat.length; i++) {
				
				for(int j=0; j<mat[0].length; j++) {
					
					if(mat[i][j]!=target[i][j]) {
						return false;
					}
					
				}		
			}
			
		}
		return true;
	}

	private static int[][] rotate(int[][] mat) {
		// TODO Auto-generated method stub
		
		int n= mat.length;
		int m= mat[0].length;
		
		int b[][]= new int[m][n];
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				b[j][n-i-1] = mat[i][j];
				
			}		
		}
		
		return b;
	}

}
