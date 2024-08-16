public class hellowInvertedhalfPyramid
{
	public static void main(String pankaj[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=(7-i); j++)
			{
				if( (i>=2 && i<=4) &&  (j>=2 && j<=(6-i)) )
				{
					System.out.print(" ");
				}
				else
				{ 
					System.out.print("*");
				}
			}// inter closed.
		System.out.println("");
		}// outer closed.
	}
}