package pack1;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 222,rev=0,rem = 0;
		while(num>0) {
			rev = num%10;
			num = num/10;
			rem = rem+rev*rev*rev;
		}
		if(rem==num) {
			System.out.println("Amstrong Number: " + rem);
		}else {
			System.out.println("Not Amstrong Number: " + rem);
		}

	}

}
