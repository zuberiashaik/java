package Coding;

public class Question4 {

	public static void main(String[] args) {
		int[] arr = {12, 3, 14, 56, 77, 13};
		int num = 13;
		int diff = 2;
		int count = 0;
		int n = arr.length;
		int res = findCount(arr,num,diff,count,n);
		System.out.println(res);
		
	}
	private static int findCount(int[] arr, int num, int diff, int count,int n) {
		for (int i=0; i<n; i++) {
			if (Math.abs(arr[i]-num)<=diff) {
				count++;
				
			}
		}
			if (count == 0) {
				return -1;
			} 
			
			
		
		return count;
	}

}
