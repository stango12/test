package p13_6;

public class HourlyWorker extends Worker
{

	public HourlyWorker(String name, double rate) 
	{
		super(name, rate);
	}

	public double computePay(int hours)
	{
		if(hours <= 40)
			return getRate() * hours;
		else
			return getRate() * hours + getRate() * (hours - 40) * 1.5;
	}

}
