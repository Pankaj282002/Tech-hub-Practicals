class AlfaRectangle
{
	public static void main(String pankaj[])
	{
		for(int i=1; i<=5; i++)
		{
			int alfa = 64;
			char var = (char)(alfa + i);
			for(int j=1; j<=5; j++)
			{
				System.out.print(" "+ var + " ");
				var++;
			}
		System.out.println();
		}
	}
}