package pack1;
import java.util.HashSet;
public class HashSetExample {
	void meth() {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(4);
		hs.add(5);
		hs.add(5);
		hs.add(6);
		hs.add(6);
		System.out.println("Implementing HashSet:"+hs);
	}

	public static void main(String[] args) {
		HashSetExample obj=new HashSetExample();
		obj.meth();
	}
}


