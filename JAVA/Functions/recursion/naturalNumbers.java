// print natural number upto nth term.

import java.util.*;
public class naturalNumbers
{
	static int count=1;
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a Number : ");
		int num = in.nextInt();

		naturalNumbers(num);
	}
	public static void naturalNumbers(int num)
	{
		if(count<=num)
		{
			System.out.printf("%d\t", count);
			count++;
			naturalNumbers(num);
		}
	}
}