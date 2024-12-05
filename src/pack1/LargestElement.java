package pack1;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34, 10};
		int max = arr[0];
		for(int i=0; i<=arr.length-1; i++) {
			if (arr[i]>=max) {
				max = arr[i];
			}
		}
		System.out.println("Largest Element of array: " + max);
		int min =arr[0];
		for (int i=0; i<=arr.length-1; i++) {
			if(arr[i]<=min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Element of Array: " + min);
	}

}
