import java.util.*;
class AdditionOfMatrix
{
	public static void  main(String pankaj[])
	{
		System.out.printf("\nInput the size of the square matrix (2 - 5) : ");
		int size = in.nextInt();
		
		if(size<2 && size>5)
		{
			System.out.println("Matrix size should be greater than 2 and less than 5.");
			return;
		}
		
		int matrix1 [] [] = new int [size] [size];
		int matrix2 [] [] = new int [size] [size];
		int result [] [] = new int [size] [size];

		System.out.printf("\nEnter a values of First Matrix.");
		Input(matrix1, size);
		System.out.printf("\nEnter a values of Second Matrix.");
		Input(matrix2, size);
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				result [i] [j] = matrix1[i] [j] + matrix2[i] [j];
			}
		}

		System.out.printf("Display First Matrix.\n");
		Display(matrix1, size);
		System.out.printf("Display First Matrix.\n");
		Display(matrix2, size);
		System.out.printf("Display Result Matrix.\n");
		Display(result, size);

		System.out.println();
		
	}
	public static void Input(int a[], size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf("Enter a value of [%d] [%d] : ", i,j);
				a[i] [j] = in.nextInt();
			}
		}
	}
	public static void Display(int a[], size)
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf("%d\t", a[i] [j]);
			}
		System.out.println();
		}
	}
}