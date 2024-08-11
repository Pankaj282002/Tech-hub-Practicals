// Q2. write a program to print sum of all even numbers between 1 to nth numbers.

import java.util.*;
public class FindSumOfEven{
	public static void main(String x[]){

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = in.nextInt();
		
		int i = 1, sum = 0;
		while(i <= num){
			if(i%2 == 0){
				sum = sum + i;
				}
			i++;
		}
		System.out.printf("Sum of 1 to %d even number is %d", num, sum);
}
}