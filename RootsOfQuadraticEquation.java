package pack1;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		int a = 1,b = -2,c = 1;
		int d = (b*b)-(4*a*c);
		int r =  b/2*a;
		if(d>0) {
			 double r1=(-b + Math.pow(d, 0.5)) / (2.0 * a);  
			 double r2=(-b - Math.pow(d, 0.5)) / (2.0 * a);  
			 System.out.println("Roots are real and distinct: " + r1 + " and " + r2);
		}else if(d==0) {
			int r1 = -b/(2*a);
			System.out.println("Roots are real and equal: " + r1);
		}else {
			System.out.println("Roots are not real");
		}
		
	}

	

}
