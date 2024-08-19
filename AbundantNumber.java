package pack1;

public class AbundantNumber {
	//Abundant Number:The sum of factors of a number except the number itself is greater
	//than the given number then such number is called abundant number

	public static void main(String[] args) {
		int num=18,sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
			if(sum>num) {
				System.out.println("Abundant Number");
			} else {
				System.out.println("Not a Abundant Number");
			}
		

	}

}
