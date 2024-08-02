package pack1;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		//condition to check weather the given number is even or odd
		if (num%2==0) {
			System.out.println("Even number: " + num);
		}else {
			System.out.println("Odd number: " + num);
		}
	}

}
