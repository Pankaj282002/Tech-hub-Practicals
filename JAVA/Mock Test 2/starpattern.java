class starpattern
{
	public static void main(String pankaj[])
	{
		int count=0;
		for(int i=1; i<=15; i++)				// outer loop 
		{
			if(i<=8){
					count++;
				}else{
					count--;
				}
			for(int j=1; j<=count; j++){
				System.out.print(" * ");
			}				
		System.out.println();
		}					// outer loop closed
	}
}