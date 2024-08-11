// Q2. write a java program to ceck whether triangle is valid or not.

import java.util.*;
public class CheckTriangle
{
	public static void main(String x[]){
	
	// take input from user 
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a first angle of triangle : ");
	int fSide = in.nextInt();
	System.out.print("Enter a second angle of triangle :");
	int sSide = in.nextInt();
	System.out.print("Enter a third angle of triangle : ");
	int tSide = in.nextInt();

	int total = fSide + sSide +tSide;
	String result = total == 180 ? "valid" : "not valid";
	
	System.out.printf("This is the %s  triangle \n", result);

	}
}