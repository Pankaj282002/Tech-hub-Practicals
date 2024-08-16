class invertedHalfPyramidHash{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=2; j<=6; j++)
			{
				if(j <= (7-i))
				{
					System.out.print("   ");
				}else{
					if(i%2==0){
					System.out.print(" # ");
					}else{
					System.out.print(" * ");
					}
					
				}
			} // inner clsed.
		System.out.println();
		}//outer closed.
	}
}