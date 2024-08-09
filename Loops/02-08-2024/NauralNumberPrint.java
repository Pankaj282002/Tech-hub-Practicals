// Q1. Write a C program to print all natural numbers from 1 to n. - using while loop

import java.util.*;
public class NauralNumberPrint{

	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = in.nextInt();
	while(num<=0){

		System.out.print(num);
		num--;
		
		}
}
}