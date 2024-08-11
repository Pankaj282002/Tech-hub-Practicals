@ -1,22 +0,0 @@
// write a program to accept a coordinatepoints in an xy coordinate system and determine in which quadrant the coordinate point lies.

import java.util.*;
public class DetermineCoordinate
{
	public static void main(String args[])
	{
		// take input from user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value of x : ");
		int x = in.nextInt();
		System.out.print("Enter a value of y : ");
		int y = in.nextInt();

		String result;
		result = ( x>0 && y>0) ? " I quadrant" : ( x<0 && y>0 ) ? "  II quadrant" : ( x<0 && y<0 ) ? " III quadrant" : " IV quadrant";
		
		System.out.printf("(x,y) = (%d,%d) \n", x, y);
		System.out.printf("cordinate point lies on%s ", result);
	
	}
}