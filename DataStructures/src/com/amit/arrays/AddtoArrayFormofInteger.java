package com.amit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,0,0};
		int k = 34;
		
		for(int list: addToArrayForm(num,k)) {
			System.out.print(list +" ");
		}
		

	}
	
    public static List<Integer> addToArrayForm(int[] num, int k) {
    	List<Integer> list = new ArrayList<>();
    	
    	int i= num.length-1;
    	
    	while(i>=0 || k>0) {
    		
    		if(i>=0) {
    			list.add((num[i]+k) % 10);
    			k/= 10; 
    		}
    		
    		else {
    			list.add(k%10);
    			k/= 10;
    		}
    		
    		i--;
    	}
    	
    	Collections.reverse(list);
    	
    	return list;
        
    }

}
