package com.amit.arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int[][]matrix= {{3,7,8},{9,11,13},{15,16,17}};
	   for(Integer no  : luckyNumbers(matrix)) {
		   System.out.println("Lucky No: "+no);
	   }

	}

	public static List<Integer> luckyNumbers(int[][] matrix) {
		
		List<Integer> list= new ArrayList<>();
		
		for(int i=0; i<matrix.length; i++) {
			
			int luckyNo = Integer.MAX_VALUE;
			int c=0;
			
			for(int j=0; j<matrix[i].length; j++) {
				
				if(luckyNo > matrix[i][j]) {	
					
					luckyNo = matrix[i][j]; // will give small value in the row
					
					c = j;
				}
				
			}
			
			boolean istrue=true;
			
			for(int k=0; k<matrix.length; k++) {
				
				if(matrix[i][c]<matrix[k][c]) {
					istrue=false;
					break;
				}
				
			}
			
			if(istrue) {
				list.add(matrix[i][c]);
			}
			
		}
		
		return list;
		
        
	}

}
