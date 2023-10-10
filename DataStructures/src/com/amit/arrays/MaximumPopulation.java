package com.amit.arrays;

public class MaximumPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
		
		System.out.println(maximumPopulation(logs));
	}

	public static int maximumPopulation(int[][] logs) {
		
		int[] arr= new int[101];
		
		for(int i=0; i<logs.length; i++) {
			
			for(int j=logs[i][0]; j< logs[i][1]; j++) {
				arr[j-1950]++;
			}	
		}
		
		int maxValue=0;
		int maxYear=1950;
		
		for(int i=0; i<101; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
				maxYear = i+1950;
			}
		}
		
        return maxYear;
	}

}
