package pack1;

public class FriendlyPair {

	public static void main(String[] args) {
		int num1=6,num2=28,sum1=0,sum2=0;
		for(int i=1;i<num1;i++) {
			if(num1%i==0) {
				sum1=sum1+i;
			}
		}
		for(int i =1;i<num2;i++) {
			if(num2%i==0) {
				sum2=sum2+i;
			}
		}
		if(sum1/num1==sum2/num2) {
			System.out.println("Friendly Number");
		} else {
			System.out.println("Not a Friendly Number");
		}

	}

}
