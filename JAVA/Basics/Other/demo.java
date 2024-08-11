

import java.util.*;
public class demo{
	public static  void main(String x[]){
		
		Scanner in  = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		
		
		
		System.out.printf("A %d  b = %d\n",a, b);
		
		
	}
}
