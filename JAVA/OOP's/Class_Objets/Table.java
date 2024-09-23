/*Q1. WAP to create class name as Table with two functions 
  void setNum(): this function can accept number from keyboard 
  void printTable(): this function can display the table of  number. */

import java.util.*;
public class Table
{
	int n;
	void setNum()
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number for print table : ");
		int n = in.nextInt();
		in.close();
	}
	void printTable()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.printf("%d X %d = %d \n", n, i, n*i);
		}
	}
}
public class Table
{
	public static void main(String pankaj[])
	{
		setNum in = new setNum();
		printTable p = printTable();
	}
}
