package com.amit.functionMethods;

import java.util.Scanner;

public class GradeCalulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number of subjects: ");
		int count = sc.nextInt();

		float totalMarks = 0, percentage;

		System.out.print("Please enter the marks of subjects : ");

		for (int i = 0; i < count; i++) {

			totalMarks = totalMarks + sc.nextInt();

		}

		System.out.println("Total marks of student : " + totalMarks);

		percentage = (totalMarks / (count * 100)) * 100;

		System.out.println("Percentage : " + percentage);

		String grade = grade(percentage);

		System.out.println("Grade of student : " + grade);

		sc.close();
	}

	public static String grade(float percentage) {

		percentage = percentage / 10;

		switch ((int) percentage) {

		case 9:
			return "A+";

		case 8:
			return "A";

		case 7:
			return "B";

		case 6:
			return "C";

		case 5:
			return "D";

		case 4:

			return "E";

		default:
			return "F";

		}

	}

}
