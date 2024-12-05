package pack1;

public class SumOfDigits {

	public static void main(String[] args) {
		int num= 12345, rev=0,sum=0;
		while(num!=0) {
			rev = num%10; // 5 4 3 2 1
			sum = sum + rev; // 5 9  12 14 15
			num = num /10; // 1234 123 12 1 0
		}
		System.out.println("Sum of digits of a number: " + sum);
	}

}
