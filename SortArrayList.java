package pack1;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(6);
		al.add(20);
		al.add(4);
		al.add(15);
		System.out.println("ArrayList before sort:"+al);
		Collections.sort(al);
		System.out.println("ArrayList after sort:"+al);

	}

}
