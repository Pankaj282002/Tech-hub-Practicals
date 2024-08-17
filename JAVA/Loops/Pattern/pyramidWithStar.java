class pyramidWithStar
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				
				if( j>=(6-i) && j<=(4+i)  && flag)
				{
					if(i%2 == 0){
					System.out.print(" * ");
					}else{
						System.out.print(" # ");
					}
					flag = false;
				}else{
					System.out.print("   ");
					flag = true;
				}
			}
		System.out.println();
		}
	}
}