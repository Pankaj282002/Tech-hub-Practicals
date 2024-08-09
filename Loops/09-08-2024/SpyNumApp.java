// Identify the spy number.

import java.util.*;
public class SpyNumApp
{

	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a value : ");
	int num = in.nextInt();
	int temp = num;
	int sum=0;
	int product=1;

	while(temp>0)
	{
		int digit = temp%10;
		sum += digit;
		product *= digit;
		temp /=10;
	     }

	if(sum == product)
	{
		System.out.print("Number is spy number.");
	}
	else{
		System.out.print("Number is not spy number.");
	}
	
      }
}