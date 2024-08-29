class invertedPyramid
{
	public static void main(String pankaj[])
	{	
		for(int i=1; i<=8; i++)
		{	boolean flag = true;
			for(int j=1; j<=15; j++)
			{
				if(j>=(0+i) && j<=(16-i) && flag){
					System.out.print("*");
					flag = false;
				}else{
					System.out.print(" ");
					flag= true;
				}
			}
		System.out.println();
		}
	}
}