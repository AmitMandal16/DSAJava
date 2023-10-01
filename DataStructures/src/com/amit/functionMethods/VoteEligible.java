package com.amit.functionMethods;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the num: ");
		int age = sc.nextInt();
		
		boolean eligibleForVote = eligibleForVote(age);
		
		System.out.println("Person is eligible for vote : " +eligibleForVote);
		
		sc.close();

	}

	public static boolean eligibleForVote(int age) {

		if (age >= 18) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
