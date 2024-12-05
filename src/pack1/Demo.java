package pack1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class  Demo{
	void meth1() {
		HashSet hs = new HashSet();
		hs.add(2);
		hs.add("Riya");
		hs.add(null);
		System.out.println("ArrayList: " + hs);
		System.out.println("ArrayList size: " + hs.size());
		
	}
	
	public static void main(String[] args) {
		new Demo().meth1();
		
	}
	
}
