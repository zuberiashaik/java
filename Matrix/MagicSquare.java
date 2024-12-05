package Matrix;

public class MagicSquare {

	public static void main(String[] args) {
		int A[][] = {{2,8,5},{1,3,7},{4,9,6}};
		int B[][] = {{4,9,2},{3,5,7},{8,1,6}};
		int res = cost(A,B);
		System.out.print(res);

	}

	private static int cost(int[][] a, int[][] b) {
		int sum = 0;
		for (int i=0;i<3; i++) {
			for(int j=0; j<3; j++) {
			 sum = sum+Math.abs(a[i][j] - b[i][j]);
			}
		}
		return sum;
	}

}
