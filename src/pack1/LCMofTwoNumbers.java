package pack1;

public class LCMofTwoNumbers {

	public static void main(String[] args) {
		int a=12,b=16,hcf=0,i;
		for(i=1;i<=a||i<=b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		int lcm=a*b/hcf;
		System.out.println("LCM of two numbers: " + lcm);
		System.out.println("HCF of two number:" + hcf);

	}

	}


