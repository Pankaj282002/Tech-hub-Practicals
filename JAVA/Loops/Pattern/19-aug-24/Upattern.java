class Upattern
{
	public static void main(String pankaj[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1 || j==5 || i==5)
				{
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
		System.out.println();
		}
	}
}