package com.amit.arrays;

public class JumpGame {
	
      public static void main(String[] args) {
		int[] a= {2,0,0,1,4};
		
		int finalPos= a.length-1;
		
		for(int i= a.length-2; i>=0; i--) {
			
			if(a[i]+i >=finalPos) {
				finalPos=i;
			}
			
		}
		
		if(finalPos==0) {
			System.out.println("Reachable...");
		}
		else {
			System.out.println("not reachable..");
		}
		
		
	}
}
