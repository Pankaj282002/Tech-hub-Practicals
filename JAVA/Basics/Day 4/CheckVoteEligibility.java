//Q12. write a program to read the age of a candidate and determine wheather he is elligible to vote.

import java.util.Scanner;
public class CheckVoteEligibility
 {
    public static void main(String[] args) 
	{
        	
		Scanner in = new Scanner(System.in);
        		System.out.print("Enter age: ");
        		int age = in.nextInt();

        		String result = (age < 0 || age > 100) ? 
                        	"Please enter a valid age between 0 and 100." : 
                        	(age >= 18 ? "You are eligible to vote." : "You are not eligible to vote.");
        
       
       		 System.out.println(result);
       		 in.close();
    	}
}