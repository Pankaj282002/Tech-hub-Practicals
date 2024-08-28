// print 1 to 100 odd numbers

public class oddNumbers
{
	public static void main(String pankaj[])
	{
		int start = 1;
		odd(start);
		
	}
	public static void odd(int start)
	{
		if(start<=100)
		{
			if(start%2 != 0)
			{
				System.out.printf("%d\t", start);
			}
			start++;
			odd(start);
		}
	}
}