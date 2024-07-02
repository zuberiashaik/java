package pack1;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10,b=0;
		int c=0;
		try {
			int arr[]= {1,2,3,4};
			int index=6;
			System.out.println("value of index:"+arr[index]);
			c=a/b;
			System.out.println("Result of division:"+c);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae);
		}
		catch(ArithmeticException e) {
		
		System.out.println("Error Occured:"+e);
		}
		
		System.out.println(c);
		System.out.println("End of program");

	}
}
