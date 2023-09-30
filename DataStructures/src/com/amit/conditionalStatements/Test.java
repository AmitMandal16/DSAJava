package com.amit.conditionalStatements;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10, b=20;
        
		swap(a,b);
		
		System.out.println(a+" , "+b);
	}
	
	static void swap(int num1, int num2) {
		int temp= num1;
		num1=num2;
		num2=temp;
		
		System.out.println(num1+ " "+num2);
	}

}
