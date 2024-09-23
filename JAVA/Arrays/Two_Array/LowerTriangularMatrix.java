import java.util.*;
public class LowerTriangularMatrix
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a size of matrix : ");
		int size = in.nextInt();
		int matrix [] [] = new int [size] [size];
		
		if(size<2)
		{
			System.out.println("Enter matrix size more than 1.");
			return;
		}
		System.out.printf("\nEnter a values of Matrix.\n");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf("Enter vlaue of [%d] [%d] : ", i, j);
				matrix [i] [j] = in.nextInt();
			}
		}

		System.out.printf("\nbefore setting zero in lower triangular matrix\n\n");
		display(matrix, size);

		// seting the 0 in lower triangle
        		for (int i = 0; i < size; i++) 
		{
            			for (int j = 0; j < i; j++) 
			{
               	 			matrix[i][j] = 0;
            			}
        		}

		System.out.printf("\nAfter setting zero in lower triangular matrix\n\n");
		display(matrix, size);
	}
	public static void display(int matrix [] [] , int size )
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				
				System.out.printf(" %d\t", matrix [i] [j]);
				
			}
			System.out.println();
		}
	}
}