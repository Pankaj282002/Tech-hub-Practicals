/* Q5. Accept the fllowing from the user and calculate the percentage of cllass attended.
	1. total no. of days.
	2. total no. of days for absent.
If percentage less 75% student will not be able to sit in exam.
*/

import java.util.*;
public class ClassPresenty{
	public static void main(String x[])
	{
		// take input from user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Total no. of Days : ");
		int totalDays = in.nextInt();
		System.out.print("Eneter a days for absent : ");
		int absentDays = in.nextInt();
		
		// impliment a logic
		int presentDays = totalDays - absentDays;
		int percentage = (presentDays / totalDays)*100;
		String result = percentage >= 75 ? "eligible" : "not eligible";

		// display the output on screen 
		System.out.printf("class percentage is %d % student will %s to sit in exam\n", percentage, result);
		
	}
}