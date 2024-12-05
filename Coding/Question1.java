package Coding;

public class Question1 {

	public static void main(String[] args) {
		int r = 7, unit = 2, n = 8;
		int arr[] = {2 ,8, 3, 5, 7, 4, 1, 2};
		int result = r*unit;
		int res = solve(arr,n,r,unit,result);
		System.out.print(res);
		

	}

	private static int solve(int[] arr, int n, int r, int unit,int result) {
		if (arr == null) {
			return -1;
		}
		int sum =0;
		int count=0;
		for (int i=0; i<=n; i++) {
			sum = sum+arr[i];
			count++;
		
		if (sum > result) {
			break;
		}
		if (sum < result) 
			return 0;
		
		
		
	}
		return count;

}
}
