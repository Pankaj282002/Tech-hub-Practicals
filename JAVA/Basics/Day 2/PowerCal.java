@ -1,20 +0,0 @@
// Q3. write a java program that reads a number and display the cube, and fourth power.

import java.util.*;
import java.lang.*;

public class PowerCal
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Value : ");
		double value = in.nextInt();
		double cube = Math.pow(value, 3);
		double fourth = Math.pow(value, 4);
		
		System.out.printf("cube of the value is : %.2f \n", cube);
		System.out.printf("fourtrh power of the value is : %.2f", fourth);

	}
}