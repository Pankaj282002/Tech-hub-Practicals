// Q1. write a program to print sum of all natural number 1 to n th term.

import java.util.*;
public class SumOfNaturalNum{

	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		
		int i = 1, sum = 1;
		while(i<=num){
			
			sum = sum + i;
			i++;
		}
	System.out.print("Sum : "+ sum);
	
}
}