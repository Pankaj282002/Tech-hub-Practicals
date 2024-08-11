@ -1,21 +0,0 @@
// write a program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
public class checkDivisiblity
{
	public static void main(String x[])
	{
	 	// Take a input from user
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();

		String divFive = num%5 == 0 ? "divisible" : "not divisible";
		String divElev = num%11 == 0 ? "divisible" : "not divisible";

		System.out.printf("\n%d is %s by 5 \n%d is %s by 11 \n", num, divFive, num, divElev);
		 
		
	}

}