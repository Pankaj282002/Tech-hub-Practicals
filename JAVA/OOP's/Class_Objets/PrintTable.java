/*Q1. WAP to create class name as Table with two functions 
  void setNum(): this function can accept number from keyboard 
  void printTable(): this function can display the table of  number. */

import java.util.*;
class Table
{	Scanner in = new Scanner(System.in);
	static int n;
	void setNum()
	{
		System.out.printf("\nEnter a number for print table : ");
		int n = in.nextInt();
		//printTable(n);
		
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
/*
C:\Users\admin\Desktop\Tech hub Practicals\JAVA\OOP's\Class_Objets>javac PrintTable.java

C:\Users\admin\Desktop\Tech hub Practicals\JAVA\OOP's\Class_Objets>java PrintTable

Enter a number for print table : 5
0 X 1 = 0
0 X 2 = 0
0 X 3 = 0
0 X 4 = 0
0 X 5 = 0
0 X 6 = 0
0 X 7 = 0
0 X 8 = 0
0 X 9 = 0
0 X 10 = 0

C:\Users\admin\Desktop\Tech hub Practicals\JAVA\OOP's\Class_Objets> */

