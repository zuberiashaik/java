package pack1;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int binary = 111001;
		double decimal = 0;
		int n =0;
		while(binary > 0) { // 111001>0 11100>0 1110>0 111>0 11>0 1>0
			int temp = binary%10; // 1 0 0 1 1 1
			decimal =  decimal+temp*Math.pow(2, n); // 1 9 25 57
			binary = binary/10; // 11100 1110 111 11 1
			n++;//1 2 3 4 5
		}
		System.out.println("Decimal Number: " + decimal);
	}

}
