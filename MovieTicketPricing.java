package pack1;
import java.util.Scanner;

public class MovieTicketPricing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter the time of the movie");
		int time=sc.nextInt();
		int price;
		if(age<5 || age>=60) {
			price=0;
		}else if(time<12) {
			price=250;
		}else if(time>=5 && time<9) {
			price=300;
		}else {
			price=200;
		}
		System.out.println("The price of movie ticket is:"+price);
		sc.close();
	
	}

}
