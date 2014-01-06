package p13_3;

import java.awt.Rectangle;

public class Square extends Rectangle  
{
	/**
	 * Constructs a square with inputed coordinates for the center and the side length.
	 * @param x X coordinate of center.
	 * @param y Y coordinate of center.
	 * @param l Length of square
	 */
	public Square(int x, int y, int l)
	{
		this.setLocation(x - l/ 2, y - l/ 2);
		this.setSize(l,l);
	}

	/**
	 * Gets the area of the square.
	 * @return The area.
	 */
	public double getArea()
	{
		return getWidth() * getHeight();
	}
}
