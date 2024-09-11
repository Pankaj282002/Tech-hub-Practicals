import java.util.*;
class MergeArrays
{
	public static void main(String pankaj[])
	{
		int array1[] = new int[5];
		int array2[] = new int[5];
		int array3[] = new int[10];

		System.out.println("\nInput values of First Array.");
		takeInput(array1);
		System.out.println("\nInput values of Second Array.");
		takeInput(array2);

		System.out.printf("\nFirst Array  : ");
		printArray(array1);
		System.out.printf("\nSecond Array : ");
		printArray(array2);
		
		int count = 0;
		for(int i=0; i<array3.length; i++, count++)
		{
			if(count < array1.length)
			{
				array3[count] = array1[i];
			}else{
				array3[count] = array2[i-5];
			}
			
		}
		System.out.printf("\nMerged Array : ");
		printArray(array3);
		System.out.println();
	}
	public static void takeInput(int a[])
	{
		Scanner in = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("Enter %d element of array : ", i+1);
			a[i] = in.nextInt();
		}
		
	}
	public static void printArray(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.printf(" %d ", a[i]);
		}
	}
}