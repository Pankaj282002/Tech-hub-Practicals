// Q11. write a program to check wheather number is possitive or negative.

import java.util.*;
public class checkPossitiveOrNagative
{
	public static void  main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		
		String result = num > 0 ? "possitive" : "negative";
		System.out.printf("%d is %s number \n", num, result);
	}
}