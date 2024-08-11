// Q9. write a program to find minimum bitween two numbers.

import java.util.*;
public class findMin
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a first number :");
		int fn = in.nextInt();
		System.out.print("Enter a second number : ");
		int sn = in.nextInt();
		
		String result = fn == sn ? "both are same" : fn < sn ? "first number is minimum " : "second number is minimum";
		System.out.printf("%s \n", result);
	}
}