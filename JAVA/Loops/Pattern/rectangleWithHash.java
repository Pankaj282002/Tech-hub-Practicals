class rectangleWithHash
{
	public static void  main(String pankaj[])
	{
		boolean flag = true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(flag){
					System.out.print(" * ");
					flag = false;
				}else{
					System.out.print(" # ");
					flag = true;
				}
			}
		System.out.println();
		}
	}
}