// Q1. write a program to declare two variable qty and rate and calculate its total bill with 18% gst.

import java.util.*;
public class BillCal{
	public static void main(String x[]){
	
		Scanner in = new Scanner(System.in);
		
		int qty, rate, total, totalAmount;
		System.out.printf("\nquantity of product : ");
		qty = in.nextInt();
		System.out.print("price fo product : ");
		rate = in.nextInt();
		System.out.println("----------------------------------");

		total = qty*rate;
		int gst = (total*18)/100;
		totalAmount = total + gst;
		
		System.out.printf("Total : %d Rs\n",total);
		System.out.printf("Tax : %d  Rs\n",gst);
		System.out.println("----------------------------------");
		System.out.printf("Total Bill : %d Rs\n",totalAmount);
	
	}

}