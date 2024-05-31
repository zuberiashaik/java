package pack1;
import java.util.Scanner;
public class AreaOfRectangle {
	int l,w,area;
	Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("Enter the length ");
		l=sc.nextInt();
		System.out.println("Enter the width");
	    w=sc.nextInt();
	
	}
	public void processing() {
		area=l*w;
	}
	public void output() {
	
		System.out.println("Area of rectangle is:"+area);
	}

	public static void main(String[] args) {
		AreaOfRectangle obj=new AreaOfRectangle();
		obj.input();
		obj.processing();
		obj.output();
		
	}

}
