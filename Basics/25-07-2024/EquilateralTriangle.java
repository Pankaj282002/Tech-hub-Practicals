// Q6. write a java program to calculate area of an equilateral triangle.

import java.util.*;
import java.lang.*;
public class EquilateralTriangle
{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);	
	System.out.print("Enter value of side of a square:");
	int side = sc.nextInt();
	float area = (float)(Math.sqrt(3)/4)*(side*side);
	
	System.out.printf("Area of Equilateral Triangle is %.2f ", area);
	
	}
}