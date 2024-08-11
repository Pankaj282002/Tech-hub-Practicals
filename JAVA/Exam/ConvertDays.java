// Q2. conver days into year, monts, weeks & days.

import java.util.*;
public class ConvertDays{
	public static void main(String x[]){

	// Scanner obj create.
	Scanner in = new Scanner(System.in);
	// take input from user.
	System.out.printf("\nEnter Days : ");
	int days = in.nextInt();
	
	// convert days to year, monts, weeks and days.
	int year = days/360;
	int monts = (days%360)/30;
	int weeks = monts/ 8;
	

	// print output.
	System.out.printf("%d = %d years %d monts %d weeks ", days, year, monts, weeks,);
}

}