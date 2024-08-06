package pack1;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123,rev=0,rem;
		while(num>0) {
			rem = num % 10;// 3 2 1
			rev = rev*10+rem;// 3 32 321
			num = num/10;// 12 1 0
		}
		System.out.println("Reverse Number: " + rev);
	}

}
