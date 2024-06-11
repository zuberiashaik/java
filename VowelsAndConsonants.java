package pack1;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String s="Welcome to java";
		int vowels=0;
		int consonants=0;
		String str = s.toLowerCase();
		 for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		 }
		 System.out.println("Number of vowels:"+vowels);
		 System.out.println("Number of consonants:"+consonants);

	}

}
