import javax.swing.JOptionPane;

/**
 * Laura Davis CIS 260 903
 * 
 * This program creates three instances of the Rectangle class
 */

public class RoomAreas 
{
	public static void main(String[] args)
	{
		//declare variables
		double number;
		double totalArea;
		String input;
		
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		
		//get and store the dimensions of the kitchen
		input = JOptionPane.showInputDialog("What is the kitchen's length? ");
		number = Double.parseDouble(input);
		kitchen.setLength(number);
		input = JOptionPane.showInputDialog("What is the kitchen's width? ");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);
		
		//get and store the dimensions of the bedroom
		input = JOptionPane.showInputDialog("What is the bedroom's length? ");
		number = Double.parseDouble(input);
		bedroom.setLength(number);
		input = JOptionPane.showInputDialog("What is the bedroom's width? ");
		number = Double.parseDouble(input);
		bedroom.setWidth(number);
		
		//get and store the dimensions of the den
		input = JOptionPane.showInputDialog("What is the den's length? ");
		number = Double.parseDouble(input);
		den.setLength(number);
		input = JOptionPane.showInputDialog("What is the den's width? ");
		number = Double.parseDouble(input);
		den.setWidth(number);
		
		//calculate the total area of the rooms.
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		
		//Display the total area of the rooms
		JOptionPane.showMessageDialog(null, "The area of the kitchen is " + kitchen.getArea() + 
				"\nThe area of the bedroom is " + bedroom.getArea() + "\nThe area of the den is " +
				den.getArea());
		JOptionPane.showMessageDialog(null, "\nThe total area of the rooms is " + totalArea);
		
		System.exit(0);
		
	}//end of main

}//end of class
