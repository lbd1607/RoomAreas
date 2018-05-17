/**
 * Laura Davis CIS 260 903
 * 
 * This class gets and sets length and
 * width for a rectangle, then calculates
 * the area.
 */

public class Rectangle 
{
	private double length;
	private double width;
	
	/**
	 * The setLength method stores a value
	 * in the length field.
	 * @param len The value to store in length
	 */
	public void setLength (double len)
	{
		length = len;
	}
	
	/**
	 * The setWidth method stores a value 
	 * in the width field.
	 * @param w The value to store in width
	 */
	public void setWidth (double w)
	{
		width = w;
	}
	
	/**
	 * The getLength method returns a Rectangle object's length.
	 * @return length
	 */
	public double getLength()
	{
		return length;
	}

	/**
	 * The getWidth method returns a Rectangle object's width.
	 * @return width
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * The getArea method returns the Rectangle object's area
	 * @return area
	 */
	public double getArea()
	{
		return length * width;
	}
	
}//end of class
