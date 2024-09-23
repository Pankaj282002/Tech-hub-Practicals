/* Q3. WAP to create class name as Power with two functions 
   void setValue(): this function can accept base and index from keyboard
  int getPower(): this function can calculate power of number and return it. */

import java.util.Scanner;

class Power 
{
    	int base;
    	int index;

    	void setValue() 
	{
        		Scanner in = new Scanner(System.in);
				System.out.println();
        		System.out.print("Enter the base: ");
        		base = in.nextInt();
        		System.out.print("Enter the index: ");
        		index = in.nextInt();
    	}

    	void getPower() 
	{
        		int result = 1;
        		for (int i = 0; i < index; i++) 
            			result *= base;
		System.out.println();
        		System.out.println("The Power is = " + result);
    	}
}

public class Power_Print
{
    	public static void main(String pankaj []) 
	{
        		Power p = new Power();
        		p.setValue();
        		p.getPower();
    	}
}