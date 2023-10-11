package com.amit.arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[] = {1,2,3,4,5,6,7};
       int n= num.length;
       int k=3;
       
       flip(num, 0, n-1);
       flip(num, 0, k-1);
       flip(num, k, n-1);
    
       System.out.print(Arrays.toString(num));
	}
	
	public static void flip(int[] num, int s, int e) {
		
		while(s<e) {
			int temp= num[s];
			num[s] = num[e];
			num[e] = temp;
			
			s++;
			e--;
		}
		
	}

}
