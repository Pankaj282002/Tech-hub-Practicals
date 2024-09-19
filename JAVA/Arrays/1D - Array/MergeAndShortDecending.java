import java.util.*;
class MergeAndShortDecending
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nInput the number of elements to be stored in the first array : ");
		int size1 = in.nextInt();
		int array1[] = new int[size1];
		System.out.printf("\nEnter a element values of first array.\n");
		input(array1, size1, in);

		System.out.printf("\nInput the number of elements to be stored in the first array : ");
		int size2 = in.nextInt();
		int array2[] = new int[size2];
		System.out.printf("\nEnter a element values of second array.\n");
		input(array2, size2, in);
		
		int result [] = new int [size1 + size2] ;
		
		System.out.printf("\nFirst Array : ");
		display(array1, size1);
		System.out.printf("\nFirst Array : ");
		display(array2, size2);

		for(int i=0; i<result.length; i++)
		{
			if(i<size1)
			{
				result [i] = array1[i];
			}else{
				result [i] = array2[size1 - i];
			}
		}
	
		for(int i=0; i<result.length -1; i++)
		{
			if(result [i] < result [i + 1])
			{
				int temp = result[i];
				result[i] = result[i +1];
				result[i +1] = temp;
				i = -1;
			}
		}
		
		System.out.printf("\nFirst Array : ");
		display(result, (size1 + size2) -1);

		System.out.println();
	}
	public static void input(int a[] , int size, Scanner in)
	{
		for(int i=0; i<size; i++)
		{
			System.out.printf("Enter %d element of array : ", i);
			a[i] = in.nextInt();
		}
	}
	public static void display(int a[] , int size)
	{
		
		for(int i=0; i<size; i++)
		{
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}
}
