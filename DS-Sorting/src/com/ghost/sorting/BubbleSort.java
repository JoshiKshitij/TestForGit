package com.ghost.sorting;

public class BubbleSort {

	// 0(n^2)
	public static void main(String[] args) {
		
		int array[] = { 1, 14, 2, 4, 90, 65, 12, 2, 6 };

		for (int i = 0; i < array.length - 1; i++) {

			boolean flag = false;
			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = true;
				}
			}
			if(!flag) break;
			
			
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
