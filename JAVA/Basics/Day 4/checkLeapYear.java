// Q5. write a program to check whether a year is leap year or not.

import java.util.*;
public class checkLeapYear
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a year : ");
		int year = in.nextInt();
		
		String result = year % 4 == 0 ? "leap" : "not leap";
	
		System.out.printf("%d is %s year \n", year, result);
	}
}