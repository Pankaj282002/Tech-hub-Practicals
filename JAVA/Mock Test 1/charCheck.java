// Q6. check character.

import java.util.*;
public class charCheck{
	public static void main(String x[]){

	Scanner in = new Scanner(System.in);  // instant of Scanner class 
	System.out.printf("\nEnter a character : ");
	char a = in.next().charAt(0);	// A
	
	for(int i=0; i<=127; i++){

	System.out.printf("%d is %c\n",i,i );
	}
	}
}