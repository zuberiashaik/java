package pack1;

public class Employee {
	static int eid=1;
	static String ename="riya";
	static String companyname="abc company";
	static void meth1() {
		System.out.println("Employee id:+eid");
		System.out.println("Employee name:"+ename);
		System.out.println("companyname:"+companyname);
	}
	

	public static void main(String[] args) {
		Employee obj=new Employee();
	     obj.meth1();
		
		
	}

}
