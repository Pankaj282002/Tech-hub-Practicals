// Q8. menu prongram

import java.util.*;
public class MenuProgram{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);

	// print option to user.
	System.out.printf("\nEnter 1 for Find Area of Rectangel.\n");
	System.out.println("Enter 2 for Find area of Rriangle.");
	System.out.println("Enter 3 for Calculate area of equilateral triangle.");

	// take chose from user
	System.out.print("Chose a Number : ");
	int num = in.nextInt();

	// initialize variable.
	int fs, ss, ts;

	switch(num){
	
	// find area of rectangle.
	case 1 : 
	System.out.printf("\nEnter a side of rectangle : ");
	int side = in.nextInt();
	int areaOfRec = side*side;
	System.out.print("Area of Rectangel is : " + areaOfRec);
	break;
	
	// find area of triangle.
	case 2 :
	System.out.printf("\nEnter a first side of triangle : ");
	fs = in.nextInt();
	System.out.printf("\nEnter a second side of triangle : ");
	ss = in.nextInt();
	System.out.printf("\nEnter a third side of triangle : ");
	ts = in.nextInt();
	int areaOfTri = fs + ss + ts;
	System.out.print("Area of Triangle is : " + areaOfTri);
	break;

	// calculate area of equilateral triangle.
	case 3 :
	System.out.printf("\nEnter a first side of triangle : ");
	fs = in.nextInt();
	System.out.printf("\nEnter a second side of triangle : ");
	ss = in.nextInt();
	System.out.printf("\nEnter a third side of triangle : ");
	ts = in.nextInt();
	
	if(fs == ss && ss == ts){
	System.out.println("Triangle is equilateral triangle.");
	}
	else{
	System.out.println("Triangle is not a equilateral triangle.");
	}
	break;
	
	// Default when input is incorrect.
	default : 
	System.out.println("Please chose a valid options. bitween 1 to 3.");
	}
	}

}