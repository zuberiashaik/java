package String;
import java.util.*;
public class VowelORConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
		{
			System.out.println("Vowel: " + ch);
		} else {
			System.out.println("Consonant: " + ch);
		}
		
		}

}
