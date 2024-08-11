// write a java programto accept two integer and check wheather they are equal or not.

import java.util.*;
public class CheckEqual
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a first value : ");
		int fn = in.nextInt();
		System.out.print("Enter a second value : ");
		int sn = in.nextInt();
		
		String result = fn == sn ? "equal" : "not equal";
		System.out.printf("The both number are %s \n", result);
	}
}