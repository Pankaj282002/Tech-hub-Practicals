import java.util.*;
class inputArray
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number of column : ");
		int column = in.nextInt();
		System.out.printf("\nEnter a number of row : ");
		int row = in.nextInt();
		int array[][] = new int[column][row];
		int count = 1; 
	
		System.out.println();
		for(int p=0; p<array.length; p++)
		{
			for(int a=0; a<array[p].length; a++)
			{
				System.out.printf("%d\t", count);
				count++;
			}
			System.out.println();
		}

	
	}
}