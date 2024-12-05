package Sorting;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] a = {3,8,10,18,25};
		int[] b = {-2,1,5,9,11,13,1};
		int n = a.length;
		int m = b.length;
		int p1 = 0 ;
		int p2 = 0;
		while (p1<n && p2<m) {
			if (a[p1] < b[p2]) {
				System.out.print(a[p1] + " ");
				p1++;
				
			} else {
				System.out.print(b[p2] + " ");
				p2++;
			}
		}
		while (p1<n) {
			System.out.print(a[p1] + " ");
			p1++;
		}
		while (p2<m) {
			System.out.print(b[p2] + " ");
			p2++;
		}
		

	}

}
