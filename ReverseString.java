package pack1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		char[]arr=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println("string reverse:"+rev);
	}

}
