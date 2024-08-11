/* Q4. write a program to accept the cost price of a bike and display the road tax to be paid according to the following criteria.

cost price (in Rs)				tax
>100000					15%
>500000	and <= 100000			10%
<= 50000					5%
*/

import java.util.*;
public class BikeTax
{
	public static void main(String x[])
	{
		// take price as input from user
		int price, tax,total;
		Scanner in = new Scanner(System.in);
		System.out.println("");
		System.out.print("Enter a price of bike :");
		price = in.nextInt();
		
		// impliment logic 
		tax = price < 50000 ? (price*5)/100 : (price >= 50000 && price < 100000) ? (price*10)/100 : (price >= 100000) ? (price*15)/100 : price;
		total = price + tax;
		
		// display the resul on screen
		System.out.printf("Bike price : %d Rs \n", price);
		System.out.printf("taxes : %d Rs \n", tax);
		System.out.printf("Bike price with tax : %d Rs\n", total);
	}
}