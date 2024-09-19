import java.util.*;
class SortArray
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a size of Intiger array : ");
		int size1 = in.nextInt();
		if(size1<1)
		{
			System.out.printf("\nArray size is Invalid.\n");
			return;
		}
		int a[] = new int[size1];
		System.out.printf("\nEnter a values of array.\n");
		for(int i=0; i<size1; i++)
		{
			System.out.printf("Enter a %d element of array : ", i);
			a[i] = in.nextInt();
		}

		System.out.print("\nEnter a size of character array : ");
		int size2 = in.nextInt();
		if(size2<1)
		{
			System.out.printf("\nArray size is Invalid.\n");
			return;
		}
		char b[] = new char[size2];
		System.out.printf("\nEnter a values of array.\n");
		for(int i=0; i<size2; i++)
		{
			System.out.printf("Enter a %d element of array : ", i);
			b[i] = in.next().charAt(0);
		}
	
		System.out.printf("\nIntiger array before sort : ");
		displayInt(a, size1);
		sort(a, size1);
		System.out.printf("\nIntiger array after sort  : ");
		displayInt(a, size1);

		System.out.println();

		System.out.printf("\nCharacter array before sort : ");
		displayChar(b, size2);
		sort(b, size2);
		System.out.printf("\nCharacter array after sort  : ");
		displayChar(b, size2);

		System.out.println();
	}
	public static void sort(int a[], int size)
	{
		for(int i=0; i<size - 1; i++)
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
	public static void sort(char a[] , int size)
	{
		for(int i=0; i<size - 1; i++)
		{
			if(a[i] > a[i+1])
			{
				char temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				i = -1;
			}
		}
	}
	public static void displayInt(int a[] , int size)
	{
		for(int i=0; i<size; i++)
		{
			System.out.printf("%d ", a[i]);
		}	
	}
	public static void displayChar(char a[], int size)
	{
		for(int i=0; i<size; i++)
		{
			System.out.printf("%c ", a[i]);
		}
	}
	
}