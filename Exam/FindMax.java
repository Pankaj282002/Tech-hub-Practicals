//Q7. find maximm number .

import java.util.*;
public class FindMax{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);	// scanner obj.

	// take first number
	System.out.printf("\nEnter a value of A : ");
	int a = in.nextInt();
	
	// take second number
	System.out.printf("\nEnter a value of B : ");
	int b = in.nextInt();
	
	// take third number
	System.out.printf("\nEnter a value of C : ");
	int c = in.nextInt();

	// check condition for A	if(a>b && a>c){
	System.out.println("A is greater than B and C");
	}
	// check condition for b
	if(b>a && b>c){
	System.out.println("B is greater than A and C");
	}
	// check condition for c
	if(c>a && c>b){
	System.out.println("C is greater than A and B");
	}
	// all are equal
	if(a == b && b==c){
	System.out.print("all num are equal.");
	}

	}

}