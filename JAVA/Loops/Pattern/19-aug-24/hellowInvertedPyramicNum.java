class hellowInvertedPyramicNum
{
	public static void main(String pankaj[])
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(6-i); j++)
			{
				if(i==1 && (j>=1 && j<=4))
				{
					System.out.printf(" %d ",j);
				}else if(j==(6-i)){
					System.out.print(" 5 ");
				}else if(j==1 && (i>=2 && i<=4))
				{
					System.out.printf(" %d ", i);
				}else{
					System.out.print("   ");
				}
			}
		System.out.println();
		}
	}
}