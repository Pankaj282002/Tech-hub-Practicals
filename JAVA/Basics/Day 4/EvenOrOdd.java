// write a java program to check wheather number is even or odd.

import java.util.*;

public class EvenOrOdd{

	public static void main(String x[])
	{
		// teke number as input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = in.nextInt();
		
		String result = (num%2 == 0) ? "Even" : "Odd";
		System.out.printf("%d  is %s number ", num, result);
	
	}
}