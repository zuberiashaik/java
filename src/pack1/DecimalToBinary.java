package pack1;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal = 12;
		//converts the decimal number to a binary string.
		String binary = Integer.toBinaryString(decimal);
		System.out.println("Binary Number: " + binary);
	}

}
