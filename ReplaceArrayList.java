package pack1;

import java.util.ArrayList;

public class ReplaceArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("apple");
		al.add("banana");
		al.add("pineapple");
		al.add("papaya");
		System.out.println("ArrayList before replace:"+al);
		al.set(2,"grape");
		System.out.println("ArrayList after replace:"+al);
	
	}

}
