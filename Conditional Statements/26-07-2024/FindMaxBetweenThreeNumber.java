// Q. write a java program to find maximum between three numbers.

import java.util.*;
public class FindMaxBetweenThreeNumber{
	public static void main(String x[]){
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a first number : ");
		int fn = in.nextInt();
		System.out.printf("Enter a second number : ");
		int sn = in.nextInt();
		System.out.printf("Enter a third number : ");
		int tn = in.nextInt();

		
		if(fn > sn && fn > tn )
		{
			System.out.printf("First number %d is maximum number.", fn );
		}
		else if(sn > fn && sn > tn )
		{
			System.out.printf("Second number %d is maximum number.", sn);
		}
		else if(tn > fn && tn > sn )
		{
			System.out.printf("Third number %d is maximum number.", tn);
		}
		else {
			System.out.printf("Equal number is detected, enter a diffrent numbers. ");
		}
		
}
}

