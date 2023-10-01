package com.amit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the length of an array : ");
		int length = sc.nextInt();

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		     int[] array = concatArray(arr);
		     
		     System.out.println(Arrays.toString(array));
		
		
		sc.close();

	}
	
	static int[] concatArray(int[] arr) {
		
		int[] newArr= new int[2*arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			newArr[i]= arr[i];
			newArr[i+arr.length] = arr[i];
		}	
		
		return newArr;
		
	}

}
