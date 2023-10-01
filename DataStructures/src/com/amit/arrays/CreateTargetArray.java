package com.amit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index[]= {0,1,2,2,1};
		int arr[]= {0,1,2,3,4};
		int[] target = new int[arr.length];
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(index[i], arr[i]);
		}
		
		for(int i=0; i<list.size(); i++) {
			target[i]= list.get(i);
		}
		
		System.out.println(Arrays.toString(target));

	}

}
