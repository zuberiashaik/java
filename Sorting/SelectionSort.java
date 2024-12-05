package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {3,5,1,-7,5};
		int n= arr.length;
		for (int i=0; i<n-1; i++) {
			int minIndex = i;
			for (int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.print(Arrays.toString(arr));

	}

}
