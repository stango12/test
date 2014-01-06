package p13_8;

/**
   This program tests the BankAccount class and
   its subclasses. 
*/
public class AccountTester
{  
   public static void main(String[] args)
   {  
      SavingsAccount momsSavings 
            = new SavingsAccount(0.5);
      
      CheckingAccount harrysChecking
            = new CheckingAccount(100);
        
      System.out.println("Mom's saving's account:");
      test(momsSavings);
      
      System.out.println("Harry's checking account:");
      test(harrysChecking);
   }
   
   public static void test(BankAccount account)
   {
	   account.deposit(500);
	   System.out.println(account.getBalance());
	   account.endOfMonth();
	   System.out.println(account.getBalance());   
	   System.out.println();
	   
	   account.deposit(1000);
	   System.out.println(account.getBalance());
	   account.endOfMonth();
	   System.out.println(account.getBalance());  
	   System.out.println();
	   	   
	   account.withdraw(250);
	   System.out.println(account.getBalance());
	   account.endOfMonth();
	   System.out.println(account.getBalance());  
	   System.out.println();
	   	   
	   account.deposit(750);
	   System.out.println(account.getBalance());
	   account.endOfMonth();
	   System.out.println(account.getBalance());  
	   System.out.println();
	   	   
	   account.withdraw(500);
	   System.out.println(account.getBalance());
	   account.endOfMonth();
	   System.out.println(account.getBalance());  
   }
}
