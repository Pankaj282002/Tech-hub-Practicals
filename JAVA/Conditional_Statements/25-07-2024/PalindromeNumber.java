// date : 25/07/2024
// Write a program to check wherther a number is palindrome number or not.

import java.util.*;
public class PalindromeNumber{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a three digit number : ");
		int num = in.nextInt();
		int rev = ((num%10)*100)+ (((num/10)%10)*10)+(num/100);
		
		if(num == rev)
		{
			System.out.printf("%d is a palindrome number\n", num);
		}
		else 
		{
			System.out.printf("%d is not a palindrome number\n", num);
		}
		
	}
}