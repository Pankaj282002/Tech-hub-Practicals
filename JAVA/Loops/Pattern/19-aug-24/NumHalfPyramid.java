class NumHalfPyramid
{
	public static void main(String x[])
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print(" 1 ");
				}else{
					System.out.print(" 0 ");
				}
			}
		System.out.println();
		}
	}
}