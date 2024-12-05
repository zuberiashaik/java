package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {3,10,8,2,7,-5,1,3,4,9};
		int low = 0;
		int high = arr.length-1;
	    ms(arr,low,high);
	    System.out.println(Arrays.toString(arr));
		
	}

	private static void ms(int[] arr, int low, int high) {
		if(low==high)
			return;
			int mid=(low+high)/2;
			ms(arr,low,mid);
			ms(arr,mid+1,high);
			merge(arr,low,high);
			
		}
		
	
	
	private static void merge(int[] arr, int low, int high) {
		int mid = (low+high)/2;
		int p1 = low;
		int p2=mid+1;
		int c[] =new int[high-low+1];
		int idx = 0;
		while(p1<=mid && p2<=high) {
			if (arr[p1]<arr[p2]) {
				c[idx++] = arr[p1++];
			} else {
				c[idx++] = arr[p2++];
			}
			while(p1<=mid) {
				c[idx++] = arr[p1++];
			}
			while(p2<=high) {
				c[idx++] = arr[p2++];
			}
			for (int i=0; i<c.length; i++) {
				arr[low+i] = c[i];
			}
		}
		
	}
}
	
