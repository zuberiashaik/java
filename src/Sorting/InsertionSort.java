package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {1,3,7,9,16,5};
		int n = arr.length;
		for (int i=1; i<n; i++) {
			int j;
			for ( j=i-1; j>=0; j--) {
				if (arr[i]<arr[j]) {
					arr[j+1]= arr[j];
				} else
					break;
			}
			arr[j+1] = arr[i];
		}
		System.out.print(Arrays.toString(arr));
	}

}
