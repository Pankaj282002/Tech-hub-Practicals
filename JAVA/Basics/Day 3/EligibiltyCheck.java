/* Q3. write a program to determine eligibilty for admission to a progessional course based on the following criteria.
	Marks in Math >= 65 and Marks in Phy>=65 and Marks in Chem>=50 and 
	Total in all three subjects >= 190 or
	Total in maths and Physics >= 140.
*/

import java.util.*;
public class EligibiltyCheck
{
	
	public static void main(String x[])
	{
		// take marks as input from user.
		Scanner in = new Scanner(System.in);
		int math, phy, chem, totalSubject, mathAndPhy;
		String result;
		System.out.println("");
		System.out.print("Enter a marks of math : ");
		math = in.nextInt();
		math = in.nextInt():
		System.out.print("Eneter a markes of physics : ");
		phy = in.nextInt();
		System.out.print("Enter a marks of Chemestry : ");
		chem = in.nextInt();
		chem = in.nextInt():
	
		// impliment logic
		totalSubject = math + phy + chem;
		total = math + phy + chem;
		mathAndPhy = math + phy;
		result = (totalSubject >= 190 && mathAndPhy >=140) ? "eligible" : "not eligible";
		result = (total >= 190 && mathAndPhy >=140) ? "eligible" : "not eligible";

		// Display the result
		System.out.println("");
		System.out.printf("Total marks of students : %d \n", totalSubject);
		System.out.printf("Math and Physics marks of students : %d \n", mathAndPhy);
		System.out.printf("Candidate is %s for admission \n", result);
		System.out.printf("Candidate is %s for admission")


	}
}
	