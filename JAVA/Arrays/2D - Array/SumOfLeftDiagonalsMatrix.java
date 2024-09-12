import java.util.*;
class SumOfLeftDiagonalsMatrix
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nInput the size of the square matrix : ");
		int size = in.nextInt();
		int matrix [] [] = new int [size] [size];

		for(int i=0; i<size; i++)	
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf("Enter element value of [%d] [%d] : ", i, j);
				matrix [i] [j] = in.nextInt();
			}
		}
		in.close();
		
		int leftSum =0;
		System.out.println();
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				if(i == j)
				{
					leftSum += matrix[i] [j]; 	// leftSum = leftSum + matrix ;
				}
				System.out.printf("%d\t", matrix[i] [j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum of the left Diagonal elements is : " + leftSum);
	}
}