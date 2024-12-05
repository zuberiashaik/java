package String;

public class RemovingVowels {

	public static void main(String[] args) {
		String s = "prepinsta";
		char[] ch = s.toCharArray();
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				continue;
				
			}  else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
