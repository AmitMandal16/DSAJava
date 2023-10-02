package com.amit.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter the sentence : ");
		
		String sentence= sc.next();
		
		boolean checkIfPangram = checkIfPangram(sentence);
		
		System.out.println("It is a panagram : "+checkIfPangram);
		
		sc.close();
	}
		
		public static boolean checkIfPangram(String sentence) {
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(int i=0; i<sentence.length(); i++) {
			map.put(sentence.charAt(i), 1);
		}
		
		if(map.size()>=26) {
			return true;
		}
	
		return false;
		
	}

}
