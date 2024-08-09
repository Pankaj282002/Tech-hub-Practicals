// Q.4 write a program to calculate sum digits of a number;

import java.util.*;
public class SumOfDigitNum{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();

		int sum = 0;
		while(num > 0){
		
		int lastDigit = num%10;
		sum = sum + lastDigit;
		num = num / 10;
		
		}
		System.out.print("Sum of all digits is : "+ sum);
	}
}