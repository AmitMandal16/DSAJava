package com.amit.conditionalStatements;

import java.util.Scanner;

public class LCM_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the first no: ");
		int n1 = sc.nextInt();
		
		System.out.println("Please enter the second no: ");
        int n2 = sc.nextInt();
        
        int hcf=1;
        
        for(int i=1; i<=n1&& i<=n2 ; i++) {
        	
        	if(n1 % i==0 && n2 % i==0) {
        		hcf=i;
        	}
        }
        
        System.out.println("HCM of both no -> "+hcf);
        System.out.println("LCM of both no -> "+(n1*n2)/hcf);
        
        sc.close();
	}

}
