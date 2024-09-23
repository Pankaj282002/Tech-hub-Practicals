import java.util.*;
class twoDarray
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		int array[][] = new int[3][3];
		
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.printf("Enter (%d, %d) element of array : ", i,j);
				array[i][j] = in.nextInt();
			}
		}

		System.out.println();
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.printf("%d\t", array[i][j]);
			}
			System.out.println();
		}
	}
}