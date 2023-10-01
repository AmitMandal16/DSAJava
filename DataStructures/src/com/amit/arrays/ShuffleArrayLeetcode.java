package com.amit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArrayLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the length of an array : ");
		int length = sc.nextInt();

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		     int[] array = shuffle(length/2,arr);
		     
		     System.out.println(Arrays.toString(array));
		     
      sc.close();
	}
	
	public static int[] shuffle(int n, int[] num) {
		int[] result= new int[num.length];
		
		for(int i=0; i<num.length; i++) {
			
			if(i%2 == 0) {
				result[i]= num[i/2];
			}
			else {
				result[i]= num[n+i/2];
			}
			
		}
		
		return result;
	}

}
