package pack1;

import java.util.Arrays;

public class AscendingAndDescendingOrder {

	public static void main(String[] args) {
		int arr[] = {1,90,34,89,7,9,10};
		int n= arr.length-1;
		Arrays.sort(arr); 
		for(int i=0; i<n/2;i++) {
			System.out.print(arr[i] + " ");
		}
		for(int j=n-1; j>n/2; j--) {
			System.out.print(arr[j] + " ");
		}
		
	}

}



/*OUTPUT:
1 7 9 89 34


*/