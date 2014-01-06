package p13_6;

import java.util.ArrayList;

public class WorkerTester 
{
	public static void main(String[] args) 
	{
		ArrayList<Worker> w = new ArrayList<Worker>();
		w.add(new HourlyWorker("Chris", 9));
		w.add(new SalariedWorker("Dan", 10));
		
		for(int i = 0; i < w.size(); i++)
		System.out.println(w.get(i).getName() + "'s pay is " + w.get(i).computePay(30));
	}
}
