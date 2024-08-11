// Q8. write a program to input cost price and selling pricre fo a product and check profit or loss.

import java.util.*;
public class ProfitOrLoss
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		int costPrice, sellingPrice;
		String result;
		System.out.printf("\nEnter a cost price of product : ");
		costPrice = in.nextInt();
		System.out.print("Enter a selling price of product : ");
		sellingPrice = in.nextInt();

		result = costPrice == sellingPrice ? " nutral " : costPrice < sellingPrice ? "profit" : "loss";
		

		System.out.printf(" You buy a product in %d Rs and sells at %d Rs then you makes %s on the product\n",costPrice, sellingPrice, result);
	}

}