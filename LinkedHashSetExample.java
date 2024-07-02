package pack1;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	void meth1() {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(4);
		hs.add(3);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(3);
		hs.add(2);
		
		System.out.println("Implementing LinkedHashSet:"+hs);
	}
	public static void main(String[] args) {
		LinkedHashSetExample obj=new LinkedHashSetExample();
		obj.meth1();
		
	}

}


