// Q5. write a java program to enter two angles of a triangle and find the third angle.

import java.util.Scanner;
public class FindAngleOfTriangle
{
	
public static void main(String x[]){
	int firstAngle, secondAngle;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a fist angle of a circel : ");
	firstAngle = sc.nextInt();
	System.out.print("Enter a second angle of a circle : ");
	secondAngle = sc.nextInt();

	int thirdAngle = 180 - (firstAngle + secondAngle);
	System.out.printf("The angle of triangle is %d , %d , %d ", firstAngle, secondAngle, thirdAngle);
}
}