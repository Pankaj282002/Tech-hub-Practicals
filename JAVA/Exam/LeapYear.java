// Q3. Leap Year or Not.

import java.util.*;
public class LeapYear{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);	// Scanner obj.
	System.out.printf("\nEnter a year.");
	int year = in.nextInt();	// 2024 .
	
	if(year%4 == 0){ 
	// if year is leap 
	System.out.println("Year is a leap year.");
		}
	else{ 	
	// if year is not leap
	System.out.print("Year is not a leap year");
	}
   }
}