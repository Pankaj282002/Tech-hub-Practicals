import java.util.*;
class SumOfIntAndChar
{
	public static void main(Stirng pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size of  intiger array : ");
		int Intsize = in.nextInt();
		System.out.print("Enter a size of character array : ");
		int Charsize = in.nextInt();
		
		int IntArray [] = new int [Intsize];
		char IntArray [] = new char [Charsize];

		for(int i=0; i<Intsize; i++)
		{
			System.out.printf("Enter a %d element of Intiger Array",i);
			IntArray [i] = in.nextInt();
		}
		for(int i=0; i<Charsize; i++)
		{
			System.out.printf("Enter a %d element of Character Array",i);
			IntArray [i] = in.next().charAt(0);
		}
		System.out.printf()
	}
	public static int sum(int a[])
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum +=a[i];
		}
		return sum;
	}
	public static void sum(char a[])
	{

	}
	
}