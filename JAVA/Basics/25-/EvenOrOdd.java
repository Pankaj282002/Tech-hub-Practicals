// Q2. Write a program in java to check whether a number is even or odd using bitwise operator.

import java.util.*;
public class EvenOrOdd{
	public static void main(String x[]){
		
		Scanner in = new Scanner(System.in);
		int num;
		System.out.printf("\nEnter a number : ");
		num = in.nextInt();
	
		String check = (num & 1) == 0 ? "even" : "odd";
		System.out.printf("%d is %s", num, check);

	}
}