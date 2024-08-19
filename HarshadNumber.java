package pack1;

public class HarshadNumber {
// Harshad Numver:A number is said to be the Harshad number if it is divisible by the sum of its digit.
	public static void main(String[] args) {
		int num = 21, rem=0,sum=0;
		int temp=num;
		while(num!=0) {
			rem = num%10; 
			sum = sum+rem; 
			num = num/10; 
		}
		if(temp%sum==0) {
			System.out.println("Harshad Number");
		} else { 
			System.out.println("Not a  Harshad Number");
		
		}
	}

}
