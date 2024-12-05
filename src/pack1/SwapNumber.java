package pack1;
import java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
		// program to swap 2 numbers without using third variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Before swapping:  a = " + a + ", b = " + b );
		
		a = a + b;
		b = a - b; 
		a = a - b;
		
		System.out.println("After swapping:  a = " + a + ", b = " + b );
	}

}
