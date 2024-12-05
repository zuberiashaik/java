package String;

public class LengthOfString {
	public static void main(String[] args) {
		String s ="prepinsta";
		char[] ch = s.toCharArray();
		int length=0;
		for (char c : ch) {
			length++;
			
		}
		System.out.println("Length of String: " + length);
	}
}
