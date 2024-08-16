public class hellowRec{
	public static void main(String pankaj[])
	{
		for(int i = 1; i<=3; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i==2 && (j==2 ||j==3 || j==4))
				{
					System.out.print("   ");
				}
				else{
					System.out.print(" * ");
				}
			}
			System.out.printf("\n");
		}
	}
}