// date : 25/07/2024
// Write a program to find maximum between 2 numbers.

import java.util.*;
public class FindMaximumNumberApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a value of A : ");
		int fn = in.nextInt();
		System.out.print("Enter a value of B : ");
		int sn = in.nextInt();

		if(fn > sn)
		{
			System.out.printf("%d is maximum number\n", fn);
		}
		else if(sn > fn)
		{
			System.out.printf("%d is maximum number \n", sn);
		}
		else{
			System.out.printf("Both number are same\n");
		}
	}
}