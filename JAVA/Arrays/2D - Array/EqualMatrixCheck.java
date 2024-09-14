import java.util.*;
class EqualMatrixCheck
{	
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nInput the size of the first matrix : ");
		int size1 = in.nextInt();
		System.out.printf("Input the size of the second matrix : ");
		int size2 = in.nextInt();
		
		if(size1 < 2 && size2 < 2)
		{
			System.out.printf("\nEnter matrix size more than 2");
			return;
		}
		else if(size1 != size2)
		{
			System.out.printf("\nMatrixs are not same. because of diffrent sizes of both matrix.\n");
			return;
		}

		int matrix1 [] [] = new int [size1] [size1];
		int matrix2 [] [] = new int [size2] [size2];

		System.out.printf("\nEnter a values of first matrixs.\n");
		Input(matrix1);
		System.out.printf("\nEnter a values of second matrixs.\n");
		Input(matrix2);

		System.out.printf("\nDisplay the first matrixs.\n");
		display(matrix1);
		System.out.printf("\nDisplay the second matrixs.\n");
		display(matrix2);
		
		boolean flag = true;
		for(int i=0; i<size1; i++)
		{
			for(int j=0; j<size1; j++)
			{
				if(matrix1 [i] [j] != matrix2 [i] [j] )
				{
					flag = false;
					break;
				}
			}
		}
	
		if(flag)
		{
			System.out.printf("\nBoth matrix are equal size and values.");
		}else{
			System.out.printf("\nBoth matrix are equal size but diffrent values.");
		}
		System.out.println();
			
	}
	public static void Input(int a[] [])
	{
		Scanner in = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.printf("Enter a element of [%d] [%d] : ", i,j);
				a[i] [j] = in.nextInt();
			}
		}
		
	}

	public static void display(int a[] [])
	{	
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.printf(" %d\t", a[i] [j]);
			}
			System.out.println();
		}
	}
}