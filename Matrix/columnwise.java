package Matrix;
import java.util.*;
public class columnwise {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[r][c];
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int j=0; j<r; j++) {
			for (int i=0; i<c; i++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		}

}


/* OUTPUT:
3 2
1 2 
3 4
5 6

1 3 5
2 4 6

*/