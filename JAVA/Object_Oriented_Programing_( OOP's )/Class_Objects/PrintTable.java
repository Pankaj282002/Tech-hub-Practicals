/*Q1. WAP to create class name as Table with two functions 
  void setNum(): this function can accept number from keyboard 
  void printTable(): this function can display the table of  number. */

import java.util.*;
class Table
{	
	int n;
	void setNum()
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number for print table : ");
		n = in.nextInt();
		in.close();
	}
	void printTable()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.printf("%d X %d = %d \n", n, i, n*i);
		}
	}
}
public class PrintTable
{
	public static void main(String pankaj[])
	{
		Table in = new Table();
		in.setNum();
		in.printTable();
	}
}