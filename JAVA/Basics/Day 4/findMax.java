@ -1,21 +0,0 @@
// Q3. write a java program to find maximum between two numbers.

import java.util.*;
public class findMax
{
	public static void main(String x[])
	{
		// take numbes as input
		int firstNum, secondNum;
		String result;
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a first number : ");
		firstNum = in.nextInt();
		System.out.print("Enter a second number : ");
		secondNum = in.nextInt();
		
		result = (firstNum == secondNum) ? "equal to" : firstNum > secondNum ? "greater than" : "less than";
		System.out.printf("%d is %s  %d  \n ", firstNum, result, secondNum);

	}
}