package pack1;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[] = {12, 13, -1,10, 34, 10};
		int first=arr[0];
		int second=arr[0];
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] <= first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]<= second) {
				second=arr[i];
			}
		}
		System.out.print(second);
		
	}

}
