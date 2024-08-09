// Q1. write a program in java to swap two numbers using bitwise operator.

import java.util.*;
public class SwapApp{
	
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a value of A : ");
		int fn = in.nextInt();
		System.out.print("Enter a value of B : ");
		int sn = in.nextInt();

		System.out.printf("Befor swaping A = %d\t B = %d\n",fn, sn);
		fn = fn^sn;
		sn = fn^sn;
		fn = fn^sn;

		System.out.printf("After swaping A = %d\t B = %d\n",fn, sn);
	}
}