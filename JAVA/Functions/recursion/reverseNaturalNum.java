// print all natural number in reverse form of given numbers.

import java.util.*;
public class reverseNaturalNum
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		
		reverseNatural(num);
		
	}
	public static void reverseNatural(int num)
	{
		if(num>0)
		{
			System.out.printf("%d\t", num);
			num--;
			reverseNatural(num);
		}
	}
}