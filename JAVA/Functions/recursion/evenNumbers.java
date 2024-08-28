// print 1 to 100 even numers

public class evenNumbers
{
	static int start = 1;
	public static void main(String pankaj[])
	{
		even();
	}
	public static void even()
	{
		if(start<=100)
		{
			if(start%2==0)
			{
				System.out.printf("%d\t", start);
			}
			start++;
			even();
		}
	
	}
}