package Coding;

public class Question2 {

	public static void main(String[] args) {
		String s = "1C0C1C1A0B1";
	
		int res = BinaryOperation(s);
		System.out.print(res);
	}

	private static int BinaryOperation(String s) {
		if (s == null) {
			return -1;
		}
		int result = s.charAt(0)-'0';
		for (int i=1; i<s.length(); i++) {
			char pre = s.charAt(i);
			i++;
			if (pre == 'A') {
				result = result & (s.charAt(i)-'0');
			} else if (pre == 'B') {
				result = result | (s.charAt(i)-'0');
			} else {
				result = result ^ (s.charAt(i)-'0');
			}
		}
		return result;
	}

}
