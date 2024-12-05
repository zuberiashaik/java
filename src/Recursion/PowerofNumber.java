package Recursion;

public class PowerofNumber {

	public static void main(String[] args) {
		int base =5, x = 3;
		int res = pow(base,x);
		System.out.println(res);
	}

	private static int pow(int base, int x) {
		if (x == 0) {
			return 1;
			
		}
		return (base * pow(base,x-1));
		
	}

}
