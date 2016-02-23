import java.util.Scanner;

/**
 * ReverseName: Takes the user's name and prints it out backwards
 * <p>
 * @author Kent Crozier
 * @version 1
 * <p>
 * Assignment: Practice Code
 * Course: ADEV 1007
 * Section: 1
 * Date Created: 02-23-2016
 * Last Updated: 02-23-2016
 */
public class ReverseName
{
	public static void main(String[] args)
	{
		// Variable and object declarations
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		String reverseName = "";
		int nameSize;
		
		// Prompt user for name
		System.out.print("Enter your name: ");
		
		// Accept name from keyboard
		name = keyboard.nextLine();
		
		// Collect the size of the user's name
		nameSize = name.length();
		
		// Cycle through the name backwards for reverse conversion
		for (int x = nameSize - 1; x >= 0; x--)
		{
			// Capitalize first letter
			if (x == (nameSize - 1) || (name.charAt(x + 1) == ' '))
			{
				// Add letter to reversed name
				reverseName += Character.toUpperCase(name.charAt(x));
			}
			else
			{
				// Add letter to reversed name
				reverseName += Character.toLowerCase(name.charAt(x));
			}
		}
		
		// Print out user's reversed name
		System.out.println("\n" + name + ", your name backwards is " + reverseName + "!");
		
		// Close scanner object
		keyboard.close();
	}
}
