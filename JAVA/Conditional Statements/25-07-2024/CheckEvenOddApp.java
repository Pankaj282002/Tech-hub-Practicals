// date : 25/07/2024
// Write a program to check wherther a number is even or odd.

import java.util.*;
public class CheckEvenOddApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		
		if(num%2 == 0){

			System.out.printf("%d is even number", num);
		}
		else{
			System.out.printf("%d is odd number\n",num);
		}

	}
}