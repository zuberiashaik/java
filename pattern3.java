package Patterns;

public class pattern3 {

	public static void main(String[] args) {
		int rows = 4;
		int cols = 4;
		for(int i = 1; i <=rows; i++) {
			for (int j = 1; j<=cols; j++) {
				if((i==1 || i==cols) || (j==1 || j==cols)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}



 /* output:
	
	****
	*  *
	*  *
	****   */