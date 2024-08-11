// WAP to print the ASCII value of a given character.

import java.util.*;
public class ASCIIfinder{
	
	public static void main(String x[])
	 {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character : ");
		char  alfabet = sc.next().charAt(0);

		int asiiValue = (int) alfabet; // Type Casting
		System.out.printf("ASII Value of Character %s is %d", alfabet , asiiValue);

	}
}