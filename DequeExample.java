package pack1;
import java.util.ArrayDeque;
public class DequeExample {
	void meth1() {
		ArrayDeque q=new ArrayDeque();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add("java");
		q.add(33);
		q.add(99);
		System.out.println(q);
		System.out.println("peek:"+q.peek());
		System.out.println("peekFirst:"+q.peekFirst());
		System.out.println("peeklast:"+q.peekLast());
		System.out.println("poll:"+q.poll());
		System.out.println("remove:"+q.remove());
		System.out.println("element:"+q.element());
	}
	public static void main(String[] args) {
		 DequeExample obj=new DequeExample();
		 obj.meth1();
	}
}
