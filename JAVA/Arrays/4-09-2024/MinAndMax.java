import java.util.*;
public class MinAndMax
{

static int array []= new int[5];
static int max = array[0];

	public static void main(String pankaj[])
	{
		input();
		display();
		max();
		System.out.print("Min of array is : " + min());		
	}
	
	// function to take user input arrays values from user.
	public static void input()
	{
		Scanner in = new Scanner (System.in);
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("Enter a %d value in array : ",i);
			array[i] = in.nextInt();
		}
		System.out.println();
	}

	// function to display array 
	public static void display()
	{
		System.out.printf("array = [%d] = {", array.length);
		for(int j=0; j<array.length; j++)
		{
			System.out.printf(" %d, ", array[j]);
		}
		System.out.printf("}\n");
	}

	// function for finding maximum value in the array.
	public static void max()
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.printf("Max value of array is : %d\n",max);
	}

	// function for finding minimum value in the array.
	public static int min()
	{
		int min = array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		return  min;
	}
	
}