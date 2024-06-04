package pack1;

public class AutoBoxing {
	

	public static void main(String[] args) {
		int a=10;
		Integer a1=new Integer(a);
		System.out.println(a1);
		double d=3.14;
		Double d1=new Double(d);
		System.out.println(d1);
		float f=23;
		Float f1=new Float(f);
		System.out.println(f1);
		char c='a';
		Character c1=new Character(c);
		System.out.println(c);
		boolean b=true;
		Boolean b1=new Boolean(b);
		System.out.println(b1);
		String s="java";
		String s1=new String(s);
		System.out.println(s1);
		
		Integer i=new Integer(4);
		int i1=i;
		System.out.println(i1);
		Double o=new Double(12.2);
		double d2=o;
		System.out.println(d2);
		Float l=new Float(22);
		float f2=l;
		System.out.println(f2);
		Character h=new Character('c');
		char c2=h;
		System.out.println(c2);
		Boolean e=new Boolean(false);
		boolean b2=e;
		System.out.println(b2);
		String t=new String("Hello");
		String s2=t;
		System.out.println(s2);
				
		
	}

}
