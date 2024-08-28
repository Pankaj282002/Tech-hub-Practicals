// write a program alfabets A to Z

public class alfabet
{
	static int start = 65;
	public static void main(String pankaj[])
	{
		alfabet();
	}
	public static void alfabet()
	{
		if(start<=90)
		{
			System.out.printf("%c\t", start);
			start++;
			alfabet();
		}
	}
}
