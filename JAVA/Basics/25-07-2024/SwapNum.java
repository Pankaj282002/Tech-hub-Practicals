// Q9. write a java program to swap two number using third variable.

public class SwapNum
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		System.out.printf("Numbers before swaping : A = %d  ,  B = %d  \n", a, b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("Numbers after swaping is : A = %d , B = %d ", a, b);

	}
}