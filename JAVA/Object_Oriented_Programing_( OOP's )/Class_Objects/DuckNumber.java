 /*
Q4. WAP to create class name as Duck with two functions 
 void acceptNumber(): this function can accept number from keyboard
boolean isDuck(): this function can return if number is duck otherwise return false  */

import java.util.*;
class Duck
{
	int num;
	void acceptNumber()
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number to check Duck or not : ");
		num = in.nextInt();
		in.close();
	}
	boolean isDuck()
	{
		while(num!=0)
		{
			int rem = num % 10;
			if(rem == 0)
			{
			 	return true;
			}
			num /= 10;
		}
		return false;
	}
}
public class DuckNumber
{
	public static void main(String pankaj[])
	{
		Duck dn = new Duck();
		dn.acceptNumber();
		boolean result = dn.isDuck();
		if(result)
		{
			System.out.printf("The given number is a duck number.");
		}else{
			System.out.printf("The given number is not a duck number.");
		}
		System.out.println();
	}
}
