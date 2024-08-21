class halfPyramidAlfabetsReverse
{	
	public static void main(String x[])
	{	
		int i, j;
		for(i=1; i<=5; i++)
		{
			int count=65;
			for(j=1; j<=9; j++)
			{
				if(j>=(6-i) && j<=(4+i))
				{
					System.out.printf(" %c ", count);
					if(j<5){
						count++;
					}else{
						count--;
					}	
				}
			}
		System.out.println();
		}
	}
}