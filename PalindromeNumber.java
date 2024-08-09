package pack1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=121,rem=0,rev=0;
		 int temp=n;
		while(n!=0) {
			rem=n%10; // 1 2 1
			rev=rev*10+rem; // 1 12 121
			n=n/10; // 12 1 0
			
		}
		if(rev==temp) { 
			System.out.println("palindrome Number: " + rev);
		}else {
			System.out.println("Not a palindrome number: " + rev);
		}
	}

}
