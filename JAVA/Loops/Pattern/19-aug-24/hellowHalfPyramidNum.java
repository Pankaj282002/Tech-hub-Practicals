class hellowHalfPyramidNum
{
	public static void main(String pankaj[])
	{	
		boolean flag = true;
		int count = 2;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(j==(6-i) )
				{
					System.out.printf(" 1 ");
				}
				else if (j==(4+i)){
					System.out.printf(" %d ", i);
				}
				else if(i==5 && (j>=3 && j<=8) && flag)
				{
					System.out.printf(" %d ", count);
					flag = false;
					count++;
				}else{
					System.out.print("   ");
					flag = true;
				}	
				}
		System.out.println();
		}
	}
}