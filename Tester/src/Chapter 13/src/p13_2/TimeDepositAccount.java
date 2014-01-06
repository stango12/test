package p13_2;

public class TimeDepositAccount extends SavingsAccount
{
	private int time;
	private final int penalty = 250;
	/**
    Constructs a bank account with a given interest rate.
    @param rate the interest rate
    @param limit the promised number of months the money will stay
	*/
	public TimeDepositAccount(double rate, int limit) 
	{  
		super(rate);
		time = limit;
	}
	
	/**
	   Adds the earned interest to the account balance.
	*/
	public void addInterest() 
	{  
		super.addInterest();
		time--;
	}
 
	/**
	 * Withdraws said amount out of account. If it is before the limit, then a fee of $250 is charged.
	 */
	public void withdraw(double amount)
	{
		if(time > 0)
			super.withdraw(amount + 250);
		else
			super.withdraw(amount);
	}
}
