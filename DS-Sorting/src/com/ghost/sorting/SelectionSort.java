package com.ghost.sorting;

public class SelectionSort {
	
	
	// 0(n^2)
	public static void main(String[] args) {
	//	int array[] = {1,5,4,3,6,3,1,2,1,2,1};
		int array[] = { 1, 14, 2, 4, 90, 65, 12, 2, 6 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				
				if(array[i] >= array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}	
			}	
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
