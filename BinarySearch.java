package Search;

public class BinarySearch {

	public static void main(String[] args) {
		int ar[] = {-1,-4,5,10,15,20,25,30,35};
		boolean res = bs(ar,9,10);
		System.out.println(res);
	}

	private static boolean bs(int[] ar, int n, int key) {
		int low = 0;
		int high = ar.length-1;
		while(low<=high) {
			int mid = (low + high)/2;
			if (ar[mid]>key) {
				high = mid - 1;
			} else if (ar[mid]<key) {
				low = mid + 1;
			}
			else {
				return true;
			}
		}
		
		return false;
	}

}
