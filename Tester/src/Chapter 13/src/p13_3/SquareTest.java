package p13_3;

import java.util.Scanner;

public class SquareTest 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the X coordinate of the center of the square.");
		int x = in.nextInt();
		System.out.println("Please input the Y coordinate of the center of the square.");
		int y = in.nextInt();
		System.out.println("Please input the sidelength of the square.");
		int length = in.nextInt();
		
		Square test = new Square(x,y,length);
		System.out.println(test);
		System.out.println("Area:" + test.getArea());
	}
}
