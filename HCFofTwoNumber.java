package pack1;

public class HCFofTwoNumber {

	public static void main(String[] args) {
		int a=12,b=16,hcf=0,i;
		for(i=1;i<=a||i<=b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		
		System.out.println("HCF of two number:" + hcf);

	}

}
