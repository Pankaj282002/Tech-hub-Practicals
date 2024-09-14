import java.util.*;
class upperTriangularMatrix
{	
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nInput the size of the square matrix : ");
		int size1 = in.nextInt();
		System.out.printf("\nInput the size of the square matrix : ");
		int size2 = in.nextInt();
		
		if(size1 < 2 && size2 < 2)
		{
			System.out.printf("\nEnter matrix size more than 2");
			return;
		}
		else if(size1 != size2)
		{
			System.out.printf("\nMatrixs are not same. because of you enter diffrent sizes of both matrix.");
		}

		
		
	}
}