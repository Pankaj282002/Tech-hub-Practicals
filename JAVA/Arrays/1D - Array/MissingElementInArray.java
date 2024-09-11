import java.util.*;
class MissingElementInArray
{
	public static void main(String pankaj[])
	{
		int array[] = new int[5];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a values of array.\n");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("Enter %d element of array : ", i+1);
			array[i] = in.nextInt();
		}
		Short(array);
		
		System.out.printf("\npresent element of array in assending order : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf(" %d ", array[i]);
			
		}
		System.out.printf("\nMising element of array in assending order  : ");
		for(int i=0; i<array[array.length -1];i++)
		{
			boolean flag = true;
			for(int j=0; j<array.length; j++)
			{
				if(i == array[j])
				{
					flag = false;
				}
				
			}
			if(flag) System.out.printf(" %d ", i);
		}
		System.out.println();

		
	}
	public static void Short(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] > a[i+1])
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				i = -1;
			}
		}
	}
}