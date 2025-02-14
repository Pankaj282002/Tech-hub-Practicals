// date : 25/07/2024
// Write a program to check whether a alphabet is Uppercase or Lowercase alphabet.

import java.util.*;
public class CheckAlfabetApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a alfabet : ");
		char alfa = in.next().charAt(0);
		
		if(alfa >= 65 &&  alfa <= 90)
		{
			System.out.printf("%c is Uppercase alfabet \n", alfa);
		}
		else if( alfa >= 97 &&  alfa <= 122)
		{
			System.out.printf("%c us Lowercase alfabet \n", alfa);
		}
		else{
			System.out.printf("Please, Enter a alfabets only\n");
		}
	}
}