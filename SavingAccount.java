package pack1;
interface BankingInterface{
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
}
class CurrentAccount implements BankingInterface {
	private double balance;
	public void deposit(double amount) {
		if(amount>100) {
		     balance=balance+amount;
		     System.out.println("amount deposited :"+amount);
		         System.out.println("After deposite Amount is: "+balance);
		}else {
			System.out.println("Amount must be greater than 100");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance-=amount;
			System.out.println("withdraw amount:"+amount);
			System.out.println("After withdraw your amount:"+balance);
		}else {
			System.out.println("Insufficient funds");
		}
	}
	public double getBalance() {
		return balance;	
	}
}
class SavingAccount implements BankingInterface {
	private  double balance = 0;
	public void deposit(double amount){
		if(amount>100) {
			balance+=amount;
			System.out.println("Deposit amount:"+amount);
			System.out.println("After deposit your balance:"+balance);
		}else {
			System.out.println("Amount must be greater than 100");
		}
		
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance-=amount;
			System.out.println("withdraw amount:"+amount);
			System.out.println("After withdraw your balance:"+balance);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public double getBalance(){
		return balance;
	}
	public static void main(String args[]) {
		SavingAccount s=new SavingAccount();
		s.deposit(1000);
		System.out.println("current amount:"+s.getBalance());
		s.withdraw(500);
		System.out.println("current amount:"+s.getBalance());
		CurrentAccount c=new CurrentAccount();
		c.deposit(2000);
		System.out.println("current amount:"+c.getBalance());
		c.withdraw(3000);
		System.out.println("current amount:"+c.getBalance());
	}
	}
