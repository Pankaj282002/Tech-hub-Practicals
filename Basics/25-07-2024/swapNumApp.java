// Q10. write a java program swap two number without using third variable.

public class swapNumApp
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		System.out.printf("Numbers before swaping : A = %d		B = %d ", a, b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.printf("\nNumbers after swaping : A = %d	B = %d", a, b);
	}	
}