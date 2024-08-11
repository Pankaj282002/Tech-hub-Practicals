/* Accept the no. of days from the user and calculate the charge fro library according to following.
	Till 5 days :	Rs. 2/day
	6 to 10 days :	Rs. 3/day
	11 to 15 days :	Rs. 4/day
	after 15 days :	Rs. 5/day.
*/

import java.util.*;
public class LibraryChargesApp
{
	public static void main(String x[])
	{
		// take days input from user 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a days : ");
		int days = in.nextInt();
		
		// impliment logics
		int charges = days <= 5 ? days*2 : (days > 5 && days <= 10) ? days*3 : (days > 10 && days <= 15) ? days*4 : days > 15 ? days*5 : days;
		System.out.printf("days : %d \n", days);
		System.out.printf("Chargers = %d", charges);	
	}
}