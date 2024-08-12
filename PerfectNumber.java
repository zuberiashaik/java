package pack1;

public class PerfectNumber {

	public static void main(String[] args) {
		//perfect number:A Number that can be represented as the sum of 
		//it's factors except the number itself is known as the Perfect Number.
		int num = 6,sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			sum = sum+i;
		}
		}
		if(sum == num) {
			System.out.println("perfect Number: " + sum);
		}else {
			 System.out.println("Not a perfect number: " + sum);
		}

	}

}

