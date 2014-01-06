package p13_6;

public abstract class Worker 
{
	private String name;
	private double salaryRate;
	
	public Worker(String name, double rate)
	{
		this.name = name;
		salaryRate = rate;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getRate()
	{
		return salaryRate;
	}
	
	public abstract double computePay(int hours);
}
