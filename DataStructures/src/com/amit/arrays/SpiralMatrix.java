package com.amit.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		
		List<Integer> list= new ArrayList<>();
		
		int row = mat.length;
		int col = mat[0].length;
		
		int left = 0, right = col-1;
		int top = 0, bottom = row-1;
		
		while(top<=bottom && left<=right) {
			
			for(int i=left; i<=right; i++) {
				list.add(mat[top][i]);
			}
			top++;
		
		for(int i=top; i<=bottom; i++) {
			list.add(mat[i][right]);
		}
		right--;
		
		if(top<=bottom) 
		for(int i=right; i>=left; i--) {
			list.add(mat[bottom][i]);
		}
		bottom--;
		
		
		if(left<=right)
		for(int i=bottom; i>=top; i--) {
			list.add(mat[i][left]);
		}
		
		left++;
	
	}
	
	for(Integer arr: list) {
		
		System.out.print(arr+ " ");
		
	}
		
	}

}
