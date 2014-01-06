package p13_5;

public class Executive extends Manager
{
	public Executive(String n, double s, String d)
	{
		super(n, s, d);
	}

	public String toString()
	{
		return "Executive " + getName() + ", " + getSalary() + ", " + getDepartment();
	}
}
