// Q2. write a java program to enter radius of a circle and find its diameter, circumference.

public class FindDiameter{
	public static void main(String x[]){
	
	int radius = Integer.parseInt(x[0]);
	int diameter = 2*radius;
	double circumference = 2*3.14*radius;
	
	System.out.println("Deameter of circle is :  "+ diameter);
	System.out.println("Circumference of circle is : "+ circumference);
	
	}
}