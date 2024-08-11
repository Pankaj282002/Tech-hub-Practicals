/*Q1. write a program to calculate electricity bill as per following data. 

Units		Charge
First 50 units	Rs. 0.50 / unit
Next 100 units	Rs. 0.75 / unit
Next 100 units	Rs. 1.25 / unit
Above 250 units	Rs . 1.50 / units

An Additional charge 20% is added to the bill. */

import java.util.*;
public class ElectricityBillCal
{
	public static void main(String x[])
	{
		// take units as a input from user 
		Scanner s= new Scanner(System.in);
		double units;
		System.out.print("Enter a value of units : ");
		units = s.nextDouble();
		
		// applying the conditions using ternary operatior 
		double bill, addCharge, total;
		bill = units<51 ? units*0.50 : (units > 50 && units <= 150 ) ? 25+(units-50)*0.75 : (units > 150 && units <= 250) ? 100+(units-150)*1.20 : (units > 250 ) ? units*1.50 : 220+(units-250)*1.5;
		addCharge = (bill*0.2);
		total = bill + addCharge;
		System.out.println(""):

		// Display the output on screen 
		System.out.println("Units :  "+ units + " units");
		System.out.println("bill : "+ bill + " Rs");
		System.out.println("additional charges : "+ addCharge + " Rs");
		System.out.println("total bill : " + total + " Rs");
	}
}	