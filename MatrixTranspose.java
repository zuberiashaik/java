package pack1;
import java.util.Scanner;
public class MatrixTranspose {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter elements of the 3x4 matrix:");

	        
	        int[][] matrix = new int[3][4];

	        
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	     
	        int[][] transposeMatrix = transpose(matrix);

	       
	        System.out.println("Transpose of the Matrix:");
	        printMatrix(transposeMatrix);

	        scanner.close();
	    }

	   
	    public static int[][] transpose(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[][] transposeMatrix = new int[cols][rows];

	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                transposeMatrix[i][j] = matrix[j][i];
	            }
	        }
	        return transposeMatrix;
	    }

	 
	    public static void printMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

