// date : 25/07/2024
// Write a program to check wherther a number is possitive, negative or zero.

import java.util.*;
public class CheckPossitiveNegativeApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();

		if(num > 0 )
		{
			System.out.printf("%d is possitive number",num);
		}
		else if(num < 0){
			System.out.printf("%d is nagative number",num);
		}
		else{
			System.out.println("number is zero");
		}
		

	}
}