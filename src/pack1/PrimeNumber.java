package pack1;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				System.out.println("Not a prime number: " + num);
				flag=1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("prime Number: " + num);
		}

	}

}
