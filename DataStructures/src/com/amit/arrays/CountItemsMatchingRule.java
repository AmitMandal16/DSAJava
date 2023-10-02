package com.amit.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		List<List<String>> listOfLists= new ArrayList<>();
		
		System.out.print("Please enter the no of list : ");
		int num= sc.nextInt();
		
		for(int i=0; i<num; i++) {
			
			List<String> item = new ArrayList<>();
			
			System.out.print("Enter the no of values in list : ");
			int valuesInList= sc.nextInt();
			
			for(int j=0; j<valuesInList; j++) {
				System.out.print("Enter the values : ");
				String value= sc.next();
				item.add(value);			
			}
			
			listOfLists.add((ArrayList<String>) item);
		}
			
		String rulekey="", ruleValue=""; 
		
		int countMatches = countMatches(listOfLists, rulekey, ruleValue);
		
		System.out.println("No of counts: " +countMatches);
		
		sc.close();
		
	}
	
	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		 
		 int count=0;
		 
		for(int i=0; i<items.size(); i++) {
			
			if(ruleKey.matches("type")&& items.get(i).get(0).equals(ruleValue)) {
				count ++;
			}
			
			if(ruleKey.matches("color")&& items.get(i).get(1).equals(ruleValue)) {
				count ++;
			}
			
			if(ruleKey.matches("name")&& items.get(i).get(2).equals(ruleValue)) {
				count ++;
			}
		}
		
		return count;
	        
	    }

}
