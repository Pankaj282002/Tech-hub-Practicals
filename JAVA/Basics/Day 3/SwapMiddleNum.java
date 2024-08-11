// Q3. write a program to enter any five digit number and verse middle number rather than first and last digit.

import java.util.*;
public class SwapMiddleNum
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		int no, first, last, swapMid;
		System.out.print("Enter a five digit number : ");
		no = in.nextInt();
		System.out.println("Number before swap : "+ no);

		// swap extract first and last digit from number 
		last = no%10;
		no = no/10;
		first = no/1000;
		no = no % 1000;
	
		// swap the middle numbers
		swapMid = ((no%10)*100) + (((no/10)%10)*10) + ((no/100)*1);

		// add first and last digit's and print
		first = first*10000;
		no = first + (swapMid*10) + last;
		System.out.println("Number after swap : " + no);
		in.close();
		
	}
}