package com.ghost.sorting;

import java.util.Arrays;

public class MergeSort2 {

	// the concept of divide and conquer will be used here

	// divide the input array into two and keep on dividing them until each array
	// becomes a single unit

	static void divide(int input[], int low, int high) {


	}

	// compare and merge the 2 elements
	static void mergeArray(int input[], int low, int mid, int high) {
		
		
	}

	public static void main(String[] args) {

		int array[] = { 1, 14, 2, 4, 90, 65, 12, 2, 6 };
		System.out.println(Arrays.toString(array));
		divide(array, 0, array.length);
		System.out.println(Arrays.toString(array));
	}
}
