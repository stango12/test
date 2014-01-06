package p13_5;

public class WorkerTester
{
	public static void main(String [] args) 
	{
	Employee one = new Employee("Brian", 55000);
	System.out.println(one);
	
	Manager two = new Manager("Allen", 150000, "CMO");
	System.out.println(two);
	
	Executive three = new Executive("Brian", 250000, "CEO");
	System.out.println(three);
	}
}
