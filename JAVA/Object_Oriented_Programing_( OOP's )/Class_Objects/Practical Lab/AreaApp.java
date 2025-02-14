// 1). WAP to create the class name as Circle with a following methods 

import java.util.*;
import java.lang.*;

class Circle 
{ 
	int r;
	void setRadius()
	{ 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Radius of circle : ");
		r = in.nextInt();
	} 
	void showArea() 
	{ 	double area = r * Math.pow(3.14, 2);
		System.out.println("Area of Circle is  : " + area);
	} 
} 
public class AreaApp 
{ 
	public static void main(String pankaj[]) 
	{ 
		Circle c = new Circle();
		c.setRadius();
		c.showArea();
	} 
}