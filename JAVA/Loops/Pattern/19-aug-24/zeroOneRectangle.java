class zeroOneRectangle{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(flag)
				{
					System.out.print(" 0 ");
					flag = false;
				}else{
					System.out.print(" 1 ");
					flag = true;
				}
			}
		System.out.println();
		}
	}
}