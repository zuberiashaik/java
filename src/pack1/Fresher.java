package pack1;
import java.util.Scanner;
public class Fresher {

		int id;
		String name;
		String degree ;
		String stream ;
		int yop = 2024;
		
	    Fresher (int id, String name, String degree, String stream, int yop) {
		 this.id = id;
		 this.name = name;
		 this.degree = degree;
		 this.stream = stream;
		 this.yop = yop;
	}
	    public void giveIntro() {
	  
		System.out.println("My id is: " + id);
		System.out.println("My name is: " + name);
		System.out.println("My degree is: " + degree);
		System.out.println("In Stream of: " + stream);
		System.out.println("In the year of: " + yop);
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		 int id = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter name");
		 String name = sc.next();
		 System.out.println("Enter degree");
		 String degree = sc.nextLine();
		 System.out.println("Enter stream");
		 String stream = sc.nextLine();
		 System.out.println("Enter YearOfPassout");
		 int yop = sc.nextInt();
		
		Fresher f = new Fresher(id, name, degree, stream, yop);
		f.giveIntro();
		

	}

}
