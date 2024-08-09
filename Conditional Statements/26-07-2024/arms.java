// Q. write a java program to find maximum between three numbers.

import java.lang.*;
import java.util.*;
public class arms{
	public static void main(String x[]){
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter number : ");
		int num = in.nextInt();

		int firstDigit = num/100;
		int midDigit = (num/10)%10;
		int lastDigit = num%10;
		double sum = Math.pow(firstDigit, 3) + Math.pow(midDigit, 3) + Math.pow(lastDigit, 3);
		
		if(sum == num){
			System.out.print("number is Armstrong number.");
		}
		else {
			System.out.print("number is not Armstrong number.");
		}
		
		
		
}
}

