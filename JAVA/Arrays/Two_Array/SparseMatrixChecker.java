// For the matrix to be sparse, count of zero elements present in an array must be greater than size/2.

import java.util.Scanner;
public class SparseMatrixChecker
{
   	public static void main(String pankaj[] ) 
	{
        		Scanner scanner = new Scanner(System.in);

        		System.out.printf("\nInput the size of the matrix : ");
        		int size = scanner.nextInt();
		int matrix [] [] = new int[size][size];

        		System.out.printf("\nInput values of matrix :\n");
        		for (int i = 0; i < size; i++) 
		{
            			for (int j = 0; j < size; j++) 
			{
                			System.out.printf("element value of [%d] [%d] : ", i, j);
                			matrix[i][j] = scanner.nextInt();
            			}
        		}

		System.out.printf("\nDisplay the matrix.\n\n");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf(" %d\t", matrix [i] [j]);
			}
			System.out.println();
		}
        		int zeroCount = 0;

        		for (int i = 0; i < size; i++) 
		{
            			for (int j = 0; j < size; j++) 
			{
                			if (matrix[i][j] == 0) 
				{
                    				zeroCount++;
                			}
            			}
        		}

        		boolean flag = false;

        
        		if (zeroCount > (size * size) / 2) 
		{
            			flag = true;
        		}

        		if (flag) 
		{
            			System.out.printf("\nThe given matrix is sparse matrix.");
        		} else {
            			System.out.printf("\nThe given matrix is not a sparse matrix.");
        		}

        		System.out.printf("\nThere are %d number of zeros in the matrix", zeroCount);			
        		System.out.println();	
    }
}