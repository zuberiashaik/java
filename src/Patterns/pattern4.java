package Patterns;

public class pattern4 {

	public static void main(String[] args) {
	int rows = 3;
	int cols = 3;
	for (int i=1; i<=rows; i++) {
		for (int j=1; j<=i ;j++) {
			System.out.print(" ");
	}
		for(int j=1; j<=cols; j++) {
			System.out.print("*");
		}
		System.out.println();

	}
	
}
}