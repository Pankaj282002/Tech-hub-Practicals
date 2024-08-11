// Q2. write a program to enter any number and swap first and last digit of a number.

import java.util.*;
public class SwapFirstAndLastDigit
{
	public static void main(String x[])
	{
		int no, first, last;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a five digit number : ");
		no = in.nextInt();
		System.out.print("Number before swaping : " + no);
		
		// extract and delete first and last digit from the number
		last = no%10;
		no = no/10;
		first = no/1000;
		no = no%1000;

		// Swap first and last digit number
		last = last*10000;
		no = last + (no*10) + first;
		
		System.out.printf("\nNumber after swaping : %d", no);
		in.close();
		
	}
}