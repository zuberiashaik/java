package pack1;

public class AutomorphicNumber {
	//Automorphic Number:It is a number whose square ends with the same number itself

	public static void main(String[] args) {
		int x=5;
		int y=x*x;
		if(y%10==x%10)
			System.out.println("Automorphic");
		else
			System.out.println("Not");

	}

}
