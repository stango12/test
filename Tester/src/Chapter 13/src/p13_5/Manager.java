package p13_5;

public class Manager extends Employee
{
	private String department;
	public Manager(String n, double s, String d) 
	{
		super(n, s);
		department = d;
	}

	public String getDepartment() {
		return department;
	}

	public String toString() 
	{
		return "Manager " + super.toString() + "," + department;
	}

	
}
