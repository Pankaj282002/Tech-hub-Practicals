@ -1,20 +0,0 @@
// Q2. write a java program to conver seconnds to hours, minutes and seconds.

import java.util.*;
public class TimeConverter
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of seconds : ");
		int totalSeconds = in.nextInt();
		
		int hours = totalSeconds / 3600;
      		int minutes = (totalSeconds % 3600) / 60;
        		int seconds = totalSeconds % 60;

		System.out.print("%d means %d hrs : %d min : %d sec ", totalSeocnds, hours, minutes, seconds );
		in.close();
	
	}
}