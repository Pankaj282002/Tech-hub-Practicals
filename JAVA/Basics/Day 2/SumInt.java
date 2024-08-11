// Q3. write a program and cumpute the sum of an integer's digit

import java.util.*;
public class SumInt
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Eneter a three digit number : ");
		int no = in.nextInt();
		int rev = (no%10) + ((no/10)%10) + (no/100);
		System.out.print("Sum of the Number is : " + rev);
	}
}