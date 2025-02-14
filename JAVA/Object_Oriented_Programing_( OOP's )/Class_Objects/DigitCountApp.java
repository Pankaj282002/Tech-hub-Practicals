/*
B. WAP to create class name as CountDigit with two functions
 void setValue(int no): this function accept integer as parameter 
 int getDigitCount(): this function can count the digit from and return its count. */

import java.util.*;
class CountDigit
{
	int num, count = 0;
	int setValue()
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a Number : ");
		num = in.nextInt();
		return num;
	}
	int getDigitCount()
	{	
		while(num!=0)
		{
			int rem = num%10;
			num/=10;
			count++;
		}
		return count;
	}
}
public class DigitCountApp
{
	public static void main(String pankaj[])
	{
		CountDigit cd = new CountDigit();
		cd.setValue();
		System.out.println("The number  is a " + cd.getDigitCount() + " digit number");
	}
}
