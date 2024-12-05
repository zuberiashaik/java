package Matrix;
import java.util.*;
public class sparematrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int totalElements = r * c;
		int mat[][] = new int[r][c];
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int zero=0;
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (mat[i][j] == 0) {
					zero++;
				}
			}
		}
		int nonzero = totalElements - zero;
		if(zero > nonzero) 
			System.out.println("Spare Matrix");
		 else 
			System.out.println("Not a Spare Matrix");
		
		
		
	

}
}
