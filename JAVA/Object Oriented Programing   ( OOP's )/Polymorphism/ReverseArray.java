/* Q3. WAP create two function name as 
void rev(char[]) this function can accept character array and reverse it
void rev(int []):this function can accept integer array and reverse it. */

import java.util.*;
public class ReverseArray
{ 
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a size of intiger array : ");
		int IntSize = in.nextInt();
		int IntArray [] = new int[IntSize];
		System.out.println("Enter a vlues of intiger array : ");
		for(int i=0; i<IntSize; i++)
		{
			System.out.printf("Enter a value of %d element of array : ");
			IntArray[i] = in.nextInt();
		}
		System.out.println();

		System.out.printf("\nEnter a size of character array : ");
		int CharSize = in.nextInt();
		int CharArray [] = new int[CharSize];
		System.out.println("Enter a vlues of character array : ");
		for(int i=0; i<CharSize; i++)
		{
			System.out.printf("Enter a value of %d element of array : ");
			CharArray[i] = in.next().charAt(0);
		}
		System.out.println();

		Print(IntArray);
		Print(CharArray);

		

	}
	public static void Print(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d\t", a[i]);
		}
		System.out.println();
	}
	public static void Print(char a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%c\t", a[i]);
		}
		System.out.println();
	}
	public static void rev(int a[])
	{
		for(int i =0; i<(a.length/2); i++)
		{
			int temp = a[i] ;
			a[i] = a[5-i];
			a[5-i] = temp;
		}
	}
	
}
