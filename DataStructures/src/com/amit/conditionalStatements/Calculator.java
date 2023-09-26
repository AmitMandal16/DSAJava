package com.amit.conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        
        while(true) {
        	
        	System.out.println("Please enter the operation: ");
        	
        	char op = sc.next().trim().charAt(0);
        	int ans = 0;
        	if(op =='+' || op =='-' || op =='*' || op =='/' || op =='%') {
        		
        		int num1= sc.nextInt();
        		int num2= sc.nextInt();
        		
        		if(op =='+') {
        			ans = num1 + num2;
        		}
        		
        		if(op =='-') {
        			ans = num1 - num2;
        		}
        		
        		if(op =='*') {
        			ans = num1 * num2;
        		}
        		
        		if(op =='/') {
        			
        			if(num2 !=0) {
        			ans = num1 / num2;
        			}
        			
        		}
        		
        		if(op =='%') {
        			ans = num1 % num2;
        		}
        		
        	}
        	else if(op== 'x' || op== 'X') {
        	      break;
        	}
        	
        	else {
        		System.out.println("Invalid Operator..");
        	}
        	
        	System.out.println("Result:" +ans);
        	
        }
        
        sc.close();
	}

}
