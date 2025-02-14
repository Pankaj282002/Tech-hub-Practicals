import java.util.*;
class MergeArray
{
	void setArray(int a[], int b[])
	{
		
	}
	void performMerge()
	{
	
	}
	int [] getMergeArray()
	{

	}
}
public class MergeArray
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a size of array : ");
		int size1 = in.nextInt();
		int array1[] = new int[size1];
		
		System.out.printf("\nEnter a size of array : ");
		int size2 = in.nextInt();
		int array2[] = new int[size2];
		
		System.out.printf("\nEnter a values of array1 : ");
		input(array1, in);

		System.out.printf("\nEnter a values of array2 : ");
		input(array2, in);
		
		
	}
	public static void input(int a[], Scanner in)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("Enter a %d value of array : ");
			a[i] = in.nextInt();
		}
	}
	public static void display(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print( a[i] + " ");
		}
	}
}