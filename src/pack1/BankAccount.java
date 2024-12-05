package pack1;

public class BankAccount {
	static double balance = 0;
	//deposite method
	public void deposite(double amt) {
		if(amt > 100) {
			balance = balance+amt;
			System.out.println("Amount deposite: " + amt);
			System.out.println("After deposite balance amount is: " + balance);
		}else if(amt < 100) {
			System.out.println("Minimum amount to deposite is 100");
		}else {
			System.out.println("Amount must be greater than 100");
		}
	}
	
	//withdraw method
	public void withdraw(double amt) {
		if(amt>0 && amt<balance) {
			balance = balance - amt;
			System.out.println("Withdraw Amount: " + amt);
			System.out.println("After withdraw your amount is: " + balance);
		}else if(amt>balance) {
			System.out.println("Insuffient Balance");
		}else {
			System.out.println("Amount must be Morethan 100");
		}
	}
	//check balance amount
	public void checkBalance() {
		System.out.println("Current Balance is: " + balance);
	}

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.deposite(2500);
		ba.withdraw(500);
		ba.checkBalance();
	}

}
