/*Q2. WAP create function name as 
public static void sum(int a[]): this function can accept integer array as parameter and calculate its sum
public static void sum(char[]): this function can accept character array and extract digit from it and cal sum it 
Example: abc123mno45s 
Output: 1+2+3+4+5 */

import java.util.*;
public class SumOfNumberInString
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter size of array : ");
		int size = in.nextInt();
		if(size<1)
		{
			System.out.printf("\nInvalid size entered. please enter a valade size : ");
			return ;
		}
		char array [] = new char[size];
		sum(array, size, in);
		int sum = sum(array, size);
		System.out.printf("\nArray is : ");
		for(int i =0; i<size; i++)
		{
			System.out.printf("%c", array[i]);
		}
		if(sum == 0)
		{
			System.out.printf("\nNumbers are not present in the Array.\n");
		}else{
			System.out.println("\nSum of number present in the array is : " + sum);
		}
	}
	public static void sum(char a[], int size, Scanner in)
	{
		System.out.printf("\nEnter a cahracter values in array : \n");
		for(int i=0; i< size; i++)
		{
			System.out.printf("Enter a %d value of array : ", i);
			a[i] = in.next().charAt(0);
		}
	}
	public static  int sum(char a[], int size)
	{
			int sum = 0;
			for(int i=0; i< a.length; i++)
			{
				if(a[i] >=48 && a[i] <= 57)
				{
					sum += (a[i] - 48);
				}
			}
		return sum;
	}
}
