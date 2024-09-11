import java.util.*;
public class InsertArray
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		int array[] = new int[5];
		
		System.out.printf("Enter a arrays value.\n");
		for(int i=0; i<array.length -1; i++)
		{
			System.out.printf("Enter a %d element of array : ", i);
			array[i] = in.nextInt();
		}
		System.out.printf("\nArray value before inserting : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("  %d" , array[i]);
		}
		
		System.out.printf("\nEnter a value to insert in array : ");
		int val = in.nextInt();
		System.out.printf("\nEnter a index value where value want to insert : ");
		int index = in.nextInt();
		
		for(int i = array.length-1; i > index; i--)
		{
			array[i] = array[i-1];
			
		}
		array[index] = val;
		System.out.printf("\nArray value after inserting : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("  %d" , array[i]);
		}
	}
}