package com.amit.arrays;

public class EvenNoOfDigitsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,345,2,6,7896};
		
		System.out.println("Even number of digts : " +findEvenNumberDigit(arr));

	}
	
	public static int findEvenNumberDigit(int arr[]) {
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			int count1 = 0;
			while(arr[i]>0) {
				arr[i]= arr[i]/10;
				count1 ++;
			}
			
			if(count1 % 2 ==0) {
				count ++;
			}
			
		}
		
		return count;
		
	}

}
