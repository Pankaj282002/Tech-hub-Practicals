// Q1. check even or odd using ternary

import java.util.*;
public class EvenOrOdd{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in); // Scanner class instatnt created
		System.out.printf("\nEnter a Number : ");
		int num = in.nextInt();	// take input from user.

		String result = (num%2 == 0) ? " Even " : " Odd "; 	// condition check using ternary operator.
		// Print output
		System.out.printf("%d is %s number.", num, result);
	}
}