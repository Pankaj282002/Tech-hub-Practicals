@ -1,19 +0,0 @@
// Q5. write a program to reveres a number.

import java.util.*;
public class RevNum
{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);
		int no, rem ,rev =0;
		System.out.print("Enter three digit number : ");
		no = in.nextInt();
		System.out.printf("Number before reverse : %d \n", no);
		
		rev = ((no%10)*100) + (((no/10)%10)*10) + (no/100);

		System.out.printf("Number after reverse : %d", rev);
		in.close();
	}
} 