// date : 25/07/2024
// Write a program to check wherther a year is leap year or ordinary year.

import java.util.*;
public class CheckLeapYearApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int year = in.nextInt();

		if(year%4 == 0){
			System.out.printf("%d is a leap year", year);
		}
		else{
			System.out.printf("%d is not a leap year", year);
		}
	}
}