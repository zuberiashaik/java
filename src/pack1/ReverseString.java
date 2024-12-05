package pack1;

public class ReverseString {

	public static void main(String[] args) {
		String s = "HelloWorld"; 
		String rev = "";
		System.out.println("Before reverse string is: " + s);
		for(int i=s.length();i>0;--i) {
			rev = rev+s.charAt(i-1);
		}
		System.out.println("After reverse string is: " + rev);

	}

}
