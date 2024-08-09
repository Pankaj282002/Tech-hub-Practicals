// Armstrong Number for any digit number.

import java.util.*;
import java.lang.*;
public class ArmstrongNum{

	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a Number : ");
	int num = in.nextInt();
	int temp = num;
	double arm = 0;
	int tempNum = num;
	int count = 0;

	while(tempNum>0)  // this look identifying the digit on number and store in the count variable .	
	{	int var = tempNum%10;
		count++;
		tempNum = tempNum/10;
	}
	while(num>0)
	{	int digit = num%10;
		arm = arm + Math.pow(digit, count);
		num = num/10;
	}

	if(arm == temp)
	{
		System.out.print("Number is Armstrong.");
	}
	else{
		System.out.printf("Number is not Armstrong.");
	}

        }
}