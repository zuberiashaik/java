package String;

public class NumberOfVowels {

	public static void main(String[] args) {
		String s = "prepinsta";
		char[] ch = s.toCharArray();
		int vowels = 0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vowels++;
				
			} 
		}
		System.out.println("Number of Vowels: " + vowels);
	}

}
