/*
A. WAP to create class name as RectArea with two functions 
     void setLengthWidth(int width,int length): this function accept two parameter 
    void showArea(): this function can calculate area and display it. */

import java.util.*;
class RectArea
{
	int w , l;
	void seLength(int width, int length)
	{
		w = width;
		l = length;
	}	
	void showArea()
	{
		System.out.printf("\nArea of rectangle is %d ", w*l);
	}
}
public class RectAreaApp
{
	public static void main(String pankaj[])
	{	
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a width of rectangle : ");
		int width = in.nextInt();
		System.out.printf("Enter a length of rectangle : ");
		int length = in.nextInt();
		
		RectArea r = new RectArea();
		r.seLength(width, length);
		r.showArea();
		System.out.println();
		
	}
}
