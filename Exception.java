package pack1;



public class Exception {

	public static void main(String[] args)  {
		int a=10,b=0;
		int c = 0;
		try {
			int array[]= {10,2,34,45};
			int index=8;
			System.out.println("value of index:"+array[index]);
			int arr[]=null;
			System.out.println(arr[1]);
		 c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Error Occured:"+ae);
		}
		catch(ArithmeticException e) {
			System.out.println("Error Occured"+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println(" finally block");
		}
		System.out.println(c);
		System.out.println("end program");
	}
}
