import java.util.*;
class sumOfRowAndColumns
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a size of matrix : ");
		int size = in.nextInt();

		if(size<2  && size>5)
		{
			System.out.printf("matrix should more that 2 and less than 5.");
			return;
		}
		int array[] [] = new int [size] [size];
		
		System.out.println("Enter a values of array.");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf("Enter value of array [%d] [%d] : ", i, j);
				array[i] [j] = in.nextInt();
			}
		}
	
		System.out.printf("\nDisplay of array.\n\n");
		for(int i=0; i<size; i++)
		{
			int rowSum = 0;
			for(int j=0; j<size; j++)
			{
				System.out.printf(" %d\t", array[i] [j]);
				rowSum +=array[i] [j];
			}
			System.out.printf(" = %d\n", rowSum);
		}
	
		System.out.printf("\n--------------------------------------\n");
		for(int i=0; i<size; i++)
		{
			int colSum = 0;
			for(int j=0; j<size; j++)
			{
				colSum +=array[j] [i];
			}
			System.out.printf(" %d\t", colSum);
		}
		System.out.println();
		
	}
}