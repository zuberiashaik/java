
package pack1;

	public class BankAccount {

	

      static double balance=0;
     String AccountType;

   public BankAccount(String AccountType) 
   {
      this(AccountType, 0.0);
    }
  public BankAccount(String saving, double initialamt)
    {
      this.AccountType=saving;
      this.balance=initialamt;
    }	
    public double checkingbalance()
    {
     return balance;
    } 
    public String AccountType()
    {
     return AccountType;
    }
     
    //deposite method
    public void deposite(double amt)
    {
     if(amt>100) {
        balance=balance+amt;
         System.out.println("amount deposited "+amt);
         System.out.println("After deposite Amount is "+balance);
        }
      else if(amt<100) {
         System.out.println("minium amount to deposite is 100");
         }
      else {
        System.out.println("Amount must be Greater than 100");
        }
    }
     
    // deposite method overload
     public void deposite(String checkNoamt ,double amt)
     {
       if(amt>100) {
    



  balance=balance+amt;
         System.out.println("amount deposited "+amt);
         System.out.println("After deposite Amount "+balance);
        }
      else if(amt<100) {
         System.out.println("minium amount to deposite is 100");
         }
      else {
        System.out.println("Amount must be Greater than 100");
        }       
     }
   
   // withdraw method
   public void withdraw(double amt)
    {
     if(amt>0 && amt<balance) {
        balance=balance-amt;
        System.out.println("you wanted to withdraw "+amt);
        System.out.println("After withdraw your Amount is " +balance);
       }
      else if(amt>balance) {
        System.out.println("insuffient Balance");
       }
  else {
    System.out.println("Amount Must be Morethan 100");
    }
   }
    //check method
  public void check(){
    System.out.println(" After checking your balance "+balance);
    }
     
	public static void main(String args[])
	{
         BankAccount ba1= new BankAccount("Savings",2000.0);
         System.out.println("initialamt "+ba1.checkingbalance());
         System.out.println("Acount Type " +ba1.AccountType());
         ba1.deposite(200);
         ba1.deposite("#Check123",500);
         ba1.withdraw(100);
         ba1.check();
          System.out.println();
         BankAccount ba= new BankAccount("checking");
         System.out.println("Account Type "+ba.AccountType);
         System.out.println("Acount Type " +ba.checkingbalance());
         ba.deposite(2500);
         ba.withdraw(200);
         ba.deposite("@check23", 350);
         ba.check(); 
         }
}
	