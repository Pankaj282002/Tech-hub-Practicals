import java.util.*;
class EvenOddArray{
	

static int array [] = new int[10];
	public static  void main(String pankaj[])
	{	
		input();
		even();
		odd();
	}
	public static void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter elements of array.");
		
		for(int i=0; i<array.length; i++N )
		{
			array[i] = in.nextInt();
		}
		in.close();
	}
	public static void even()
	{
		System.out.printf("Even element of array : ");
		for(int i=0; i<array.length; i++)
		{
			if((array[i]%2) == 0)
			{
				System.out.printf("%d", array[i]);
			}
		}
		System.out.println();
	}

	public static void odd( )
	{
		System.out.printf("Odd element of array : ");
		for(int i=0; i<array.length; i++)
		{
			if(array[i]%2 != 0)
			{
				System.out.printf("%d, ", array[i]);
			}
		}
	}
}