// date : 25/07/2024
// Write a program to check wherther a number is possitive, negative or zero.

import java.util.*;
public class ElectionEligiblityApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int age = in.nextInt();

		if(age>=0 && age<18){
			System.out.printf("Your age is %d years old You are not eligile for vote.", age);
		}
		else if(age>=18 && age< 105){
			System.out.printf("Your age is %d years old you are eligilbe for vote.", age);
		}
		else{
			System.out.println("Please, enter a valid age");
		}	
	}
}