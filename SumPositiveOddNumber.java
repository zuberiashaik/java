package pack1;

public class SumPositiveOddNumber {
	public static void main(String args[]) {
		int n=10;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=i*2+1;
			
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0 && arr[i]%2!=0) {
				sum+=arr[i];
			}
		}
		System.out.println("sum of positive odd numbers:"+sum);
	}
}
