// date : 25/07/2024
// Write a program to check whether a triangle is valid or not (by angles of triangle ).

import java.util.*;
public class CheckTriangleBYAngleApp{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a first angle : ");
		int fa = in.nextInt();
		System.out.printf("Enter a second angle : ");
		int sa = in.nextInt();
		System.out.printf("Enter a third angle : ");
		int ta = in.nextInt();
		int angle = fa + sa + ta;
		
		if(angle == 180)
		{
			System.out.printf("\nTriangle is valid\n");
		}
		else{
			System.out.printf("\nGiven triangle is not valid\n");
		}
	}
}