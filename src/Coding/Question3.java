package Coding;

public class Question3 {

	public static void main(String[] args) {
		String s = "aA1_67";
		int n = s.length();
		System.out.println(checkPassword(s,n));
	}

	private static int checkPassword(String s, int n) {
		if(n<4)
			return 0;
		if(s.charAt(0)>='0' && s.charAt(0)<='9')
			return 0;
		int num =0; int cap = 0;
		for (int i=0; i<n; i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				cap++;
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				num++;
			if(s.charAt(i) == ' ' || s.charAt(i) == '/')
				return 0;
		}
		if (cap >0 && num >0) {
			return 1;
		} else {
		return 0;
		}
	}

}
