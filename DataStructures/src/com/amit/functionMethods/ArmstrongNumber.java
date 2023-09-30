package com.amit.functionMethods;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      for(int i=100; i<1000; i++) {
    	  
    	  if (armstrongNumber(i)) {
    		  
    		  System.out.print(i+ "  ");
    	  }
      }
      
	}
	
	public static boolean armstrongNumber(int num) {
		
		int sum=0, prod=0;
		int original= num;
		
		while(num>0) {
		   
			int rem= num %10;
			num= num/10;
			prod= rem * rem * rem;
			sum = sum+ prod;
		}
		
		if(original == sum) {
			
			return true;
			
		}
		
		return false;
	}

}
