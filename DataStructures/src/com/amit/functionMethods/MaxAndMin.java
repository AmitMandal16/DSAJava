package com.amit.functionMethods;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the first num: ");
		int num1 = sc.nextInt();

		System.out.print("Please enter the second num: ");
		int num2 = sc.nextInt();

		System.out.print("Please enter the third num: ");
		int num3 = sc.nextInt();

		System.out.println("Max number in all three -> " + maxNumber(num1, num2, num3));
		
		System.out.println("Min number in all three -> " + minNumber(num1, num2, num3));

		sc.close();
	}

	public static int maxNumber(int num1, int num2, int num3) {

		int max = num1;

		if (num2 > max) {
			max = num2;
		}

		if (num3 > max) {
			max = num3;
		}

		return max;
	}

	public static int minNumber(int num1, int num2, int num3) {

		int min = num1;

		if (num2 < min) {
			min = num2;
		}

		if (num3 < min) {
			min = num2;
		}

		return min;
	}

}
