package p13_8;

/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount //concrete class
{  
   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(double rate) 
   {  
      interestRate = rate;
   }

   /**
      Adds the earned interest to the account balance.
   */
   public void addInterest() 
   {  
      double interest = getBalance() * interestRate / 100;
      deposit(interest); 
   }

   private double interestRate;

	public void endOfMonth() 
	{
		this.addInterest();
	}
}
