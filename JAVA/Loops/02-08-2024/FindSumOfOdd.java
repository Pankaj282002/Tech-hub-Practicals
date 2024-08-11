// Q2. write a program to print sum of all even numbers between 1 to nth numbers.

import java.util.*;
public class FindSumOfOdd{
public static void main(String x[]){

	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = in.nextInt();

	int sum = 0, i = 1;
	while(i <= num){
		if(i % 2 != 0){
			sum = sum + i;
		}
		i++;
	}
	System.out.printf("Sum of all odd numbers between 1 to %d is %d", num, sum);

	}
}