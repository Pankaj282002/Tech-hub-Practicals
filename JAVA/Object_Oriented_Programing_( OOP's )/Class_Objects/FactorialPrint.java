/* Q2. WAP to create class name as Factorial with two functions 
 void setNo(): this function can accept number from keyboard 
void showFactorial(): this function can calculator factorial of number and display it  */

import java.util.*;
class Factorial
{
	int num;
	void setNo()
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a Numbebr for print Factorial : ");
		num = in.nextInt();
		System.out.println();
	}
	void showFactorial()
	{	int fact =1;
		for(int i = num; i>=1; i--)
		{
			fact *= i;
			
		}
		System.out.printf("Factorial of %d is = %d ", num, fact);
		System.out.println();
	}
}
public class FactorialPrint
{
	public static void main(String pankaj[])
	{
		Factorial fact = new Factorial();
		fact.setNo();
		fact.showFactorial();
	}
}
