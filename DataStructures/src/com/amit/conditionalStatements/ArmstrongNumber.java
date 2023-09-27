package com.amit.conditionalStatements;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=144;
		
		int t1= num;
		int length=0; 
		int t2=num;
		
		// to find out the length of the number
		while(t1!=0) {
			
			t1= t1/10;
			length= length+1;
			
		}
		
		int arm=0;
		// to find the last digit and multiply them to find the no is Armstrong or not
		while(t2!=0) {
			
			t2 = t2%10;
			
			int multiply=1;
			
			for(int i=1; i<=length; i++) {
				
				multiply= multiply*t2;
			}
			
			arm= arm+multiply;
			t2=t2/10;
		}
		
		if(num==arm) {
			System.out.println("It is a armstrong number");
		}
		else {
			System.out.println("It is not a armstrong number");
		}
	}

}
