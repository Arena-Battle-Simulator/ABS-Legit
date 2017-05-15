/*Here I'll explain how this works.
 * Baisicly, I just have an array that stores the number of each type of item the player has.
 * The number of item types can be modified through the numitems variable.
 * The getItem method has the drop rates built into it.
 * That method would need to be modified if we add more item types or change the drop rates of items.
 * All of the item counts are stored in a file for easy recall.
 * Some methods return values for the sake of handling errors or giving the user information.
 * The item number can be 0 or 1, and the number of items is only limited by the size of an int.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ItemsClass 
{

	public static int[] items ;
	public static int numitems = 2;

	public ItemsClass()
	{
		items = new int[numitems];
		for (int a = 0;a<numitems;a++)
		{
			items[a] = 0;
		}
	}

	public int read ()
	{
		String line;//variables that do stuff
		int x = 0;
		try
		{
			BufferedReader input;//declaring
			input = new BufferedReader (new FileReader ("Items.txt"));//instantiating
			line = input.readLine ();//reading the file (open the gates of input!)
			while (line != null)//error handling purposes
			{
				items[x] = Integer.parseInt(line);
				x++;
				line = input.readLine();
			}
			input.close();
		}
		catch (Exception e)
		{
			return 1;//If there is an error it returns 1
		}
		return 0;//If there are no errors then it returns 0
	}
	
	public int write ()
	{
		try
		{
			PrintWriter output;//declaring
			output = new PrintWriter (new FileWriter ("Items.txt"));//instantiating
			for (int a = 0;a<numitems;a++)
			{
				output.println(items[a]);
			}
			output.close();
		}
		catch (Exception e)
		{
			return 1;//If there is an error it returns 1
		}
		return 0;//If there are no errors then it returns 0
	}
	
	public int getItem ()
	{
		int b;
		b = (int)(10*Math.random());
		if (b<5)
		{
			items[2]++;
			b = 1;
		}
		else
		{
			items[1]++;
			b = 2;
		}
		return b;//This tells you what item the player got
	}
	
	public void setItem(int a, int b)//a is the item number, b is the number of items
	{
		items[a] = b;
	}
	
	public boolean usedItem(int a)//a is the item number
	{
		if (items[a] != 0)
		{
			items[a]--;
			return true;//If they successfully used an item
		}
		return false;//If they didn't have any of that item to use
	}
	
	public int getItemCount(int a)//a is the item number
	{
		return items[a];//I dont need to explain this....
	}

}
