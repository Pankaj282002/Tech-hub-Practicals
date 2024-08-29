// Q4. Reverse Num.

import java.util.*;
public class ReverseNum{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);	// Scanner obj.
	System.out.printf("\nEnter a Number : ");
	int num = in.nextInt();	// 453.
	int rev = ((num%10)*100 + ((num/10)%10)*10 + num/100);		// reversing num.
	
	// print reverse num
	System.out.printf("reverse no : %d", rev);
	
	}
}