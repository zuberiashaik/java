package pack1;

import java.util.TreeSet;

public class TreeSetExample {
	void meth1() {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(74);
		ts.add(26);
		ts.add(16);
		ts.add(9);
		ts.add(24);
		ts.add(30);
		ts.add(40);
		System.out.println("original list:"+ts);
		System.out.println("TreeSet after removing all elements greater than a specific element:"+ts.headSet(26));
	}

	public static void main(String[] args) {
		TreeSetExample obj=new TreeSetExample();
		obj.meth1();

	}

}
