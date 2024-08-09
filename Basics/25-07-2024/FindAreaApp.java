@ -1,22 +0,0 @@
// Q1. write a java program to enter side of square and find its area.

import java.util.Scanner;
public class FindAreaApp {
	
	public static void main(String x[]){

	int side=0;
	

	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter side of square : \t");
	side = sc.nextInt();//5
	


	int area = side*side;
	System.out.printf("Area of a square is %d\n",area);
	
		
	}
}