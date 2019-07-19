package com.ghost.sorting;

import java.util.Arrays;

public class MergeSort1 {

	// the concept of divide and conquer will be used here

	// divide the input array into two and keep on dividing them until each array
	// becomes a single unit

	static void divide(int input[]) {

		if (input.length < 2) {
			return;
		}

		// STORE IN TWO ARRAYS
		int mid = input.length / 2;
		// left side
		int[] leftSideArray = new int[mid];
		for (int i = 0; i < leftSideArray.length; i++) {
			leftSideArray[i] = input[i];
		}

		// right side
		int[] rightSideArray = new int[input.length - mid];
		for (int i = 0; i < rightSideArray.length; i++) {
			rightSideArray[i] = input[i+mid];
		}
		
		divide(leftSideArray);
		divide(rightSideArray);
		mergeArray(leftSideArray, rightSideArray, input);
		
		
	}

	// compare and merge the 2 elements 
	static void mergeArray(int leftArray[], int rightArray[], int input[]) {

		int i =0, j =0, k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if(leftArray[i]  < rightArray[j]) {
				input[k] = leftArray[i];
				i++;
				k++;
			}
			else {
				input[k] = rightArray[j];
				k++;
				j++;
			}
		}
		

		while (i < leftArray.length) {
			input[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightArray.length) {
			input[k] = rightArray[j];
			k++;
			j++;
		}

	}

	public static void main(String[] args) {

		int array[] = { 1, 14, 2, 4, 90, 65, 12, 2, 6 };

		System.out.println(Arrays.toString(array));
		
		divide(array);
		
		System.out.println(Arrays.toString(array));
		
	}
}
