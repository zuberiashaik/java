package Search;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {-1,3,5,6,9,8};
		boolean res = meth1(arr, 6, 11);
		System.out.println(res);
	}

	private static boolean meth1(int[] arr, int n, int key) {
		
		for (int i=1; i<n; i++) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
		
		
	}

	
}
