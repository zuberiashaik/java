package Patterns;
import java.util.*;
public class pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}



/* output:
 1
 22
 333
 4444
 
 
 System.out.print(j);
 then it print 
 1
 12
 123
 1234
 */
