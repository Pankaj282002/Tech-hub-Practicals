import java.util.*;
class  IdentityMatrix
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a size of matrix : ");
		int size = in.nextInt();
		
		if(size<2)
		{
			System.out.println("Matrix size should be more than 2.");
			return;
		}

		int matrix [] [] = new int [size] [size];
		System.out.printf("\nEnter a value of matrix.\n");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.printf("Entere values of [%d] [%d] : ", i, j);
				matrix [i] [j] = in.nextInt();
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
			
		boolean flag = true;
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				if( i == j && matrix [i] [i] != 1)
				{
					flag = false; 
					break;
				}
				else if( i != j && matrix [i] [j] != 0 )
				{
					flag = false;
					break;
				}
			}
		}
			
		if(flag)
		{
			System.out.printf("\nMatrix is  identity matrix. ");
		}else{
			System.out.printf("\nMatrix is not  identity matrix. ");
		}
		System.out.println();
	}
}