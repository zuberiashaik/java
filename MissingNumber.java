package pack1;

public class MissingNumber {

	public static void main(String[] args) {
		int  a[] = {0,2,1,3,6,5,9,8,7};
		int sum1 = 0;
		for(int i=0;i<a.length;i++) {
			sum1 = sum1+a[i];
		}
		System.out.println("Sum of elements in array: " + sum1);
		int sum2=0;
		for(int i=0;i<=a.length;i++) {
			sum2 = sum2+i;
			
		}
		System.out.println("Sum of elements in array: " + sum2);
		System.out.println("Missing Number is: " + (sum2-sum1));
	}

}
