class invertedpyramid{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++ )
			{
				if(j<=(8+i) && j>=(9-i))
				{
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}// inner closed.
		System.out.println();
		} // outer closed.
	}
}