package pack1;

public class StrongNumber {

	//Strong Number:A strong Number is a number whose sum of factorial digits is equal to the number itself
	
	public static void main(String[] args) {
		int num=145,r,sum=0;
		int temp=num;
		while(num!=0) {
			r=num%10;
			int fact = 1;
			for(int i=1;i<=r;i++) {
				 fact = fact * i;
			}
			sum = sum+fact;
			num=num/10;
		}
		if(sum==temp) 
			System.out.println("Strong Number: " + sum);
		else 
			System.out.println("Not a Strong Number: " + sum);
		
	}

}
