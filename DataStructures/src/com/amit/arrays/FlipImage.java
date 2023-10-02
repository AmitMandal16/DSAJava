package com.amit.arrays;

public class FlipImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		int[][] flipAndInvertImage = flipAndInvertImage(a);

		for (int[] i : flipAndInvertImage) {

			System.out.print(i + " ");

		}

	}

	public static int[][] flipAndInvertImage(int[][] image) {

		for (int[] rev : image) {
			reverse(rev);
			flip(rev);
		}

		return image;

	}

	public static void reverse(int[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {

			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

			start++;
			end--;

		}

	}

	public static void flip(int[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] == 1 ? 0 : 1;
		}

	}

}
