package com.ghost.sorting;

public class InsertionSort {

	// 0(n^2)
	public static void main(String[] args) {

		int array[] = {3,14,2,7,6};

		for (int i = 1; i < array.length ; i++) {

			int value = array[i];
			int index = i ;

			while (index > 0 && array[index - 1] > value) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = value;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
