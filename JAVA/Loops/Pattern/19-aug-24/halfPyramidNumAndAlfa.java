class halfPyramidNumAndAlfa
{
	public static void main(String pankaj[])
	{
		int sum =1;
		int alfa=65;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0){
					System.out.print(" "+ (char)alfa + " ");
					alfa++;
				}else{
					System.out.print(" "+ sum + " ");
					sum++;
				}
			}
		System.out.println();
		}
	}
}